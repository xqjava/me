package singleton;
//懒汉式
public class LSingleton {
    private static  LSingleton lSingleton;

    private LSingleton() {
    }

    public  static  synchronized LSingleton getInstance() {
        if(lSingleton == null){
            lSingleton = new LSingleton();
        }
        return lSingleton;
    }
}
