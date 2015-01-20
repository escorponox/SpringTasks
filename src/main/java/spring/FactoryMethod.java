package spring;

public class FactoryMethod {

    private String prueba;

    private FactoryMethod() {
    }

    public static FactoryMethod getInstance() {
        return FactoryHolder.instance;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    private static class FactoryHolder {
        static FactoryMethod instance = new FactoryMethod();
    }

}
