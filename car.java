package quiz;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class car {
	@Id
	private int CarID;
	private int LicensePlate;
	private String make;
	private int model;
	
	@OneToMany(cascade= CascadeType.ALL)
	private person Owner;
	
	public int getCarID() {
		return CarID;
	}
	public void setCarID(int carID) {
		CarID = carID;
	}
	public person getOwner() {
		return Owner;
	}
	public int getLicensePlate() {
		return LicensePlate;
	}
	public void setLicensePlate(int licensePlate) {
		LicensePlate = licensePlate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	
}
