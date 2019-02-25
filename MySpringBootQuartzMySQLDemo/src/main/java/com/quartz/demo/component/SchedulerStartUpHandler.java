package com.quartz.demo.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.quartz.demo.service.SchedulerService;

/**
 * @author ravivv247
 */

@Component
public class SchedulerStartUpHandler implements ApplicationRunner {

    @Autowired
    private SchedulerService schedulerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	System.out.println("Schedule all new scheduler jobs at app startup - starting");
        try {
            schedulerService.startAllSchedulers();
            System.out.println("Schedule all new scheduler jobs at app startup - complete");
        } catch (Exception ex) {
        	System.out.println("Schedule all new scheduler jobs at app startup - error"+ ex);
        }
    }
}
