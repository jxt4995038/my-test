package com.jxt.test.jvm.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: my-test
 * @description: 堆溢出
 * @author: jiaxiaotong
 * @create: 2020-05-03 16:06
 */
public class HeapOom {

    private int[] numbers = new int[1 * 1024*1024];

    public static void main(String[] args) throws InterruptedException {
        List<HeapOom> heapOoms = new ArrayList<>();
        while (true){
            HeapOom heapOom = new HeapOom();
            heapOoms.add(heapOom);
        }
    }
}