/*
线程安全的懒汉单例模式
缺点：加锁的原子区域太多
 */
public class Singletonlazy2 {
    private Singletonlazy2(){};
    private static Singletonlazy2 instance =null;
    private synchronized static Singletonlazy2 getInstance(){
        if(instance==null){
            instance=new Singletonlazy2();
        }
        return instance;
    };
}
