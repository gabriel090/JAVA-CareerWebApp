package career.model;


import java.util.Date;

public class Interview {
	private int interviewId;
	private Date interviewDate;
	private Date startTime;
	private Date endTime;

	public Interview() {}

	
	

    public int getInterviewId() {
		return interviewId;
	}




	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
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
        return "Interview{" +
                ", interviewDate='" + interviewDate + '\'' +
                ", startTime=" + startTime +
                 ", endTime=" + endTime +
                '}';
    }

	
}
