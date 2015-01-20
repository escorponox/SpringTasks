package spring;

public class Ejercicio3Impl implements Ejercicio3 {


    @Override
    public String holaAop(Boolean lanzaExcepcion) throws Exception {

        if (lanzaExcepcion) {
            throw new Exception("Excepcion lanzada");
        }
        return "Hola Aop!!!!!";
    }

    public void before() {
        System.out.println("Before Aop");
    }

    public void after() {
        System.out.println("After Aop");
    }

    public void excep() {
        System.out.println("Exception Aop");
    }

}
