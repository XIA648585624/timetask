/*
package henu.xmh.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Async  //使用线程池
public class TestSpringTask {

    */
/**
     * fixDelay当任务执行完毕时开启
     *//*

    @Scheduled(fixedDelay = 3000)
    public void task01(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("task1:"+new Date());
    }

    */
/**
     * fixedRate 表示当前开始执行时计时
     *//*

    @Scheduled(fixedRate = 3000)
    public void task02(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("task2:"+new Date());
    }
}
*/
