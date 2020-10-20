package com.catherine_te.homework_bank.hierarhy.valute;

import java.util.List;

public class Market {
    private String name;
    private Emmitent emmitent;
    private List<Currency> currencyList;

    public Market(String name, List<Currency> currencyList, Emmitent emmitent) {
        this.name = name;
        this.currencyList = currencyList;
        this.emmitent = emmitent;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emmitent getEmmitent() {
        return emmitent;
    }

    public void setEmmitent(Emmitent emmitent) {
        this.emmitent = emmitent;
    }
}
