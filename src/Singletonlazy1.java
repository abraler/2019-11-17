/*
懒汉模式的单例；单线程环境下正确
                多线程安全有问题
                            */
public class Singletonlazy1 {
    private Singletonlazy1(){}
    private static Singletonlazy1 instance=null;
    /*
    getInstance被第一次调用时，意味着有人需要instance
    在进行初始化
     */
    public static Singletonlazy1 getInstance(){
        if(instance==null){
            instance=new Singletonlazy1();

        }
        return instance;
    }
}
