package com.jxt.test.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: my-test
 * @description: 测试中断线程
 * @author: jiaxiaotong
 * @create: 2020-05-07 16:48
 */
public class ThreadInterruptTest implements Runnable{
    private static boolean interruptFlag = false;

    @Override
    public void run() {

        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程结束了");
//        while (!interruptFlag){
////            System.out.println("Aaa");
//        }
    }

    public static void main(String[] args){
        ThreadInterruptTest threadInterruptTest = new ThreadInterruptTest();
        Thread thread = new Thread(threadInterruptTest);
        thread.start();
        
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        interruptFlag = true;
        thread.interrupt();
    }
}