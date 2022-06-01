export class UserDetails {
    firstName:string;
    lastName:string;
    houseAddress:string;
    city:string;
    panNumber:string;
    mobileNumber:number;
    
    constructor(
        firstName:string,
        lastName:string,
        houseAddress:string,
        city:string,
        panNumber:string,
        mobileNumber:number
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseAddress = houseAddress;
        this.city = city;
        this.panNumber = panNumber;
        this.mobileNumber = mobileNumber;
    }
}


