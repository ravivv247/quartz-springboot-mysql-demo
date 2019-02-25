package com.quartz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quartz.demo.enitiy.SchedulerJobInfo;

/**
 * @author ravivv247
 */
@Repository
public interface SchedulerRepository extends JpaRepository<SchedulerJobInfo, Long> {

}
