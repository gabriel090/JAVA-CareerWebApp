package main.classes.career.model;

public class Contacts {
	
	private int contactId;
	private String address;
	private String phoneNumber;
	@org.hibernate.validator.constraints.Email
	private String email;
	
  public Contacts() {}

public int getContactId() {
	return contactId;
}

public void setContactId(int contactId) {
	this.contactId = contactId;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
  
@Override
public String toString() {
    return "Contacts{" +
            "address='" + address + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            "email='" + email + '\'' +
           
            '}';
}

}
