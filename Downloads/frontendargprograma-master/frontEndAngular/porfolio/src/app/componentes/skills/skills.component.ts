import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Subject } from 'rxjs';
import { DataService } from 'src/app/data.service';
import { GeneralService } from 'src/app/general.service';
import { Skills } from 'src/app/modelos/skills';
import { SkillsService } from 'src/app/servicios/skills.service';


@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent {

  public formulario!: FormGroup;
  skillsList:any;
  private skillsActualizada = new Subject<void>();
  
  constructor( public generalService: GeneralService, private formBuilder: FormBuilder, private dataService:DataService, private skillsService:SkillsService){
    this.formulario = this.formBuilder.group({
      id: ['', [Validators.required]],
      titulo: ['', [Validators.required]],
      porcentaje: ['', [Validators.required]],
      img: ['', [Validators.required]]
    });
  }

  ngOnInit(): void{
    this.dataService.misSkills$.subscribe(data => {
      this.skillsList = data;
    });

    this.skillsActualizada.subscribe(() => {
      this.dataService.actualizarMisSkills(); // Actualizar los datos en el servicio
    });
  }
  
  editarSkills() {
    const id = this.formulario.value.id;
    const skills = this.formulario.value;
    this.skillsService.editarSkills(id, skills).subscribe(
      (response: Skills) => {
        console.log(response);
        this.skillsList = skills;
        this.skillsActualizada.next(); // Emitir el Subject para actualizar los datos

        this.formulario.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  eliminarSkills(){
    const skillsId = this.formulario.value.id;
  console.log("eliminar Exp")
  this.skillsService.eliminarSkills(skillsId).subscribe(
    () => {
      this.skillsActualizada.next(); // Emitir el Subject para actualizar los datos

      this.formulario.reset();
    },
    (error: HttpErrorResponse) => {
      alert(error.message);
    }
  );
  }

  agregarSkills(){
    const skills = this.formulario.value;
  console.log(skills)
  this.skillsService.crearSkills(skills).subscribe(
    (response: Skills) => {
      console.log(response);
      this.skillsList = skills;
      this.skillsActualizada.next(); // Emitir el Subject para actualizar los datos

      this.formulario.reset();
    },
    (error: HttpErrorResponse) => {
      alert(error.message);
    }
  );
  }

}
