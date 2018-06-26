import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    private static ExecutorService pool = Executors.newFixedThreadPool(3);
    private static CountDownLatch count = new CountDownLatch(2);

    public static void main(String[] args){
        pool.submit(new Thread1("清空表"));
        pool.submit(new Thread1("读入表"));
        pool.submit(new Thread2());
        pool.shutdown();
    }

    private static class Thread1 implements Runnable{
        private String name;
        public Thread1(String name){
            this.name = name;
        }
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println("["+name+"]---"+i);
            }
            count.countDown();
        }
    }

    private static class Thread2 implements Runnable{
        @Override
        public void run() {
            try {
                count.await();
                for(int i=0;i<10;i++){
                    System.out.println("[写入数据库]---"+i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
