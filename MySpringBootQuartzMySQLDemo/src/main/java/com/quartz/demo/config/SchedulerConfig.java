package com.quartz.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.quartz.demo.component.SchedulerJobFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author ravivv247
 */
@Configuration
public class SchedulerConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private QuartzProperties quartzProperties;

    /**
     * create scheduler factory
     */
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {

        SchedulerJobFactory jobFactory = new SchedulerJobFactory();
        jobFactory.setApplicationContext(applicationContext);

        Properties properties = new Properties();
        properties.putAll(quartzProperties.getProperties());

        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        factory.setOverwriteExistingJobs(true);
        factory.setDataSource(dataSource);
        factory.setQuartzProperties(properties);
        factory.setJobFactory(jobFactory);
        return factory;
    }

}
