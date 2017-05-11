/**
 * The contact class
 * This is a bean like class
 *
 * It only contains :
 *  - private attributs
 *  - default contructor
 *  - getters and setters
 */
export class Contact {

    public id: number;
    public name: string;
    public firstname: string;
    public address: string;
    public email: string;
    public phone: string;

    /**
     * Default constructor
     */

    constructor(id: number, name: string, firstname: string, address: string, email: string, phone: string) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

}
