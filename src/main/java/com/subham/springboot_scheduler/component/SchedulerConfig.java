package com.subham.springboot_scheduler.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerConfig {
    @Scheduled(cron = "*/10 * * * * *")//runs every 10 seconds
    public void scheduledTask() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        String strDate = dateFormat.format(new Date());
        System.out.println("Cron job is running at " + strDate);
    }
}