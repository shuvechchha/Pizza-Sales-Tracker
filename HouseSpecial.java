public class HouseSpecial extends Pizza{

  public double basePrice(){
    return 12.00;
  }

  public String toString(){
    return "\n House Special Pizza \n Base Price: 12.00 \n Total Price: " + this.totalPrice() + " \n";
  }

}