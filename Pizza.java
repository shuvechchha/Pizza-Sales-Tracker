import java.util.ArrayList;
/*
The Pizza class should be a public abstract class that describes a generic pizza.

The class should have a protected instance variable, toppings, that is an ArrayList of Topping instances that are toppings on this particular pizza. As a protected instance variable it will be accessible by subclasses but not external classes.

The class should have a void method addTopping that takes a Topping instance and adds it to the toppings ArrayList.

The class should have an abstract method basePrice that returns a double that is the base price of the the pizza. This method will be implemented by the subclasses of Pizza, TraditionalPizza and DeepDishPizza.

The class should have a private toppingsPrice method that returns a double that is the sum of the prices of the toppings on the pizza.

The class should have a totalPrice method that returns a double that is the total price of the pizza, which is the sum of the basePrice and the toppingsPrice.
*/

public abstract class Pizza{
  // 
  protected ArrayList<Topping> toppings;

  /**
   *
   */
  public Pizza(){
    toppings = new ArrayList<Topping>();
  }  

  /**
   *
   *@param
   */
  public void addTopping(Topping topping){
    toppings.add(topping);
  }
  /**
   * Abstract method that returns the base price of the pizza. 
   */
  public abstract double basePrice();

  /**
   *
   */
  private double toppingsPrice(){
    double toppingsPrice = 0;
    for(Topping topping: toppings){
      toppingsPrice += topping.price;
    }
    return toppingsPrice;
  }
  
  /**/
  public double totalPrice(){
    return this.toppingsPrice() + this.basePrice();
  }
}