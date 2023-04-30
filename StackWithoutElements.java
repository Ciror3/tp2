package stack;
 
class StackWithoutElements extends OOStack {
	@Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public OOStack push(String string) {
        return new StackWithElements().push(string);
    }

    @Override
    public String pop() {
        throw new Error(Stack.stackEmptyErrorDescription);
    }

    @Override 
    public String top() {
        throw new Error(Stack.stackEmptyErrorDescription);
    }
 
    @Override
    public int size() {
        return 0;
    }
}