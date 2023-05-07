import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EducacionesService {


  constructor(private http:HttpClient) { }

  public editarEducacion(id:number, educacion:any):Observable<any>{
    return this.http.put<any>("http://localhost:8080/api/educacion/"+ id, educacion);
  }


  public crearEducacion(educacion: any):Observable<any>{
    return this.http.post<any>("http://localhost:8080/api/educacion", educacion);
  }

  
  public eliminarEducacion(id:number):Observable<void>{
    return this.http.delete<void>("http://localhost:8080/api/educacion/"+ id);
  }
}
