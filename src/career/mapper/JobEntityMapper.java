package career.mapper;

import java.util.List;

import career.model.JobEntity;


public interface JobEntityMapper {


    List<JobEntity> getJobEntity(Integer userId);

    List<JobEntity> getTopJobEntity(Integer userId);

    List<JobEntity> getUniqueJobEntity();

    void updateJobEntity(JobEntity newJobEntity);

    void insertJobEntity(JobEntity jobEntity);
    
    void insertInterviewDate(JobEntity jobEntity);
    
    void insertInterviewStartTime(JobEntity jobEntity);
    
    void insertInterviewEndTime(JobEntity jobEntity);
    
    void removeJobEntity(JobEntity jobEntity);
    

}
