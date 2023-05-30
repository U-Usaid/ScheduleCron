package com.ScheduleCron.ScheduleCron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 */5 9-18 * * 5-6")
    public void schedule1(){
        System.out.println("Hello world");
    }


}
