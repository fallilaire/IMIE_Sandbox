import { Component, OnInit } from '@angular/core';
import { Contact } from './contacts/contact.model';
import {ContactsService} from "./contacts.service";

const _ = require('lodash');

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  private contacts = [];
  private newContactInfo = {
    id: 0,
    name: "",
    firstname: "",
    address: "",
    email: "",
    phone: ""
  };

  public constructor (private contactsService: ContactsService) { }

  ngOnInit() {
    this.contactsService.getContacts().subscribe(data => {this.contacts = data});
  }

  /**
   * Add a new contact or Update an existing contact
   */
  saveContact (contact : Contact) {
    // add, only if data are OK !
    if ( contact.name != "" && contact.firstname != "" && contact.address != "" && contact.email != "" && contact.phone != "") {
      if (contact.id != 0) {
        this.contactsService.updateContact(new Contact(contact.id, contact.name, contact.firstname, contact.address, contact.email, contact.phone)).subscribe((contact) => {

          var index = _.findIndex(this.contacts, function(o) { return o.id == contact.id; });
          if(index){
            this.contacts[index] = contact;
          }

          // clean
          this.newContactInfo = {
            id: 0,
            name: "",
            firstname: "",
            address: "",
            email: "",
            phone: ""
          };
        });
      }
      else {  
        this.contactsService.addContact(new Contact(0, contact.name, contact.firstname, contact.address, contact.email, contact.phone)).subscribe((contact) => {this.contacts.push(contact);});

        // clean
        this.newContactInfo = {
          id: 0,
          name: "",
          firstname: "",
          address: "",
          email: "",
          phone: ""
        };
      }
    }
  }

  /**
   * Delete a new contacts
   */
  delContact (id : number) {
    this.contactsService.delContact(id).subscribe((contact) => {
      _.remove(this.contacts, function (_contact){
            return contact.id == _contact.id;
        });
    });
  }

  /**
   * Clean form
   */
  clean () {
    this.newContactInfo = {
          id: 0,
          name: "",
          firstname: "",
          address: "",
          email: "",
          phone: ""
    };
  }

  /**
   * Get a contact
   */
  getContact (id : number) {
    this.contactsService.getContact(id).subscribe((contact) => {
      // clean
      this.newContactInfo = {
        id: contact.id,
        name: contact.name,
        firstname: contact.firstname,
        address: contact.address,
        email: contact.email,
        phone: contact.phone
      };
    });
  }

}
