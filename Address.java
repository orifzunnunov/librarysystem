package librarysystem;

public class Address {
	private String city;
	private String street;
	private int zipcode;
	private String state;
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return street;
	}
	public void setZipcode(int zipcode){
		this.zipcode = zipcode;
	}
	public int getZipcode(){
		return zipcode;
	}
	public void setState(String state){
		this.state = state;
	}
	public String getState(){
		return state;
	}
}
