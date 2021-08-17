package com.hua.demo;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.concurrent.*;

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                String message = MessageFormat.format("{0}-{1}", this.getName(), i);
                System.out.println(message);
            }
        }
    }
}

class OddThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                String message = MessageFormat.format("{0}-{1}", Thread.currentThread().getName(), i);
                System.out.println(message);
            }
        }
    }
}

//1.创建一个实现 Callable 的实现类
class CallThread implements Callable {
    //2.实现 call 方法，将此线程需要执行的操作声明在 call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

}

class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

//        testThread();
//        testRunnable();
//        testCallable();
        testPool();

    }

    private static void testPool() {
        //1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的属性

        // System.out.println(service.getClass());
        // service1.setCorePoolSize(15);
        // service1.setKeepAliveTime();

        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());//适合适用于Runnable
        service.execute(new NumberThread1());//适合适用于Runnable
        // service.submit(Callable callable);//适合使用于 Callable

        //3.关闭连接池
        service.shutdown();
    }

    private static void testCallable() {
        //3.创建 Callable 接口实现类的对象
        CallThread ct = new CallThread();
        //4.将此 Callable 接口实现类的对象作为传递到 FutureTask 构造器中，创建 FutureTask 的对象
        FutureTask ft = new FutureTask(ct);
        //5.将 FutureTask 的对象作为参数传递到 Thread 类的构造器中，创建 Thread 对象，并调用 start()
        new Thread(ft).start();
        try {
            //6.获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
            Object sum = ft.get();
            System.out.println("总和为：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void testThread() {
        EvenThread eh0 = new EvenThread();
        eh0.start();
        EvenThread eh1 = new EvenThread();
        eh1.start();
    }

    private static void testRunnable() {
        OddThread ot = new OddThread();
        Thread t0 = new Thread(ot);
        t0.start();
        Thread t1 = new Thread(ot);
        t1.start();
    }


}
