export class Contact {
    public id : number;
    public name : string;
    public address : string;
    public phone : string;

    constructor (id : number, name : string, address : string, phone : string) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    };

    format() {
        return "id:" + this.id + " name: " + this.name + " address: " + this.address + " phone:" + this.phone;
    };

    isEven() {
        if ((this.id % 2) == 0) {
            return true;
        }
        else {
            return false;
        }
    };

}
