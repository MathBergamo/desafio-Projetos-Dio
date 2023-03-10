package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "LazyHolder"
 *
 * @author MathBergamo

 */
public class SingletonLazyHolder {
    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();//Holder encapsula a instancia
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    }
}
