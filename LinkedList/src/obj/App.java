package obj;


public class App {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		System.out.println(list.Add("Redeemer"));
		System.out.println(list.Add("Mocha"));
		System.out.println(list.Add("Lola"));
		System.out.println(list.Add("Hunter"));
		System.out.println(list.Add("Merium"));
		System.out.println(list.Add("Koko"));
		
		
		list.Display();
		list.Remove();
		list.Display();


	}

}
