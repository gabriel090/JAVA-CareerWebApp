package career.model;

import javax.validation.constraints.*;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	private int userId;
	
	@Min (value = 10, message = "Minimum age for Paticipants is 10 Years .")
    private int age;
	
    @NotNull(message = "First name cannot be null.")
    @NotEmpty(message = "First name cannot be empty.")
    @NotBlank(message =  "First name cannot be blank.")
    private String firstName;

    @NotNull(message = "First name cannot be null.")
    @NotEmpty(message = "First name cannot be empty.")
    @NotBlank(message =  "First name cannot be blank.")
    private String lastName;
   
    private Date dateCreated;
    
    private JobEntity jobEntity;
    
    public User() {
    	
    }
    
    public User(String firstName, String lastName, int age, Date dateCreated) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateCreated = dateCreated;
        
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	  @Override
	    public String toString() {
	        return "User{" +
	                "id=" + userId +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", age=" + age +
	                ", dateCreate=" + dateCreated +
	                '}';
	    }
    
    
    
	
}
