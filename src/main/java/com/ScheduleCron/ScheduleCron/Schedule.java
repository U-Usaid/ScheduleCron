package com.ScheduleCron.ScheduleCron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 30 13 8-31 * 5")
    @Scheduled(cron = "0 30 17 1 * *")
    public void schedule1(){
        System.out.println("Hello world");
    }


}
