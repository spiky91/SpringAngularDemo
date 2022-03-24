import {Component, OnInit} from '@angular/core';
import {PersonService} from "../service/person.service";
import {FormBuilder} from "@angular/forms";

@Component({
  selector: 'app-person-input',
  templateUrl: './person-input.component.html',
  styleUrls: ['./person-input.component.css']
})
export class PersonInputComponent implements OnInit {

  inputForm = this.formBuilder.group({
    name: "",
    surname: ''
  })

  constructor(private personService: PersonService, private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
  }

  createPerson(): void {
    console.warn(this.inputForm.value);
    this.personService.createPerson(this.inputForm.value.name,this.inputForm.value.surname);
    this.inputForm.reset();
  }

}
