package main.classes.career.dao;
import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.classes.career.exceptions.IdException;
import main.classes.career.exceptions.JobEntityException;
import main.classes.career.mapper.JobEntityMapper;
import main.classes.career.model.JobEntity;
import main.classes.career.validator.DAOValidator;

@Transactional
@Service("JobEntryDAO")
public class JobEntryDAOImpl implements JobEntryDAO {

    @Autowired
    private JobEntityMapper jobEntityMapper;

    @Autowired
    DAOValidator daoValidator;

    private static final Logger logger = LogManager.getLogger("JobEntryDAO");

    public List<JobEntity> getJobEntity(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Returning list of skills of user: %s.", userId);
        return jobEntityMapper.getJobEntity(userId);
    }

    public List<JobEntity> getTopJobEntity(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Returning list of TOP-skills of user: %s.", userId);
        return jobEntityMapper.getTopJobEntity(userId);
    }

    public List<JobEntity> getUniqueJobEntity() {
        logger.debug("Returning list of unique skills.");
        return jobEntityMapper.getUniqueJobEntity();
    }

    public void updateJobEntity(JobEntity jobEntity) throws JobEntityException {
        daoValidator.jobEntityValidate(jobEntity);
        logger.debug("Updating Job entity with id: %s.", jobEntity.getJobId());
        jobEntityMapper.updateJobEntity(jobEntity);
    }

    public void insertJobEntity(JobEntity jobEntity) throws JobEntityException {
        daoValidator.jobEntityValidate(jobEntity);
        logger.debug("Inserting job Entity with id: %s.", jobEntity.getJobId());
        jobEntityMapper.insertJobEntity(jobEntity);
    }

    public void insertInterviewDate(JobEntity jobEntity) throws JobEntityException {
        daoValidator.jobEntityValidate(jobEntity);
        logger.debug("Inserting Interview Date Entity %s.", jobEntity.getJobId());
        jobEntityMapper.insertInterviewDate(jobEntity);
    }

    public void insertInterviewStartTime(JobEntity jobEntity) throws JobEntityException {
        daoValidator.jobEntityValidate(jobEntity);
        logger.debug("Inserting Interview Start time %s.", jobEntity.getJobId());
        jobEntityMapper.insertInterviewStartTime(jobEntity);
    }

    public void insertInterviewEndTime(JobEntity jobEntity) throws JobEntityException {
        daoValidator.jobEntityValidate(jobEntity);
        logger.debug("Inserting Interview End Time: %s.", jobEntity.getJobId());
        jobEntityMapper.insertJobEntity(jobEntity);
    }

  

    public void removeJobEntity(JobEntity jobEntity) throws JobEntityException {
        daoValidator.jobEntityValidate(jobEntity);
        logger.debug("Removing job Entity of user: %s.", jobEntity.getJobId());
        jobEntityMapper.removeJobEntity(jobEntity);
    }

	@Override
	public List<JobEntity> getSkills(Integer userId) throws IdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobEntity> getTopSkills(Integer userId) throws IdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobEntity> getUniqueSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSkill(JobEntity skill) throws JobEntityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertSkill(JobEntity skill) throws JobEntityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSkill(JobEntity skill) throws JobEntityException {
		// TODO Auto-generated method stub
		
	}


}
