package library;

import java.util.ArrayList;
import java.util.List;

public class GenericManager <T>{

	private List<T> items;
	
	public GenericManager() {
		items = new ArrayList<>();
	}
	
	public void add(T item) {
		items.add(item);
	}
	
	public void remove(T item) {
		items.remove(item);
		}
	public List<T> getAll(){
		return items;
	}
	
}
