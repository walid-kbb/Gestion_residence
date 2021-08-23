import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from './admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  private baseUrl = "http://127.0.0.1:8080/all";

  constructor(private httpClient : HttpClient) { }

  getAdminsList () : Observable<Admin []>{
    console.log(this.baseUrl);
    return this.httpClient.get<Admin []>(this.baseUrl);


  }
}
