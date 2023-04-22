import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DataService } from 'src/app/data.service';
import { GeneralService } from 'src/app/general.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})

export class ExperienciaComponent {
  experienciaList: any;

  public formulario!: FormGroup;


  constructor(public generalService: GeneralService,private dataService:DataService, private formBuilder: FormBuilder){
    this.formulario = this.formBuilder.group({
      id: ['', [Validators.required]],
      titulo: ['', [Validators.required]],
      fechaDeInicio: ['', [Validators.required]],
      fechaDeFinal: ['', [Validators.required]],
      descripcion: ['', [Validators.required]],
      imagen: ['', [Validators.required]]
    });

  }

  editarExperiencia() {
    console.log(this.formulario.value)

  }

  ngOnInit(): void{
    this.dataService.misExperiencias$.subscribe(data => {
      this.experienciaList = data;
    });
  }
}
