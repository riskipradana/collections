package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerSetTest {
    public static void main(String[] args) {

        Set<Customer> customers = new HashSet<>();

        Customer id1 = new Customer();
        id1.setId(1l);
        customers.add(id1);

        Customer id2 = new Customer();
        id2.setId(2l);
        customers.add(id2);

        Customer c = new Customer();
        c.setId(1l);
        customers.add(c); //replace id1 because has same id

        Iterator<Customer> i = customers.iterator();

        while (i.hasNext()){
            Customer current = i.next();
            System.out.println("keranjang no-" + current.hashCode() + ", Id-nya : " + current.getId());
        }
    }
}
