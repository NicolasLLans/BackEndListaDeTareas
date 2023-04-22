import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DataService } from 'src/app/data.service';
import { GeneralService } from 'src/app/general.service';
import { Personas } from 'src/app/modelos/personas';
import { PersonasService } from 'src/app/servicios/personas.service';



@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent {
  miPorfolio:any;
  public formulario!: FormGroup;

  constructor(public generalService: GeneralService,private dataService: DataService, public personasService:PersonasService, private formBuilder:FormBuilder){
    this.formulario = this.formBuilder.group({
      id: [],
      nombre: ['', [Validators.required]],
      apellido: ['', [Validators.required]],
      titulo: ['', [Validators.required]],
      localidad: ['', [Validators.required]],
      descripcion: ['', [Validators.required]],
      fotoPerfil: ['', [Validators.required]],
      fotoBanner: ['', [Validators.required]]

    });
  }

ngOnInit(): void{
  this.dataService.miPorfolio$.subscribe(data => {
    this.miPorfolio = data;
  });
}


editarPerfil() {
  this.personasService.editarPersona(this.miPorfolio.id, this.formulario.value).subscribe(
    (response: Personas) => {
      console.log(response);
      this.miPorfolio = this.formulario.value;// Actualizar los datos locales con los datos del formulario
    },
    (error: HttpErrorResponse) => {
      alert(error.message);
    }
  );
}

}