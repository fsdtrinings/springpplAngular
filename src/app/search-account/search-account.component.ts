import { Component, OnInit } from '@angular/core';
import { AccountDTO } from '../account-dto';
import { AccountServiceService } from '../account-service.service';

@Component({
  selector: 'app-search-account',
  templateUrl: './search-account.component.html',
  styleUrls: ['./search-account.component.css']
})
export class SearchAccountComponent implements OnInit {


  service:AccountServiceService;
  accountdto:AccountDTO = new AccountDTO(0,'',0,'','','',0);
  isDataFetched:boolean = false;
  constructor(service:AccountServiceService) {
    this.service = service;
    
   }

   
  ngOnInit(): void {
  }

  doGetAccountInfo(accId : string)
  {
    console.log("account id is : - "+accId);
    let searchAccountId:number = parseInt(accId);
    this.service.getAcountInfo(searchAccountId).subscribe(
      data=>{  // data contains information of account
        this.accountdto = data;
        this.isDataFetched = true;
        console.log('Data is fetched '+data+'  verify :- '+this.accountdto.firstName);
      },
      error=>{
        this.isDataFetched = false;
        console.log(error);
      }
    );



  }
}
