package com.ScheduleCron.ScheduleCron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 * 12 1 1,4,7,10 *")
    public void schedule1(){
        System.out.println("Hello world");
    }


}
