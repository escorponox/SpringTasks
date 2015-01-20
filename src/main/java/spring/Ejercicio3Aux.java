package spring;

/**
 * Created by marta on 20/01/15.
 */
public class Ejercicio3Aux {

    public String holaAop(Boolean lanzaExcepcion) throws Exception {

        if (lanzaExcepcion) {
            throw new Exception("Excepcion lanzada");
        }
        System.out.println("Hola Aop!!!!!");
        return "Hola Aop!!!!!";
    }
}
