import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from 'src/app/servicios/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent {
  public formLogin!: FormGroup;
  

constructor( private service : LoginService, private formBuilder:FormBuilder){}
ngOnInit(): void {
  this.formLogin = this.formBuilder.group({
    email: ['',[Validators.required,Validators.email]],
    password:['',[Validators.required,Validators.minLength(8)]]
  });
}
onSubmit(){
  this.service.login(this.formLogin);
}

}

