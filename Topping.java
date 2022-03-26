/*
The Topping class should be a public class that stores the name (String) and price (double) of the topping. These should be 'final' instance variables to ensure they stay constant. 

The class should have a constructor that takes the name and price and sets them.
*/

public class Topping{
  
  // 
  final String name;
  final double price;
  
  /**/
  public Topping(String name, double price){
    this.name = name;
    this.price = price;
  }

}