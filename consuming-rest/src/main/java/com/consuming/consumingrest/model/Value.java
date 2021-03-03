package com.consuming.consumingrest.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {

    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote){
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                ", quote='" + quote + '\'' +
                '}';
    }
}
