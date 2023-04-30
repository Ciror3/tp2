package stack;

class Stack{ 
	public static String stackEmptyErrorDescription = "Stack is empty!!";
    private OOStack currentState;

    public Stack() {
        currentState = new StackWithoutElements();
    } 

    public boolean isEmpty() {
        return currentState.isEmpty();
    }

    public OOStack push(String string) {
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
//Stack tiene dos estados empty y nonempty entonces tenemos que poder transcionar