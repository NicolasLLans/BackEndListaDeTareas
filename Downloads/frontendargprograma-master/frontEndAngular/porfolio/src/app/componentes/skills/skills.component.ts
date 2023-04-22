import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DataService } from 'src/app/data.service';
import { GeneralService } from 'src/app/general.service';


@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent {

  public formulario!: FormGroup;
  skillsList:any;
  
  constructor( public generalService: GeneralService, private formBuilder: FormBuilder, private dataService:DataService){
    this.formulario = this.formBuilder.group({
      id: ['', [Validators.required]],
      titulo: ['', [Validators.required]],
      porcentaje: ['', [Validators.required]],
      imagen: ['', [Validators.required]]
    });
  }

  editarSkills() {
    console.log(this.formulario.value)
  }

  ngOnInit(): void{
    this.dataService.misSkills$.subscribe(data => {
      this.skillsList = data;
    });
  }
  
}
