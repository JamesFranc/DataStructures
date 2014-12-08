
public interface QueueInterface {

	public boolean isEmpty();
	//Determines Whether the queue is empty
	//Preconditions: None.
	//Postconditions: Returns True if the queue is empty, otherwise returns false
	
	public void enqueue(Object newItem) throws QueueException;
	//Adds an item at the back of a queue
	//Precondition: newItem is the item to be inserted
	//if the operation was successful, newItem is at the back of the queue. 
	//Some implementations may throw QueueException if newItem cannot be added to the queue
	
	public Object dequeue() throws QueueException;
	//Retrieves and remove

}
