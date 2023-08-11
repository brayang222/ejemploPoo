package com.brayanvargas.app;

import com.brayanvargas.domain.BankAccount;
import com.brayanvargas.domain.Person;

public class App {
    public static void main(String[] args) {

        Person firstPerson = new Person();

        firstPerson.dni = 1001478905;
        firstPerson.name = "Brayan";

        BankAccount firstAccount = new BankAccount();
        BankAccount secondAccount = new BankAccount();

        firstAccount.accountType = 'A';
        firstAccount.number = "1234";
        firstAccount.proprietary = firstPerson;

        secondAccount.accountType = 'C';
        secondAccount.number = "5678";
        secondAccount.proprietary = firstPerson;

        System.out.printf("the proprietary of account " + firstAccount.number + " is: "
                + firstAccount.proprietary.name);

        firstAccount.balance = 1;

        System.out.printf("The balance of account before withdraw is " + firstAccount.balance);
        firstAccount.withdraw(100000);
        System.out.printf("The balance of account is " + firstAccount.balance);



    }
}
