import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'main',
    loadChildren: () => import('./food/food-home.module').then(x => x.FoodHomeModule)
  },

  // { path: '', redirectTo: 'main', pathMatch: 'full' },
  // { path: '**', redirectTo: 'main' },
];

export class AppRoutes { }
