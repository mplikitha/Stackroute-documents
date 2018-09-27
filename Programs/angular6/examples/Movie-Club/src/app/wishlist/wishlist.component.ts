import { Component, OnInit } from '@angular/core';
import { CardService } from '../card.service';
import {Observable} from 'rxjs/Observable';
import {Movie} from './'
@Component({
  selector: 'app-wishlist',
  templateUrl: './wishlist.component.html',
  styleUrls: ['./wishlist.component.css']
})
export class WishlistComponent implements OnInit {
public movieList = [];
movies: Observable<Array<Movie>>;
  search = new FormControl;
  constructor(private movieDetails: CardService) { }

  ngOnInit() {
  this.movieDetails.getWhishList().subscribe(fullList => this.movieList = fullList);
  }

}
