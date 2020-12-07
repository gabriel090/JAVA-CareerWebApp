package career.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class JobEntity {

	
	private int jobId;
	
	@NotNull(message = "Job name cannot be null.")
    @NotEmpty(message = "Job name cannot be empty.")
    @NotBlank(message =  "Job name cannot be blank.")
	private String name;
	
	@NotNull(message = " Description cannot be null.")
    @NotEmpty(message = " Description cannot be empty.")
    @NotBlank(message =  "Description cannot be blank.")
	private String description;
	
	@NotNull(message = " Type cannot be null.")
    @NotEmpty(message = " Type cannot be empty.")
    @NotBlank(message =  "Type cannot be blank.")
	private String type;
	
	@NotNull(message = " Years of Experience cannot be null.")
    @NotEmpty(message = " Years of Experience cannot be empty.")
    @NotBlank(message =  "Years of Experience cannot be blank.")
	private String experience;
	
	@NotNull(message = " Educational Level cannot be null.")
    @NotEmpty(message = " Educational Level cannot be empty.")
    @NotBlank(message =  "Educational Level cannot be blank.")
	private String educationLevel;
	private String status;
	private Date interviewDate;
	private Date startTime;
	private Date endTime;
	
	public JobEntity() {}

	
	
	public int getJobId() {
		return jobId;
	}



	public void setJobId(int jobId) {
		this.jobId = jobId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getExperience() {
		return experience;
	}



	public void setExperience(String experience) {
		this.experience = experience;
	}



	public String getEducationLevel() {
		return educationLevel;
	}



	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Date getInterviewDate() {
		return interviewDate;
	}



	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}



	public Date getStartTime() {
		return startTime;
	}



	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



	public Date getEndTime() {
		return endTime;
	}



	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	@Override
    public String toString() {
        return "Skill{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", experience='" + experience + '\'' +
                ", educationLevel='" + educationLevel + '\'' +  
				 ", interviewDate='" + interviewDate + '\'' +
                ", startTime=" + startTime + '\'' +
                 ", endTime=" + endTime + '\'' +
                ", status=" + status +
                
                '}';
    }
	
}
