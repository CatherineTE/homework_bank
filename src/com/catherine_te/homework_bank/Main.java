package com.catherine_te.homework_bank;

import com.catherine_te.homework_bank.hierarhy.operation.Journal;
import com.catherine_te.homework_bank.hierarhy.valute.Currency;

public class Main {

    public static void main(String[] args) {
        Currency usd = new Currency("Dollar", 78);
        Currency rub = new Currency("Ruble", 1);
        Currency eur = new Currency("Ruble", 10);
        System.out.println(eur.getName() +" " + eur.getValue());
        eur.setName("Euro");
        eur.setValue(80);
        System.out.println(eur.getName() +" " + eur.getValue());

        Journal operationJournal = new Journal();

    }
}
