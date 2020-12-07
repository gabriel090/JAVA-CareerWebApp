package career.dao;

import java.util.List;

import career.exceptions.IdException;
import career.exceptions.JobEntityException;
import career.model.JobEntity;

public interface JobEntryDAO {

    List<JobEntity> getSkills(Integer userId) throws IdException;

    List<JobEntity> getTopSkills(Integer userId) throws IdException;

    List<JobEntity> getUniqueSkills();

    void updateSkill(JobEntity skill) throws JobEntityException;

    void insertSkill(JobEntity skill) throws JobEntityException;

    void removeSkill(JobEntity skill) throws JobEntityException;

}
