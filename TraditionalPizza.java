/*
The TraditionalPizza class should be a public class that is a subclass of Pizza. 

The class should implement the basePrice method as defined in the Pizza class. The base price of a TraditionalPizza is 8.99.

The class should have a public toString method that returns a String description of the Pizza.
*/

public class TraditionalPizza extends Pizza{

  public double basePrice(){
    return 8.99;
  }

  public String toString(){
    return "\n Traditional Pizza \n Base Price: 8.99 \n Total Price: " + this.totalPrice() + "\n";
  }
}