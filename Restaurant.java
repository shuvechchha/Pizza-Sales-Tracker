
import java.util.ArrayList;
/*
The Restaurant class is a public class that keeps track of our restaurant. As there is only ever one restaurant, we will never instantiate this class. All of its instance variables and methods will be static (meaning they belong to the class as a whole, not a particular instance).

The class should have a static instance variable, orders, that is an ArrayList of Order instances. These are all of the orders that have been placed at the restaurant.

The class should have a static instance variable, toppings, that is an ArrayList of Topping instances. These are all of the available toppings to put on a pizza.

The class should have a static void method addOrder that takes an Order instance and adds it to the orders ArrayList.

The class should have a static int method orderCount that returns the number of orders in the orders ArrayList.

The class should have a static double method priciestOrder that returns the price of the order with the highest price in the orders ArrayList.

The class should have a static void method addTopping that takes a Topping instance and adds it to the toppings ArrayList.

The class should have a static method getTopping that takes a String name of a topping and returns the corresponding Topping instance. It should return null if a Topping with that name can't be found.

The class should have a static void method printOrders that prints out all of the orders in the orders ArrayList. Remember that the Order class has its own toString method to convert an Order to a String.
*/

public class Restaurant{
  static ArrayList<Order> orders = new ArrayList<Order>();
  static ArrayList<Topping> toppings = new ArrayList<Topping>();
  
  static void addOrder(Order order){
    orders.add(order);
  }

  static void addTopping(Topping topping){
    toppings.add(topping);
  }
  
  static Topping getTopping(String toppingName){
    for(Topping topping : toppings){
      if (topping.name.equals(toppingName)){
        return topping;
      }
    }
    return null;
  }

  static void priciestOrder() {
    for(Order order: orders) {
        order.getPriciestPizza();
    }
  }

  static void averagePrice() {
    for(Order order: orders) {
        order.getAveragePizzaPrice();
    }
  }

  static void printOrders(){
    System.out.println("\n\n--------------------------------\n");
    System.out.println("\t\t\tOrders \n");
    System.out.println("--------------------------------\n");    
    for(Order order: orders){
      System.out.println(order.toString());
    }    
  }
}
 