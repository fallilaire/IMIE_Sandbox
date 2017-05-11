import { Component, OnInit } from '@angular/core';
import { Contact } from './contact';
import { ContactsService } from './contacts.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Liste des contacts';
  saisie : String = '';
  public contacts;
  public newContact = new Contact(0, "", "", "");

  constructor (private contactsService : ContactsService) { }

  ngOnInit() {
    this.contactsService.getContacts().subscribe(data => {this.contacts = data});
  }

  addContact (contact : Contact) {
    this.contactsService.addContact(new Contact(0, contact.name, contact.address, contact.phone)).subscribe((contact) => {this.contacts.push(contact);});
  }

}
