import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';

@Component({
  selector: 'app-create-admin',
  templateUrl: './create-admin.component.html',
  styleUrls: ['./create-admin.component.css']
})
export class CreateAdminComponent implements OnInit {

  admin : Admin = new Admin ();
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    

  }

}
