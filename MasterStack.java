package stack;

class MasterStack{ 
	public static String stackEmptyErrorDescription = "Stack is empty!!";
    private PrimeStack currentState;
 
    public MasterStack() {
        currentState = new StackWithoutElements();
    } 

    public boolean isEmpty() {
        return currentState.isEmpty();
    }

    public PrimeStack push(String string) {
        currentState = currentState.push(string);
        return currentState; 
    }
  
    public String pop() {
        String result = currentState.pop();
        currentState = currentState.isEmpty() ? new StackWithoutElements() : currentState;
        return result; 
    } 

    public String top() {
        return currentState.top();
    }

    public int size() {
        return currentState.size();
    }
}