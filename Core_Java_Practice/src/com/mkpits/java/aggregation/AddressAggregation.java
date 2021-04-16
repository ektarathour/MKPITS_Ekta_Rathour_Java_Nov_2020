//WAP to Aggregation
package com.mkpits.java.aggregation;

class AddressEx {
    String city, state, country;

    public AddressEx(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp {
    int id;
    String name;
    AddressEx address;

    public Emp(int id, String name, AddressEx address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void disply() {
        System.out.println(id + "" + name);
        System.out.println(address.city + "" + address.state + "" + address.country);
    }

    static class AddressAggregation {
        public static void main(String[] args) {
            AddressEx address1 = new AddressEx("bgt", "mp", "india");
            AddressEx address2 = new AddressEx("patna", "bihar", "india");

            Emp e1 = new Emp(111, "Ekta", address1);
            Emp e2 = new Emp(112, "rani", address2);
            e1.disply();
            e2.disply();
        }
    }
}
