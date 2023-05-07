import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Subject } from 'rxjs';
import { DataService } from 'src/app/data.service';
import { GeneralService } from 'src/app/general.service';
import { Proyectos } from 'src/app/modelos/proyectos';
import { ProyectosService } from 'src/app/servicios/proyectos.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent {
  proyectoList: any;
  private proyectoActualizada = new Subject<void>();
  formulario: FormGroup;

  constructor(public generalService: GeneralService, private dataService: DataService, private formBuilder: FormBuilder, private proyectosService: ProyectosService) {
    this.formulario = this.formBuilder.group({
      id: ['', [Validators.required]],
      titulo: ['', [Validators.required]],
      fechaIni: ['', [Validators.required]],
      fechaFin: ['', [Validators.required]],
      descripcion: ['', [Validators.required]],
      img: ['', [Validators.required]],
      link: ['', [Validators.required]]
    });
  }




  ngOnInit(): void {
    this.dataService.misProyectos$.subscribe(data => {
      this.proyectoList = data;
    });

    this.proyectoActualizada.subscribe(() => {
      this.dataService.actualizarMisProyectos(); // Actualizar los datos en el servicio
    });
  }
  editarProyectos() {
    const id = this.formulario.value.id;
    const proyecto = this.formulario.value;
    this.proyectosService.editarProyectos(id, proyecto).subscribe(
      (response: Proyectos) => {
        console.log(response);
        this.proyectoList = proyecto;
        this.proyectoActualizada.next(); // Emitir el Subject para actualizar los datos

        this.formulario.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  eliminarProyectos() {
    const proyectoId = this.formulario.value.id;
    console.log("eliminar Exp")
    this.proyectosService.eliminarProyectos(proyectoId).subscribe(
      () => {
        this.proyectoActualizada.next(); // Emitir el Subject para actualizar los datos

        this.formulario.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  agregarProyectos() {
    const proyecto = this.formulario.value;
    console.log(proyecto)
    this.proyectosService.crearProyectos(proyecto).subscribe(
      (response: Proyectos) => {
        console.log(response);
        this.proyectoList = proyecto;
        this.proyectoActualizada.next(); // Emitir el Subject para actualizar los datos

        this.formulario.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }


}


