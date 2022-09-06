import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { NuevoUsuario } from '../model/nuevo-usuario';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = 'https://backendsm.herokuapp.com/personas/';
  
  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.URL + 'traer/perfil');
  }

  public savePersona(nuevoUsuario: NuevoUsuario): Observable<any>{
    return this.http.post<any>(this.savePersona + 'create', nuevoUsuario);
  }
}
