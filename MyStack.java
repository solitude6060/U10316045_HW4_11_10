import java.util.ArrayList;

public class MyStack<E> extends ArrayList<E> {

	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public int getSize(){
		return super.size();
	}
	
	public E peek(){
		return super.get(getSize() -1 );
	}
	
	public E pop(){
		E o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}
	
	public void push(E o){
		super.add(o);
	}
	
	@Override
	public String toString(){
		return "stack" + super.toString();
	}
}
