DROP DATABASE IF EXISTS careerDb;
CREATE DATABASE careerDb;

use careerDb;

DROP TABLE IF EXISTS USER;

CREATE TABLE CANDIDATE (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL DEFAULT '',
  `last_name` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `date_created` datetime DEFAULT NULL,
 
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;




DROP TABLE IF EXISTS JOBENTITY;

CREATE TABLE JOBENTITY (
  `job_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(35) DEFAULT NULL,
   `description` varchar(100) DEFAULT NULL,
   `type` varchar(35) DEFAULT NULL,
   `educationLevel` varchar(35) DEFAULT NULL,
   `status` varchar(35) DEFAULT NULL,
  `user_id` int(11) unsigned NOT NULL,
   `interview_date` datetime DEFAULT NULL,
   `startTime` datetime DEFAULT NULL,
   `endTime` datetime DEFAULT NULL,
  PRIMARY KEY (`job_id`),
  KEY `interview_date` (`user_id`),
  CONSTRAINT `interview_date` FOREIGN KEY (`user_id`) REFERENCES USER (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS CONTACTS;

CREATE TABLE CONTACTS (
  `contacts_id` int(11) unsigned NOT NULL,
  `email` varchar(25) NOT NULL DEFAULT '',
   `phone` int(15) DEFAULT NULL,
  `address` varchar(25) DEFAULT NULL,
  `user_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`contacts_id`),
  KEY `phone` (`user_id`),
  CONSTRAINT `phone` FOREIGN KEY (`user_id`) REFERENCES USER (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



