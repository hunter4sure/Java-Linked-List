package obj;

public class LinkedList {
	
	private Node head;

	public LinkedList() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		
		return ( head==null );
	} 

	public boolean Add(String data) {
		 
		boolean success = false;
		
		if(data != null) {
			
			Node node = new Node(data);
			node.Next = head;
			head = node;
			success = true;
		}
		
		return success;
	}
	
	public boolean Remove() {
		
		boolean removed = false;
		if(head != null) {
			
			head = head.Next;
			removed = true;
		}
		return removed;
	}
	
	public void Display() {
		
		Node current = head;
		while(current != null) 
		{
			System.out.println(current.toString());
			current =current.Next;
		}
	}
}
