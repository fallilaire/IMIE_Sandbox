const _ = require('lodash');

/**
 * This is the Contact class
 */
class Contact {

    /**
     * The constructor
     *
     * @param {number} id : the identifier
     * @param {string} name : the name
     * @param {string} firstname : the firstname
     * @param {string} address : the address
     * @param {string} email : the email
     * @param {string} phone : the phone
     */
    constructor ( id, name, firstname, address, email, phone ){
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

}

/**
 * This is Data Access Layer for contacts
 */
class ModuleData {

    /**
     * Default constructor
     */
    constructor (){
        this._contacts = [
            new Contact(1, "Hugo", "Victor", "Paris, France", "victor.hugo@nomail.org", "0000011111"),
            new Contact(2, "Verne", "Jules", "Nantes, France", "jules.verne@nomail.org",  "0000011112"),
            new Contact(3, "de Balzac" ,"Honoré", "Orléans, France", "honore.debalzac@nomail.org", "0000011113")
        ];

        this.max = this._contacts.length;
    }

    /**
     * Gets contacts list
     * @return {Array}
     */
    get contacts (){
        return this._contacts;
    }

    /**
     * Adds a contact
     * @param {Contact} contact
     */
    addContact (contact){
        let addedContact = new Contact(++this.max, contact.name, contact.firstname, contact.address, contact.email, contact.phone);
        this._contacts.push( addedContact );
        return addedContact;
    }

    /**
     * Finds a contact by id
     * @param id
     * @return {*}
     */
    findContactById (id){
        return _(this._contacts).find( (contact) =>{
            return contact.id == id;
        });
    }

    /**
     * Deletes a contact
     * @param {Contact} contact
     */
    deleteContact (contact){
        _.remove(this._contacts, function (_contact){
            return contact.id == _contact.id;
        });
        return contact;
    }

    /**
     * Updates a contact
     * @param {Contact} contact
     */
    updateContact (contact){
        let updatedContact = this.findContactById(contact.id);
        updatedContact.name = contact.name;
        updatedContact.firstname = contact.firstname;
        updatedContact.email = contact.email;
        updatedContact.address = contact.address;
        updatedContact.phone = contact.phone;
        return updatedContact;
    }
}

module.exports = Contact;
module.exports = ModuleData;