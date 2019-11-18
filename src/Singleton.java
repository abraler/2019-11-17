public class Singleton {
    //不允许外边的调用构造方法
    private Singleton(){};

    private static Singleton instance =new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
