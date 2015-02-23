package etiya.templates.quartz.jobs.dto;

import java.util.Date;

public class QuartzJob {
	private static final long serialVersionUID = 1L;

	String jobName;
	String jobGroup;
	Date nextFireTime;

	public QuartzJob(String jobName, String jobGroup, Date nextFireTime) {

		this.jobName = jobName;
		this.jobGroup = jobGroup;
		this.nextFireTime = nextFireTime;
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

	public Date getNextFireTime() {
		return nextFireTime;
	}

	public void setNextFireTime(Date nextFireTime) {
		this.nextFireTime = nextFireTime;
	}

}
