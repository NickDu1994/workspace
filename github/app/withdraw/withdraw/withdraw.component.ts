import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-withdraw',
  templateUrl: './withdraw.component.html',
  styleUrls: ['./withdraw.component.css']
})
export class WithdrawComponent implements OnInit {

  constructor(private location:Location, private httpClient: HttpClient) { }

  ngOnInit() {
    this.withdraw();
  }

  public back(): void {
    this.location.back();
  }

  public withdraw(): void {
    let url = "http://localhost:8080/withdraw?number=" + 2000;
    this.httpClient.get(url).subscribe((val)=>{
      console.log(val);
    })
  }

}
