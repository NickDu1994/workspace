import { Component, OnInit } from '@angular/core';
import { AuthenicateService } from '../shared/authenicate.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: []
})
export class LoginComponent implements OnInit {

  private keyboardArray: any = [
    ['1','2','3'],['4','5','6'],['7','8','9'],['<','0','#']
  ];

  private passwordValue: string = '';

  private passwordValid: boolean = false;

  constructor(private authenicateService: AuthenicateService, private router: Router) { }

  ngOnInit() {

  }

  public bindClick(keyboardNumber): void {
    if(keyboardNumber == '<'){
      this.passwordValue = this.passwordValue.slice(0,this.passwordValue.length-1);
    }else {
      this.passwordValue += keyboardNumber;
    }
  }

  public login(): void {
    this.authenicateService.login(this.passwordValue).subscribe((data) => {
      if(data.auth == 'true'){
        this.router.navigate(['/dashboard'])
      }else {
        this.passwordValid = true;
      }
    })
    
      //this.router.navigate(['/dashboard'])
    
  }
}
