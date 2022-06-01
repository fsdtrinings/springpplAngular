export class AccountDTO {
    accountNumber:number;
    username:string;
    balance:number;
    firstName:string;
    lastName:string;
    panCard:string;
    phoneNumber:number;

    constructor(
        accountNumber:number,
    username:string,
    balance:number,
    firstName:string,
    lastName:string,
    panCard:string,
    phoneNumber:number
    )
    {
        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.panCard = panCard;
        this.phoneNumber = phoneNumber;
    }
}

