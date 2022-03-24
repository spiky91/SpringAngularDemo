import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SpringPersonModule } from './spring-person/spring-person.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    SpringPersonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
