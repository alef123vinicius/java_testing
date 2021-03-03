package com.consuming.consumingrest.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;
    private int id;
    private String login;

    public Quote () {

    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin(){ return this.login; }

    public void setLogin(String login){
        this.login = login;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                "login='"+ login + '\'' +
                "id="+ id + '\'' +
                ", value=" + value +
                '}';
    }
}
