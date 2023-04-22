import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { LoginComponent } from './componentes/login/login.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { SkillsComponent } from './componentes/skills/skills.component';


const routes: Routes = [
  {path: '', component: EncabezadoComponent},
  {path: 'encabezado', component: EncabezadoComponent},
  {path: 'educacion', component: EducacionComponent},
  {path: 'experiencia', component: ExperienciaComponent},
  {path: 'skills', component: SkillsComponent},
  {path: 'proyectos', component: ProyectosComponent},
  {path: 'iniciar-sesion', component: LoginComponent},
  {path: '**', component: EncabezadoComponent},
  
]

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
