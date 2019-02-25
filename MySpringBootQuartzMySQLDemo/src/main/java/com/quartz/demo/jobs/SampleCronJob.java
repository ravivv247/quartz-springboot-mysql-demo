package com.quartz.demo.jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.stream.IntStream;

/**
 * @author ravivv247
 */
@Slf4j
@DisallowConcurrentExecution
public class SampleCronJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    	 System.out.println("SampleCronJob Start................");
        IntStream.range(0, 10).forEach(i -> {
        	 System.out.println("Counting for CronJob - {}"+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            	 System.out.println(e.getMessage()+ e);
            }
        });
        System.out.println("SampleCronJob End................");
    }
}
