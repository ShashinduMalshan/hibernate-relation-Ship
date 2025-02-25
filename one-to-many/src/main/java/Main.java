


import Config.FactoryForConfigration;
import entity.Customer;

import entity.Order;

import org.hibernate.Session;

import org.hibernate.Transaction;



import java.util.ArrayList;

import java.util.List;



public class Main {

    public static void main(String[] args) {

        Session session = FactoryForConfigration.getInstance().getSessionFactory();



        Customer customer = new Customer();

//        customer.setId(1);

        customer.setName("Jack");



        List<Order> orders = new ArrayList<Order>();



        Order order1 = new Order();

//        order1.setId(1);

        order1.setOrderDAte("20/02/2025");



        Order order2 = new Order();

//        order2.setId(1);

        order2.setOrderDAte("20/12/2025");



        orders.add(order1);

        orders.add(order2);



        customer.setOrders(orders);



        Transaction transaction = session.beginTransaction();

        session.save(customer);

        transaction.commit();

        session.close();



    }

}