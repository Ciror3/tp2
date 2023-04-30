package stack;
 
import java.util.ArrayList;
 
public abstract class PrimeStack {  
	protected ArrayList<String> contents = new ArrayList<String>();

	public abstract boolean isEmpty();
 
	public abstract PrimeStack push(String string);

	public abstract String pop();

	public abstract String top();

	public abstract int size(); 
}
