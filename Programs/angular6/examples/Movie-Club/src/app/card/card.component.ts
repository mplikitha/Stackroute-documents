import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  @Input() movieTitle;
   @Input () movieLists;
  constructor() { }

  set MovieName(movie) {
    this.movieTitle = movie; }
  get MovieName() {
    return this.movieTitle; }
  ngOnInit() {
  }
  getOutput() {


  }

}
