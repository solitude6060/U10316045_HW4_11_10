
import java.util.Scanner;//scanner
public class MyStackTest {
//main method
	public static void main(String[] args) {
		MyStack<String> str =new MyStack<String>();//new arraylist object
		Scanner input = new Scanner(System.in);//new scanner
		String[] Chain = {"1","2","3","4","5"};//a string array
		
		//Asking for entering
		System.out.println("Please enter five string into the program.");
		
		//for loop 
		for(String i : Chain){
			System.out.print("Please enter No."+i+" string : ");//asking
			str.push(input.next());//put what user entering into MyStack 
		}
		
		System.out.println("");//blank a line
		System.out.println("Now displaying the Strings in reverse order.");
		
		//while loop
		while(!str.isEmpty()){//keep going until is list empty
			System.out.println(str.pop());//pop the object out from last
		}
		
		
	}

}
