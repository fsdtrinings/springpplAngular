import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { SearchAccountComponent } from './search-account/search-account.component';
import { ViewAllDataComponent } from './view-all-data/view-all-data.component';


const routes:Routes = [
  {path:'',redirectTo:'viewall',pathMatch:'full'},
  {path:'search',component:SearchAccountComponent},
  {path:'viewall',component:ViewAllDataComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    SearchAccountComponent,
    ViewAllDataComponent

  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
