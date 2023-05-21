package patronMemento;

import java.util.List;
import java.util.ArrayList;

public class Caretaker {
	private List<RegistroMemento> mementos;
	
	public Caretaker() {
		mementos = new ArrayList<>();
	}
	
	public void addMemento(RegistroMemento m) {
		mementos.add(m);
	}
	
	public RegistroMemento getMemento(int index) {
		return mementos.get(index);
	}
}