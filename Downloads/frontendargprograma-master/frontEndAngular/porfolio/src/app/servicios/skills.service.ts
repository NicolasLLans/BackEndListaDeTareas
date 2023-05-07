import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {

  skills:any;
  constructor(private http:HttpClient) { }

  public editarSkills(id:number, skills:any):Observable<any>{
    return this.http.put<any>("http://localhost:8080/api/skills/"+ id, skills);
  }


  public crearSkills(skills: any):Observable<any>{
    return this.http.post<any>("http://localhost:8080/api/skills", skills);
  }

  
  public eliminarSkills(id:number):Observable<void>{
    return this.http.delete<void>("http://localhost:8080/api/skills/"+ id);
  }
}
