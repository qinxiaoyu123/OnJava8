package threadTest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadTest {
    static MyThreadLocal threadLocal = new MyThreadLocal();
    public static void main(String []args){
        threadLocal.set("user2");
        new Thread(()->
        {
            threadLocal.set("user1");
            doSomething();
        }
        ).start();
        doSomething();
    }

    private static void doSomething() {
        System.out.println("thread: "+Thread.currentThread().getName()+": "+threadLocal.get());
    }

    private static class MyThreadLocal{
        Map<Long, String > data = new ConcurrentHashMap<>();
        public String get(){
            return data.get(Thread.currentThread().getId());
        }
        public void set(String userName){
            data.put(Thread.currentThread().getId(),userName);
        }
    }
}














