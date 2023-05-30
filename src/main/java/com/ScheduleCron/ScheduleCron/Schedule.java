package com.ScheduleCron.ScheduleCron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 0 0 * 7 1-6")
    public void schedule1(){
        System.out.println("Hello world");
    }


}
