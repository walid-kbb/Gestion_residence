import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminListComponent } from './admin-list/admin-list.component';
import { CreateAdminComponent } from './create-admin/create-admin.component';

const routes: Routes = [
  {path:"admins",component:AdminListComponent },
  {path :"create-admin", component : CreateAdminComponent},
  {path :"", redirectTo :"admins", pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
