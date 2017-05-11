import { Injectable } from '@angular/core';
import { Contact } from './contact';
import {Http, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class ContactsService {

  private headers: Headers;
  private options: RequestOptions;

  constructor(private http: Http) {
    this.headers = new Headers({'Content-Type': 'application/json'});
    this.options = new RequestOptions({headers: this.headers});
  }

  getContacts() {
    return this.http.get("/api/contacts", this.options).map(res => res.json());
  }

  /**
   * Add a new contact
   * @param contact 
   * @return {Observable<R>}
   */
  addContact (contact : Contact) {
    return this.http.post('/api/contacts', JSON.stringify(contact), this.options).map(res => res.json());
  }

}
