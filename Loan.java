package librarysystem;

import java.util.GregorianCalendar;

public class Loan {
	private Copy copy;
	private Member member;
	private GregorianCalendar dueReturnDate;
	private GregorianCalendar checkOutDate;
	private GregorianCalendar actualRetrunDate;
	
	public void setDueReturnDate(GregorianCalendar dueReturnDate){
		this.dueReturnDate = dueReturnDate; 
	}
	public GregorianCalendar getDueReturnDate(){
		return dueReturnDate;
	}
	public void setcheckOutDate(GregorianCalendar checkOutDate){
		this.checkOutDate = checkOutDate;
	}
	public GregorianCalendar getCheckOutDate(){
		return checkOutDate;
	}
	public void setActualRetrunDate(GregorianCalendar actualRetrunDate){
		this.actualRetrunDate = actualRetrunDate;
	}
	public GregorianCalendar getActualRetrunDate(){
		return actualRetrunDate;
	}
}