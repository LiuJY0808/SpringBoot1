package com.atguigu.suo;

import sun.rmi.transport.ObjectTable;

import java.util.concurrent.TimeUnit;

public class sisuo {


    public static void main(String[] args) {
        Object objectA = new Object();
        Object objectB = new Object();

        new Thread(()->{
           synchronized (objectA){
               System.out.println(Thread.currentThread().getName() + "自己有准备获取B");
               try{ TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
               synchronized (objectB){
                   System.out.println("-------------A线程,成功抢到B");
               }
           }
        },"A").start();
        new Thread(()->{
            synchronized (objectB){
                System.out.println(Thread.currentThread().getName() + "自己有准备获取A");
                try{ TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
                synchronized (objectA){
                    System.out.println("-------------A线程,成功抢到B");
                }
            }
        },"B").start();
    }
}
//


