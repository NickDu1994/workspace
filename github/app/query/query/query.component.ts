import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-query',
  templateUrl: './query.component.html',
  styleUrls: ['./query.component.css']
})
export class QueryComponent implements OnInit {

  constructor(private location:Location, private httpClient:HttpClient) { }

  ngOnInit() {
    this.query();
  }

  public back(): void {
    this.location.back();
  }

  public query(): void {
    this.httpClient.get("http://localhost:8080/query").subscribe((val)=> {
      console.log(val);
    })
  }

}
