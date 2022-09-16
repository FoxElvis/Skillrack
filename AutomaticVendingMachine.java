/*
Automatic Vending Machine
Coffee:
  1.Espresso Coffee
  2.Cappuccino Coffee
  3.Latte Coffee
Tea:
  1.Plain Tea
  2.Assam Tea
  3.Ginger Tea
  4.Cardamom Tea
  5.Masala Tea
  6.Lemon Tea
  7.Green Tea
  8.Organic Darjeeling Tea
Soups:
  1.Hot and Sour Soup
  2.Veg Corn Soup
  3.Tomato Soup
  4.Spicy Tomato Soup
Beverages:
  1.Hot Chocolate Drink
  2.Badam Drink
  3.Badam-Pista Drink
  
Input:
  C
  1
Output:
  Enjoy Your Espresso Coffee

Input:
  t
  7
Output:
  Enjoy Your Green Tea

*/


import java.util.*;
public class AutomaticVendingMachine {
	public static void main(String[] args) {
        String coffee[]={"","Espresso Coffee","Cappuccino Coffee",
                                    "Latte Coffee"};
        String tea[]={"","Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea",
                        "Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"}; 
        String soups[]={"","Hot and Sour Soup","Veg Corn Soup",
                            "Tomato Soup","Spicy Tomato Soup"}; 
        String beverages[]={"","Hot Chocolate Drink","Badam Drink",
                                "Badam-Pista Drink"};
        Scanner sc = new Scanner(System.in);
        char m=sc.next().charAt(0); 
        int s=sc.nextInt(); 
        String ans="Enjoy Your "; 
        if((m=='C'||m=='c') && s<=3)ans+=coffee[s]; 
        else if((m=='T'||m=='t') && s<=8)ans+=tea[s]; 
        else if((m=='S'||m=='s') && s<=4)ans+=soups[s]; 
        else if((m=='B'||m=='b') && s<=3)ans+=beverages[s]; 
        else ans="Invalid Option!"; 
        System.out.print(ans);
    }
}
