import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthenicateService {

  constructor(private httpClient: HttpClient) { }

  public login(password: any): any {
    let url = 'http://localhost:8080/login?password=' + password;
    return this.httpClient.get(url);
  }
}
