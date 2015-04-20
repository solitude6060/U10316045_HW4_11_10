
import java.util.Scanner;
public class MyStackTest {

	public static void main(String[] args) {
		MyStack<String> str =new MyStack<String>();
		Scanner input = new Scanner(System.in);
		String[] Chain = {"1","2","3","4","5"};
		
		System.out.println("Please enter five string into the program.");
		
		for(String i : Chain){
			System.out.print("Please enter No."+i+" string : ");
			str.push(input.next());
		}
		
		System.out.println("");
		System.out.println("Now displaying the Strings in reverse order.");
		
		while(!str.isEmpty()){
			System.out.println(str.pop());;
		}
		
		
	}

}
