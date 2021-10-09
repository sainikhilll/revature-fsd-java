import { Component, OnInit } from '@angular/core';
import { movies } from '../data';
import { Movie } from './model/movie';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  title : string = "Joker";
  genres: string[] = ["Drama"," Thriller"];

  // movie: Movie = {
  //   id: 1,
  //   title: "Joker",
  //   genres: [
  //     { id: 2, name: "Drama" },
  //     { id: 4, name: "Thriller"}
  //   ],
  //   releaseDate: "31/08/2019",//new Date(2019, 7, 31),
  //   mpaaRating: {
  //     id: 1,
  //     name: "PG-13"
  //   },
  //   rating: 8.5,
  //   duration: 122,
  //   budget: 70000000,
  //   bookingsOpen: true,
  // };
   movies: Movie[] = movies;
  constructor() { }

  ngOnInit(): void {
  }

}
