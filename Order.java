import java.util.*;
/*
The Order class should be a public class that describes an order of pizzas.

The class should have a private instance variable, pizzas, that is an ArrayList of Pizza instances that are the pizzas that make up the order. As a private instance variable external classes won't be able to access it. Hence the need for the addPizza function described later.

The class should have a 'static final' instance variable of type double that is the tax on an order. The tax is 5.3% (0.053 as a decimal). This should be set when the instance variable is defined. The variable is static because not every instance needs their own copy of this value, a static variable is shared among all of the instances.

The class should have a void method addPizza that takes a Pizza instance and adds it to the pizzas ArrayList.

The class should have a taxValue method that returns the tax on this order as a double.

The class should have a totalPrice method that returns a double that is the total price (including tax) of all of the orders. Sum the price of all of the pizzas and then apply the tax on top of that.

The class should have a public toString method that returns a String description of the order. This description should include descriptions of the pizzas in the order (remember that the Pizza subclasses have their own toString methods). The description should also include individual pizza prices, the tax, and total order price (including the tax).
*/

public class Order{

  //
  private ArrayList<Pizza> pizzas;
  static final double tax = 0.053;

  /**/
  public Order(){
    pizzas = new ArrayList<Pizza>();
  }
  /**/
  public void addPizza(Pizza pizza){
    this.pizzas.add(pizza);
  }
  /**/
  public double taxValue(){
    double totalPrice = 0.0;
    for(Pizza pizza : pizzas){
      totalPrice += pizza.totalPrice();
    }
    return totalPrice*0.053;
  }
  /**/
  public double totalPrice(){
    double totalPrice = 0.0;
    for(Pizza pizza : pizzas){
      totalPrice += pizza.totalPrice();
    }
    return totalPrice + taxValue();
  }
  /**/
  public String toString(){
    StringBuilder builder = new StringBuilder();
    for(Pizza pizza: pizzas){
      builder.append(pizza.toString());
      builder.append(System.lineSeparator());
    }
    builder.append("\nTotal Tax : " + this.taxValue());
    builder.append("\nOrder Total (Tax Included) : " + this.totalPrice());
    return builder.toString();
  }

  public void getPriciestPizza() {
    double priciest = 0.0;
    for(Pizza pizza : pizzas) {
      if(pizza.totalPrice() > priciest) {
        priciest = pizza.totalPrice();
      }
    }
   System.out.println("\nThe cost of the priciest order is " + priciest);
  }

  public void getAveragePizzaPrice() {
    double averagePrice = 0.0;
    double totalPrice = 0.0;
    for(Pizza pizza : pizzas) {
      totalPrice += pizza.totalPrice();
    }

    averagePrice = totalPrice/pizzas.size();
   System.out.println("\nThe average cost of a pizza is " + averagePrice);
  }

}