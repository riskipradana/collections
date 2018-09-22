package com.company;

import java.util.*;

public class CustomerMapTest {
    public static void main(String[] args) {

        Map<String, List<Customer>> customerByCityMap =
                new HashMap<>();

        List<Customer> jakartaCustomer = new ArrayList<>();
        //customer Jakarta 1
        Customer a = new Customer();
        a.setId(1l);
        jakartaCustomer.add(a);
        //customer Jakarta 2
        Customer b = new Customer();
        a.setId(1l);
        jakartaCustomer.add(a);
        customerByCityMap.put("jakarta", jakartaCustomer);

        List<Customer> surabayaCustomer = new ArrayList<>();
        //customer Surabaya 1
        Customer c = new Customer();
        a.setId(1l);
        surabayaCustomer.add(c);
        customerByCityMap.put("surabaya", surabayaCustomer);

        Set<String> keys = customerByCityMap.keySet();

        Iterator<String> i = keys.iterator();

        while (i.hasNext()){
            String key = i.next();
            List<Customer> customers = customerByCityMap.get(key);
            for (Customer customer : customers){
                System.out.println("kota : " + key + ", Customer id : " + customer.getId());
            }
        }
    }
}
