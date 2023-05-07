import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ExperienciasService {

  
  constructor(private http:HttpClient) { }

  public editarExperiencia(id:number, experiencia:any):Observable<any>{
    return this.http.put<any>("http://localhost:8080/api/experiencia/"+ id, experiencia);
  }


  public crearExperiencia(experiencia: any):Observable<any>{
    return this.http.post<any>("http://localhost:8080/api/experiencia", experiencia);
  }

  
  public eliminarExperiencia(id:number):Observable<void>{
    return this.http.delete<void>("http://localhost:8080/api/experiencia/"+ id);
  }
}
