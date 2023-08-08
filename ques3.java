package Aug8Test;
import java.util.*;
interface MenuItem {
	float totalPrice(int choice, String order);
}

class Sandwich implements MenuItem {
	HashMap<String, Float> sandwichRate
    = new HashMap<>();
	 {
		 sandwichRate.put("cheeseburger",(float) 2.75);
		 sandwichRate.put("clubsandwich",(float) 2.75);
		 sandwichRate.put("hamburger",(float) 100.2);
		 };
	public float totalPrice(int choice, String order) {
//		if(choice==0)
			return this.sandwichRate.get(order);
		// TODO Auto-generated method stub
//		return 0;
	}
	
}

class Salad implements MenuItem {
	HashMap<String, Float> saladRate
    = new HashMap<>();
	 {
		 saladRate.put("spinachsalad",(float) 1.15);
		 saladRate.put("fruitsalad",(float) 20);
		 saladRate.put("coleslaw",(float) 3.50);
		 };

	public float totalPrice(int choice, String order) {
//		if(choice==1)
			return this.saladRate.get(order);
		// TODO Auto-generated method stub
//		return 0;
	}
}

class Drink implements MenuItem {
	HashMap<String, Float> drinkRate
    = new HashMap<>();
	 {
		 drinkRate.put("orangesoda",(float) 1.25);
		 drinkRate.put("cappuccino",(float) 2.30);
		 drinkRate.put("milkshake",(float) 100);
		 };
	public float totalPrice(int choice, String order) {
//		if(choice==2)
			return this.drinkRate.get(order);
//		return 0;
	}
	
}

class Trio implements MenuItem {
	public float totalPrice(int choice, String order) {
		if(choice==3)
		{
			String[] list=new String[3];
			list=order.split("/");
			for(int i=0;i<3;i++)
				System.out.println(list[i]);
			String sandwich=list[0].replace(" ", "");
			sandwich=sandwich.toLowerCase();
			Sandwich sandwichR=new Sandwich();
			float sandwichPrice = sandwichR.totalPrice(0, sandwich);
			
			String salad=list[1].replace(" ", "");
			salad=salad.toLowerCase();
			Salad saladR=new Salad();
			float saladPrice = saladR.totalPrice(1, salad);
			
			String drink=list[2].replace(" ", "");
			drink=drink.toLowerCase();
			Drink drinkR=new Drink();
			float drinkPrice = drinkR.totalPrice(1, drink);
			List <Float> Prices = new ArrayList<Float>();
			Prices.add(sandwichPrice);
			Prices.add(saladPrice);
			Prices.add(drinkPrice);
			Collections.sort(Prices);
			return Prices.get(2) + Prices.get(1);
		}
		return 1;
		}
}

public class ques3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the following\n1. Sandwich\n2. Salad\n3. Drink\n4. Trio");
		int n=sc.nextInt();
		if(n==4)
		{
			String s=sc.next();
			s=s.replace(" ", "");
			s=s.toLowerCase();
			Trio t=new Trio();
			System.out.println("$"+t.totalPrice(3,s));
		}
		if(n==3) {
			String s=sc.next();
			s=s.replace(" ", "");
			s=s.toLowerCase();
			Drink t=new Drink();
			System.out.println("$"+t.totalPrice(2,s));
		}
		if(n==2) {
			String s=sc.next();
			s=s.replace(" ", "");
			s=s.toLowerCase();
			Salad t=new Salad();
			System.out.println("$"+t.totalPrice(1,s));
		}
		if(n==1) {
			String s=sc.next();
			s=s.replace(" ", "");
			s=s.toLowerCase();
			Sandwich t=new Sandwich();
			System.out.println("$"+t.totalPrice(1,s));
		}
		// TODO Auto-generated method stub

	}

}
