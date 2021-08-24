import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminListComponent } from './admin-list/admin-list.component';
import { CreateAdminComponent } from './create-admin/create-admin.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminListComponent,
    CreateAdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
