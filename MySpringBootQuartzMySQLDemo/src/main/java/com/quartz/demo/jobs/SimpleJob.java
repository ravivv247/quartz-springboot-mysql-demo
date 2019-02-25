package com.quartz.demo.jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;



import java.util.stream.IntStream;

/**
 * @author ravivv247
 */
@Slf4j
public class SimpleJob extends QuartzJobBean {
	private static Logger log = LoggerFactory.getLogger(SimpleJob.class);
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    	System.out.println("SimpleJob Start................");
        IntStream.range(0, 5).forEach(i -> {
        	log.info("Counting - {}", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            	System.out.println(e.getMessage()+ e);
            }
        });
        System.out.println("SimpleJob End................");
    }
}
