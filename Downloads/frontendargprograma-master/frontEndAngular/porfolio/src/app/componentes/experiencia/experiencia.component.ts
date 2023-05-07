import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Subject } from 'rxjs';
import { DataService } from 'src/app/data.service';
import { GeneralService } from 'src/app/general.service';
import { Experiencia } from 'src/app/modelos/experiencia';
import { ExperienciasService } from 'src/app/servicios/experiencias.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})

export class ExperienciaComponent {
  experienciaList: any;
  private experienciaActualizada = new Subject<void>();
  public formulario!: FormGroup;


  constructor(public generalService: GeneralService,private dataService:DataService, private formBuilder: FormBuilder,private experienciaService: ExperienciasService){
    this.formulario = this.formBuilder.group({
      id: ['', [Validators.required]],
      titulo: ['', [Validators.required]],
      fechaIni: ['', [Validators.required]],
      fechaFin: ['', [Validators.required]],
      descripcion: ['', [Validators.required]],
      img: ['', [Validators.required]]
    });

  }

  ngOnInit(): void{
    this.dataService.misExperiencias$.subscribe(data => {
      this.experienciaList = data;
    });

    this.experienciaActualizada.subscribe(() => {
      this.dataService.actualizarMisExperiencias(); // Actualizar los datos en el servicio
    });
  }

  editarExperiencia() {
    const id = this.formulario.value.id;
    const experiencia = this.formulario.value;
    this.experienciaService.editarExperiencia(id, experiencia).subscribe(
      (response: Experiencia) => {
        console.log(response);
        this.experienciaList = experiencia;
        this.experienciaActualizada.next(); // Emitir el Subject para actualizar los datos

        this.formulario.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  eliminarExperiencia(){
    const experienciaId = this.formulario.value.id;
  console.log("eliminar Exp")
  this.experienciaService.eliminarExperiencia(experienciaId).subscribe(
    () => {
      this.experienciaActualizada.next(); // Emitir el Subject para actualizar los datos

      this.formulario.reset();
    },
    (error: HttpErrorResponse) => {
      alert(error.message);
    }
  );
  }

  agregarExperiencia(){
    const experiencia = this.formulario.value;
  console.log(experiencia)
  this.experienciaService.crearExperiencia(experiencia).subscribe(
    (response: Experiencia) => {
      console.log(response);
      this.experienciaList = experiencia;
      this.experienciaActualizada.next(); // Emitir el Subject para actualizar los datos

      this.formulario.reset();
    },
    (error: HttpErrorResponse) => {
      alert(error.message);
    }
  );
  }
}
