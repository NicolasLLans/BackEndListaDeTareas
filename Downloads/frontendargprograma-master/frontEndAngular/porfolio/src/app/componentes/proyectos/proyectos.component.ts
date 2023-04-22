import { Component } from '@angular/core';
import { DataService } from 'src/app/data.service';
import { GeneralService } from 'src/app/general.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent {
  proyectoList:any;
  constructor(public generalService: GeneralService, private dataService:DataService){}
  


  
  ngOnInit(): void{
    this.dataService.misProyectos$.subscribe(data => {
      this.proyectoList = data;
    });
  }
}


