package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "apressado"
 *
 * @author MathBergamo

 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager(); //O Apressado já irá instanciar diretamente.

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
