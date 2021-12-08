package quiz;

import javax.persistence.Entity;

@Entity
public class person {
	
	private int PersonID;
	private String Name;
	private String Surname;
	public int getPersonID() {
		return PersonID;
	}
	public void setPersonID(int personID) {
		PersonID = personID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	
	
}
