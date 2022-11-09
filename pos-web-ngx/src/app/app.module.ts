import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {AppRoutes} from './app.routes';
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";
import {routes} from "./app.routes"
import {FoodHomeComponent} from "./food/food-home.component";
import {FoodHomeService} from "./service/food-home.service";

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes, { useHash: false, enableTracing :true }),
  ],
  providers: [FoodHomeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
