package Config;

import entity.Item;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryForConfigration {


    private static FactoryForConfigration factoryForConfigration;
    private SessionFactory sessionFactory;




    private FactoryForConfigration() {
        Configuration configuration = new Configuration().configure();

configuration.addAnnotatedClass(Item.class);
configuration.addAnnotatedClass(Order.class);

         sessionFactory = configuration.buildSessionFactory();

    }

    public static FactoryForConfigration getInstance() {
//        if (factoryForConfigration == null) {
//            factoryForConfigration = new FactoryForConfigration();
//
//        }
//        return factoryForConfigration;

        return (factoryForConfigration==null) ? factoryForConfigration = new FactoryForConfigration():factoryForConfigration;
    }


    public Session getSessionFactory() {
        return sessionFactory.openSession();
    }
}
