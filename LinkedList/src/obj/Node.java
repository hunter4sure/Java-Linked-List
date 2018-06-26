package obj;

public class Node {

	String data;
	Node Next;
	
	
	
	public Node(String data) {
		super();
		this.data = data;
	}
	
	
	

	@Override
	public String toString() {
		return "(" + data + ")";
	}

}
