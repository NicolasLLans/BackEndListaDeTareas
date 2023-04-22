import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Personas } from '../modelos/personas';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonasService {
  persona:Personas | undefined;
  constructor(private http:HttpClient) { }

  public editarPersona(id:number, persona:Personas):Observable<Personas>{
    return this.http.put<Personas>("http://localhost:8080/api/personas/"+ id, persona);
  }


  // public crearPersona(persona: Personas):Observable<Personas>{
  //   return this.http.post<Personas>("http://localhost:8080/api/personas", persona);
  // }

  
  // public eliminarPersona(id:number):Observable<void>{
  //   return this.http.delete<void>("http://localhost:8080/api/personas/"+ id);
  // }
}
