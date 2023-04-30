package stack;

import java.util.ArrayList;

class StackWithElements extends OOStack {
	private ArrayList<String> contents = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return contents.isEmpty();
    }
 
    @Override
    public OOStack push(String string) {
        contents.add(string);
        return this;
    }

    @Override
    public String pop() {
    	return contents.remove(contents.size() - 1);
    }

    @Override
    public String top() {
        return contents.get(contents.size() - 1);
    }

    @Override
    public int size() {
    	int contador = (int) contents.stream().count();
    	return contador;
    }
}