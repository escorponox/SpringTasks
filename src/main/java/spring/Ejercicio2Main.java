package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio2Main {

    public static void main(String[] args) {

        System.out.println("-----------Singleton------------");

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Ejercicio1 singleton1 = (Ejercicio1) context.getBean("ejercicio1");

        System.out.println("singleton1 prueba: " + singleton1.getPrueba());

        Ejercicio1 singleton2 = (Ejercicio1) context.getBean("ejercicio1");

        System.out.println("singleton2 prueba: " + singleton2.getPrueba());

        System.out.println("singleton equals: " + singleton2.equals(singleton1));
        System.out.println("singleton same: " + (singleton2 == singleton1));

        System.out.println("-----------Prototype------------");

        Ejercicio1 prototype1 = (Ejercicio1) context.getBean("ejercicio2");
        prototype1.setPrueba("adios");
        System.out.println("prototype1 prueba: " + prototype1.getPrueba());

        Ejercicio1 prototype2 = (Ejercicio1) context.getBean("ejercicio2");

        System.out.println("prototype2 prueba: " + prototype2.getPrueba());

        System.out.println("prototype equals: " + prototype2.equals(prototype1));
        System.out.println("prototype same: " + (prototype2 == prototype1));

        System.out.println("-----------Factory------------");

        FactoryMethod factoryMethod1 = (FactoryMethod) context.getBean("ej2Factory");

        System.out.println("factoryMethod1 prueba: " + factoryMethod1.getPrueba());

        FactoryMethod factoryMethod2 = FactoryMethod.getInstance();

        System.out.println("factoryMethod2 prueba: " + factoryMethod2.getPrueba());

        System.out.println("factoryMethod equals: " + factoryMethod2.equals(factoryMethod1));
        System.out.println("factoryMethod same: " + (factoryMethod2 == factoryMethod1));

        ((ClassPathXmlApplicationContext) context).close();
    }
}