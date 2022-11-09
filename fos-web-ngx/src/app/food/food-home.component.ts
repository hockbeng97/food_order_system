import {Component, OnInit} from "@angular/core";
import {FoodHomeService} from "../service/food-home.service";

@Component(
  {
    templateUrl: './food-home.component.html'
  })


export class FoodHomeComponent implements OnInit
{

  form = {
    data: {
      food: <string> ""
    }
  }


  constructor(private foodHomeService : FoodHomeService) {
  }

  ngOnInit(){
    console.log('home init')
  }

  onClickPrintAll() {
    console.log('clicking ...')
    console.log(this.foodHomeService.printTeaAll())
    console.log(this.foodHomeService.printTeaAll().subscribe())
    this.foodHomeService.printTeaAll().subscribe(res => {
      console.log(res)
      this.form.data.food = res[0]
      console.log(res[0])
    })
  }
}
