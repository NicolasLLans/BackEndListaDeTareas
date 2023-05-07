import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Personas } from './modelos/personas';

@Injectable({
  providedIn: 'root'
})
export class GeneralService {
 public vistabtn: boolean = false;
 public iniciar:boolean = false;
 public btnLog:boolean=true;

  constructor(private http:HttpClient) { }


public obtenerInfo(): Observable<Personas[]>{
  return this.http.get<Personas[]>("http://localhost:8080/api/personas");
}

public obtenerInfoEdu(): Observable<any>{
  return this.http.get<any>("http://localhost:8080/api/educacion");
}

public obtenerInfoExp(): Observable<any>{
  return this.http.get<any>("http://localhost:8080/api/experiencia");
}

public obtenerInfoSkills(): Observable<any>{
  return this.http.get<any>("http://localhost:8080/api/skills");
}

public obtenerInfoProy(): Observable<any>{
  return this.http.get<any>("http://localhost:8080/api/proyectos");
}


}
