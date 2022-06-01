import { UserDetails } from "./user-details";

export class Account {
    accountNumber:number;
    username:string;
    password:string;
    role:string;
    balance:number;
    MIN_BALANCE:number = 5000;
    userDetails:UserDetails;

    constructor(
        accountNumber:number,
        username:string,
        password:string,
        role:string,
        balance:number,
        MIN_BALANCE:number,
        userDetails:UserDetails
    )
    {   
        this.accountNumber = accountNumber;
        this.username = username;
        this.password = password;
        this.role = role;
        this.balance = balance;
        this.MIN_BALANCE = MIN_BALANCE;
        this.userDetails = userDetails;
    }

}
