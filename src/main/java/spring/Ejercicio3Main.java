package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio3Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Ejercicio3 ejercicio3 = (Ejercicio3) context.getBean("ejercicio3");

        ejercicio3.holaAop(false);

        ejercicio3.holaAop(true);
    }
}
