package librarysystem;

import java.util.ArrayList;

public class Member {
	private int memberId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	ArrayList<Address> addresses = new ArrayList<>();
	public Member (String firstName, String lastName, String phoneNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	//Getters & Setters starts here
	public void setMemberId(int memberId){
		this.memberId = memberId;
	}
	public int getMemberId(){
		return memberId;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setAddress(Address address){
		addresses.add(address);
	}
	public ArrayList<Address> getAddress(){
		return this.addresses;
	}
	//Getters & Setters end here
}
