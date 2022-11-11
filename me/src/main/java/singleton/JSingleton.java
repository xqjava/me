package singleton;
//静态内部类式
public class JSingleton {
    private JSingleton() {
    }

    private static  class JSingletonInstance{
        private static  final JSingleton jSingleton = new JSingleton();
    }

    public static  JSingleton getInstance(){
        return JSingletonInstance.jSingleton;
    }
}
