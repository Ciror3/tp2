package stack;
 
class StackWithoutElements extends PrimeStack {
	@Override
    public boolean isEmpty() {
        return true;
    } 
  
    @Override
    public PrimeStack push(String string) {
        return new StackWithElements().push(string);
    } 

    @Override
    public String pop() {
        throw new Error(MasterStack.stackEmptyErrorDescription);
    } 

    @Override 
    public String top() {
        throw new Error(MasterStack.stackEmptyErrorDescription);
    }
 
    @Override
    public int size() {
        return 0;
    }
}