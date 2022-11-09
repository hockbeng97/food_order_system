import { Routes } from '@angular/router';

import { FoodHomeComponent } from './food-home.component';

export const routes:Routes = [
  {
    path: '',
    component: FoodHomeComponent,
    children: [
      { path: 'test', component: FoodHomeComponent },
    ]
  },
];
