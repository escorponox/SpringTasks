package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio1Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Ejercicio1 ejercicio1 = (Ejercicio1) context.getBean("ejercicio1");

        System.out.println(ejercicio1.holaMundo());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
