package singleton;
//饿汉式
public class ESingleton {
    private static ESingleton eSingleton = new ESingleton();

    private ESingleton() {
    }

    public static ESingleton getInstance() {
        return eSingleton;
    }
}
