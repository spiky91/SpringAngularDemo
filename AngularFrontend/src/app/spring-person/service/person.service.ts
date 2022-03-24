import {Injectable} from '@angular/core';
import {Person} from "../../model/person";
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class PersonService {
  private personUrl: string = 'http://localhost:8080/person'
  private persons: Person[] = [];

  constructor(private httpClient: HttpClient) {
  }

  addPerson(person: Person) {
    this.persons.push(person);
  }

  createPerson(name: string, surname: string): void {
    const person: Person = {name: name, surname: surname};
    this.httpClient.post<Person>(this.personUrl, person,
      {
        headers: new HttpHeaders({'Content-Type': 'application/json'}),
        observe: "body"
      }).subscribe(person => {
        console.warn("after insert " + person)
      this.persons.push(person);

    });
  }

  getPersons() {
    this.httpClient.get<Person[]>(this.personUrl, {observe: 'body', responseType: 'json'})
      .subscribe((data: Person[]) => {
          console.warn("request returned with " + data);
          for (let personData of data) {
            this.persons.push(personData);
          }
          console.warn("persons length after request " + this.persons.length);
        }
      );
    return this.persons;
  }
}
