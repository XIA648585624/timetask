package henu.xmh.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ControllerTask {
    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        return new ThreadPoolTaskScheduler();
    }

    public void run(){
        //执行定时任务方法
        Runnable runnable = new Runnable() {
            @Override
            public void run() {//业务代码
                System.out.println("this is timeTask:"+new Date());
            }
        };
        threadPoolTaskScheduler.schedule(runnable,new CronTrigger("0/5 * * * * *"));
    }

    public void shutdown(){//结束执行定时任务方法
        threadPoolTaskScheduler.shutdown();
    }
}
