package machine;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
	
	public HashMap<String,Details> pNumbers = new HashMap<String,Details>();
	
	public PhoneBook() {
		
	}
	
	public void StoreUniqueNumbers(String pNumber, Details details) {
		
		/*can write more assertions e.g regex for checking if number is {0-9} strictly,
		 validity of email address, e.t.c. I'm not sure it's in scope of this exercise. */
		
		assert (pNumber.length() == 11) : "phone numbers must be 11 digits";
		assert (details != null) : "details can't be null";
		
		if(!pNumbers.containsKey(pNumber)) {
			pNumbers.put(pNumber, details);
		}
		
	}
	
	public String GetUniquePhoneDetails(String pNumber) {
		if(pNumbers.containsKey(pNumber)) {
			return pNumbers.get(pNumber).toString();
		}
		else return "Number not found!";
	}
	
	public ArrayList<String> GetAllPhoneNumbers(){
		ArrayList<String> allNumbers = new ArrayList<String>();
		for(String pNumber : pNumbers.keySet()) {
			allNumbers.add(pNumber);
		}
		return allNumbers;
	}
	
}
