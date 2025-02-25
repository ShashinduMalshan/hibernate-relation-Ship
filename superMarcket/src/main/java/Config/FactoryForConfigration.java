package Config;

import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryForConfigration {


    private static FactoryForConfigration factoryForConfigration;
    private SessionFactory sessionFactory;




    private FactoryForConfigration() {
        Configuration configuration = new Configuration().configure();

        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(OrderDetail.class);
        configuration.addAnnotatedClass(Item.class);

         sessionFactory = configuration.buildSessionFactory();

    }

    public static FactoryForConfigration getInstance() {
        if (factoryForConfigration == null) {
            factoryForConfigration = new FactoryForConfigration();

        }
        return factoryForConfigration;
    }

    public Session getSessionFactory() {
        return sessionFactory.openSession();
    }
}
