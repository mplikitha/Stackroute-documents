import { Injectable } from '@angular/core';
import {CardComponent} from './card/card.component';
import { HttpClient } from '@angular/common/http';
import { MovieDetails } from './movie';
import { Observable } from 'rxjs';
import {Http} from '@angular/http';
@Injectable({
  providedIn: 'root'
})
export class CardService {
//    private  url = 'http://www.omdbapi.com/?s=bahubali&apikey=12dba97a';
//  //  private  url = '/assets/data/detail.json';
//   constructor(private http: HttpClient) { }
//  getWhishList(): Observable<MovieDetails[]> {

//  return this.http.get<MovieDetails[]>(this.url);
// }

constructor (private http: Http) { }
  get(path: string) {
    return this.http
      .get('www.omdbapi.com/?s=' + path)
      .map((res) => res.json());
  }
}
