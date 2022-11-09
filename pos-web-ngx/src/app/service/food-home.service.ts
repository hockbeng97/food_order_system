import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {HttpClient, HttpParams} from "@angular/common/http";

@Injectable()
export class FoodHomeService {
  static readonly URL = 'http://localhost:8080/rest';

  constructor(private http: HttpClient) {
  }

  printTeaAll(): Observable<string[]> {
    const headers = new Headers();
    headers.append('Content-Type', 'application/x-www-form-urlencoded');

    console.log('posting request')
    return this.http.post<string[]>(`${FoodHomeService.URL}/food-home/print-tea`, null);
  }

  // originalPrintTeaAll(): Observable<Map<string, any>> {
  //   const headers = new Headers();
  //   headers.append('Content-Type', 'application/x-www-form-urlencoded');
  //
  //   const params = new HttpParams()
  //     .append('documentNumber', <string><any>null);
  //
  //   console.log('posting request')
  //   return this.http.post<Map<string, any>>(`${FoodHomeService.URL}/food-home/print-tea`, {headers : headers}, {params});
  // }

}
