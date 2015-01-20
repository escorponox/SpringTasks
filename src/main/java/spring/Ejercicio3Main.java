package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio3Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context3.xml");

        Ejercicio3Aux ejercicio3 = (Ejercicio3Aux) context.getBean("ejercicio3aux");

        System.out.println("Return " + ejercicio3.holaAop(false));

        ejercicio3.holaAop(true);
    }
}
