import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-new-track',
  templateUrl: './add-new-track.component.html',
  styleUrls: ['./add-new-track.component.scss'],
})
export class AddNewTrackComponent implements OnInit {

  myDate;

  constructor() { }

  ngOnInit() {
    alert(this.myDate)
  }



}
