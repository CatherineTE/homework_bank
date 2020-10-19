package com.catherine_te.homework_bank.hierarhy.valute;

public class Currency {
    public String name;
    public Number value;
    public Currency (String name, Number value) {
        this.name = name;
        this.value = value;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public Number getValue () {
        return value;
    }
    public void setValue (Number value) {
        this.value = value;
    }
}
