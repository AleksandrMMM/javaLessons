package com.lessons.lessons1;

public class Metod {
    public static void main (String[] args) {
        BankInfo Aleksandr = new BankInfo();

        Aleksandr.balance = 10;
        Aleksandr.city = "moscow";
        Aleksandr.lastName = "Petrov";

        BankInfo Ivan = new BankInfo();

        Ivan.balance = 12;
        Ivan .city = "Krasnodar";
        Ivan.lastName = "Ivanov";

        System.out.println(Ivan.city);

        Ivan.bank();

    }
}
