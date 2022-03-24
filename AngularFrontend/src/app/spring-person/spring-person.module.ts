import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PersonInputComponent } from './person-input/person-input.component';
import { PersonListComponent } from './person-list/person-list.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    PersonInputComponent,
    PersonListComponent,
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  exports:[
    PersonInputComponent,
    PersonListComponent
  ]
})
export class SpringPersonModule { }
