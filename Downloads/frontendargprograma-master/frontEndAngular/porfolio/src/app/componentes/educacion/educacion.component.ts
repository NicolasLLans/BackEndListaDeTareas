import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { GeneralService } from 'src/app/general.service';
import { HttpClient } from '@angular/common/http';
import { DataService } from 'src/app/data.service';


@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent {
  public formulario!: FormGroup;
  educacionList:any;

  constructor(public generalService: GeneralService, private formBuilder: FormBuilder, private http: HttpClient,private dataService:DataService) {
    this.formulario = this.formBuilder.group({
      id: ['', [Validators.required]],
      titulo: ['', [Validators.required]],
      fechaDeInicio: ['', [Validators.required]],
      fechaDeFinal: ['', [Validators.required]],
      descripcion: ['', [Validators.required]],
      imagen: ['', [Validators.required]]
    });
  }

  ngOnInit(): void{
    this.dataService.misEducaciones$.subscribe(data => {
      this.educacionList = data;
    });
  }

  editarEducacion(){
    console.log("editar EDU")
  }

  eliminarEducacion(){
    console.log("editar EDU")
  }

  agregarEducacion(){
    console.log("editar EDU")
  }

}

