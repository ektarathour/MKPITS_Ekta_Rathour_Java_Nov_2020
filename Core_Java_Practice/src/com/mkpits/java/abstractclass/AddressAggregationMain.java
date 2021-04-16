//WAP to Aggregation
package com.mkpits.java.abstractclass;

class AddressAggregationText {
    String city, state, country;

    public AddressAggregationText(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

public class AddressAggregationMain {
    int id;
    String name;
    AddressAggregationText address;

    public AddressAggregationMain(int id, String name, AddressAggregationText address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void disply() {
        System.out.println(id + "" + name);
        System.out.println(address.city + "" + address.state + "" + address.country);
    }

    public static void main(String[] args) {
        AddressAggregationText address1 = new AddressAggregationText("bgt", "mp", "india");
        AddressAggregationText address2 = new AddressAggregationText("patna", "bihar", "india");

        AddressAggregationMain e1 = new AddressAggregationMain(111, "Ekta", address1);
        AddressAggregationMain e2 = new AddressAggregationMain(112, "rani", address2);
        e1.disply();
        e2.disply();
    }
}
