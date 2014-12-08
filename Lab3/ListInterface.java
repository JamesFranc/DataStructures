//Interface for the List class

public interface ListInterface {


	public boolean isEmpty();
	public int size();
	public void add(int index, Student item) throws IndexOutOfBoundsException;
	public void remove(int index) throws IndexOutOfBoundsException;
	public Object getItem(int index) throws IndexOutOfBoundsException;
	public void removeAll();
}
