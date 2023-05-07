import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProyectosService {

  
  constructor(private http:HttpClient) { }

  public editarProyectos(id:number, proyectos:any):Observable<any>{
    return this.http.put<any>("http://localhost:8080/api/proyectos/"+ id, proyectos);
  }


  public crearProyectos(proyectos: any):Observable<any>{
    return this.http.post<any>("http://localhost:8080/api/proyectos", proyectos);
  }

  
  public eliminarProyectos(id:number):Observable<void>{
    return this.http.delete<void>("http://localhost:8080/api/proyectos/"+ id);
  }
}
