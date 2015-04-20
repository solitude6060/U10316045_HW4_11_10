import java.util.ArrayList;

//MyStack extends ArrayList as generic type
public class MyStack<E> extends ArrayList<E> {
	
	//isEmpty() method check if the list is empty or not 
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	//get the size
	public int getSize(){
		return super.size();
	}
	
	//look into the program 
	public E peek(){
		return super.get(getSize() -1 );
	}
	
	//take out the object from the last of list
	public E pop(){
		E o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}
	
	//put object into 
	public void push(E o){
		super.add(o);
	}
	
	//override the toString method
	@Override
	public String toString(){
		return "stack" + super.toString();
	}
}
