public class Singletonlazy3 {
    private Singletonlazy3(){};
    private volatile static Singletonlazy3 instance=null;
    private static Singletonlazy3 getInstance(){
        if(instance==null){
            synchronized (Singletonlazy3.class){
                if(instance==null)
                instance=new Singletonlazy3();
            }
        }
        return instance;
    }
}
