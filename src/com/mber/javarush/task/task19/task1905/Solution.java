package com.mber.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/*
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
    }

    public static class DataAdapter implements RowItem {
        private final Customer customer;
        private final Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String key = null;
            for (String s : countries.keySet()) if (customer.getCountryName().equals(countries.get(s))) key = s;
            return key;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] slit = contact.getName().split(", ");
            return slit[1].trim();
        }

        @Override
        public String getContactLastName() {
            String[] slit = contact.getName().split(", ");
            return slit[0].trim();
        }

        @Override
        public String getDialString() {
            String[] split = contact.getPhoneNumber().split(" or ");
            String num = split[0].replaceAll("[()-]", "");
            return String.format("callto://%s", num);
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: com.mber.javarush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: com.mber.javarush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}