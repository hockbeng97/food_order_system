import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { routes } from './food-home.routes';
import {FoodHomeComponent} from "./food-home.component";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    FormsModule,

  ],
  declarations: [ FoodHomeComponent ]
})
export class FoodHomeModule {
  public static routes = routes;
}
