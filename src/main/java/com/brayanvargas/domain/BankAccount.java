package com.brayanvargas.domain;
import java.util.Date;

public class BankAccount {
    public Bank bank;
    public String number;
    public char accountType;
    public Person proprietary;
    public float balance;
    public Date dateCreation;

    public boolean withdraw(float valueWithdraw){
        if (this.balance >= valueWithdraw){
            this.balance -= valueWithdraw;
            return true;
        } else {
            return false;
        }
    }

    public void send(float valueSend){
        this.balance += valueSend;
    }

    public String getTypeAccount(){
        String desc = null;
        switch (accountType){
            case 'A':
                desc = "Saving";
                break;
            case 'C':
                desc = "Current";
                break;
            default:
                desc = "NoOne";
                break;
        }
        return desc;
    }

    public boolean transfer(BankAccount destinyBankAccount, float valueWithdraw){
        if (this.balance >= valueWithdraw){
            this.withdraw(valueWithdraw);
            destinyBankAccount.send(valueWithdraw);
            return true;
        } else {
            return false;
        }
    }



}
