package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author MathBergamo

 */
public class SingletonLazy {
    private static SingletonLazy instancia; //Não foi ainda instanciado, e está privado

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null){ //garantir que só será instanciado quando tiver sua chamada, se tornando externo também.
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
