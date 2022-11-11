package singleton;
//双重检查式
public class SSingleton {
    private  static volatile SSingleton sSingleton;

    private SSingleton() {
    }

    public static SSingleton getInstance(){
        if(sSingleton == null){
            synchronized (SSingleton.class){
                if(sSingleton == null){
                    sSingleton = new SSingleton();
                }
            }
        }
        return sSingleton;
    }
}
