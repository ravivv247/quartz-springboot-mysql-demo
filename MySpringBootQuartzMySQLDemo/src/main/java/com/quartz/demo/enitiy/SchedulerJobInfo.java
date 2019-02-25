package com.quartz.demo.enitiy;



import javax.persistence.*;

/**
 * @author ravivv247
 */

@Entity
@Table(catalog = "quartz_demo_db", name = "scheduler_job_info")
public class SchedulerJobInfo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;

    private String jobGroup;

    private String jobClass;

    private String cronExpression;

    private Long repeatTime;

    private Boolean cronJob;
    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public Long getRepeatTime() {
		return repeatTime;
	}

	public void setRepeatTime(Long repeatTime) {
		this.repeatTime = repeatTime;
	}

	public Boolean getCronJob() {
		return cronJob;
	}

	public void setCronJob(Boolean cronJob) {
		this.cronJob = cronJob;
	}

}