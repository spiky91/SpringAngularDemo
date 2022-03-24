import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  // templateUrl: './app.component.html',
  template: '<div class="start">' +
    '<app-person-input></app-person-input>' +
            '<app-person-list></app-person-list>' +
    '</div>'
  ,
  styleUrls: ['./appTest.component.css']
})
export class AppComponent {
  title = 'AngularFrontend';
}
