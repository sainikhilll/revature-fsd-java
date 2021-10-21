import { Component, OnInit } from '@angular/core';
import { CustomerDetails } from './model/customerDetails';

@Component({
  selector: 'app-band',
  templateUrl: './band.component.html',
  styleUrls: ['./band.component.css']
})
export class BandComponent implements OnInit {
  customerDetails: CustomerDetails = {
    name:"Max",
    dateOfEvent: new Date(2021, 11, 10),
    noOfHours: 3,
    venue: "Hyderbad",
    approved:false
  };
  constructor() { }

  ngOnInit(): void {
  }

}
