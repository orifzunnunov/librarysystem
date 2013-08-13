package librarysystem;

public class Memeber {
	private int memberId;
	private String firstName;
	private String lastName;
	private String phoneNumber;

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
}
