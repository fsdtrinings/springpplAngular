import { Component, OnInit } from '@angular/core';
import { Account } from '../account';
import { AccountServiceService } from '../account-service.service';

@Component({
  selector: 'app-view-all-data',
  templateUrl: './view-all-data.component.html',
  styleUrls: ['./view-all-data.component.css']
})
export class ViewAllDataComponent implements OnInit {

  accountArr:Account[] = [];
  constructor(private service:AccountServiceService) { 
    this.service.getAllAcount().subscribe(
      data=>{
        this.accountArr = data;
        console.log(this.accountArr);
      },
      error=>{

      }
    );

  }

  ngOnInit(): void {
  }

}
