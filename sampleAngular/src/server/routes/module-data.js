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
     * @param {string} address : the address
     * @param {string} phone : the phone
     */
    constructor ( id, name, address, phone ){
        this.id = id;
        this.name = name;
        this.address = address;
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
            new Contact (1, "Babar", "Nantes, France", "0000011111"),
            new Contact (2, "Snoopy", "Londres, UK", "0000011111"),
            new Contact (3, "Garfield", "Tokyo, Japon", "0000011111"),
            new Contact (4, "Donald", "Orlando, USA", "0000011111"),
            new Contact (5, "Dingo", "Paris, France", "0000011111")
        ];
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
     * @param contact
     */
    addContact (contact){
        contact.id = this._contacts.length;
        this._contacts.push(contact);
        return contact;
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
     * @param contact
     */
    deleteContact (contact){
        _.remove(this._contacts, (_contact) => {
            return contact.id == _contact.id;
        });
    }
}

module.exports = Contact;
module.exports = ModuleData;