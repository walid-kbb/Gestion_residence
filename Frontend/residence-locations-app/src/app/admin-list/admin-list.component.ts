import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin-list',
  templateUrl: './admin-list.component.html',
  styleUrls: ['./admin-list.component.css']
})
export class AdminListComponent implements OnInit {
  admins : Admin [];

  constructor(private adminService : AdminService) { }

  ngOnInit(): void {
    this.getAdmins();
  }

  private getAdmins( ) {
    return this.adminService.getAdminsList().subscribe(data => {
      console.log(data);
      this.admins = data;
     },err => {
      console.log(err);
    })

  }

}
