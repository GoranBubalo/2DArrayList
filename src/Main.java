import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		// 2D ArrayList = a dynamic list of lists
		// You can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> BakeryList = new ArrayList<String>();
		BakeryList.add("Pasta");
		BakeryList.add("Garlic Bread");
		BakeryList.add("Donuts");
		
		
		
		ArrayList<String> ProduceList = new ArrayList<String>();
		ProduceList.add("Tomatos");
		ProduceList.add("zucchini");
		ProduceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("soda");
		drinksList.add("coffe");		
		
		
		groceryList.add(BakeryList);
		groceryList.add(ProduceList);
		groceryList.add(drinksList);
		
		//All the 2D ArrayList is Displayed 
		System.out.println(groceryList);
		System.out.println();
		//Output only the first list 
		System.out.println(groceryList.get(1));
		System.out.println();
		//Output an element from a list 
		System.out.println(groceryList.get(0).get(2));
	}

}
