import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import {  Observable } from 'rxjs';
import { AccountDTO } from './account-dto';
import { Account } from './account';

@Injectable({   // @Autowire
  providedIn: 'root'
})
export class AccountServiceService {

  constructor(private http:HttpClient) { }

  baseEndPoint:string = 'http://localhost:8080/bank';
  
  accountInfoEndPoint = this.baseEndPoint+'/client/account/';
  allAccountsEndPoint = this.baseEndPoint+'/admin/accounts';

  getAcountInfo(accountId:number):Observable<AccountDTO>
  {
    let endPoint = this.accountInfoEndPoint+''+accountId;
    console.log('End point to hit '+endPoint);

    return this.http.get<AccountDTO>(`${endPoint}`);
  }


  getAllAcount():Observable<Account[]>
  {
    console.log('End point to hit '+this.allAccountsEndPoint);
    return this.http.get<Account[]>(`${this.allAccountsEndPoint}`);
  }





}//end class
