package stack;
 
import java.util.ArrayList;
 
public abstract class OOStack {// OOStack va a ser la clase virtual de las otras dos
	protected ArrayList<String> contents = new ArrayList<String>();

	public abstract boolean isEmpty();
 
	public abstract OOStack push(String string);

	public abstract String pop();

	public abstract String top();

	public abstract int size(); 
}
