/*
The DeepDishPizza class should be a public class that is a subclass of Pizza.

The class should implement the basePrice method as defined in the Pizza class. The base price of a DeepDishPizza is 10.99.

The class should have a public toString method that returns a String description of the Pizza.
*/

public class DeepDishPizza extends Pizza{

  public double basePrice(){
    return 10.99;
  }

  public String toString(){
    return " \n Deep Dish Pizza \n Base Price: 10.99 \n Total Price: " + this.totalPrice() + " \n";
  }

}