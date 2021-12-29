package machine;

import java.util.ArrayList;

public class SampleTest {

	public static void main(String[] args) {
		
		PhoneBook phoneBook = new PhoneBook();
		
		phoneBook.StoreUniqueNumbers("08119903792",new Details("David","idajilid@gmail.com"));
		phoneBook.StoreUniqueNumbers("08056674911",new Details("Victoria","lemy@gmail.com"));
		
		System.out.println(phoneBook.GetUniquePhoneDetails("08119903792"));
		
		ArrayList<String> allNums = phoneBook.GetAllPhoneNumbers();
		
		for(String num : allNums) System.out.println(num);
		
	}

}
