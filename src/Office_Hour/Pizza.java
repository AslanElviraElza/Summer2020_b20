package Office_Hour;

public class Pizza {
    String size;
    int numOfCheeseTopping;
    int numOfPepperoniTopping;
    public void setPizzaInfo(String size, int numOfCheeseTopping, int numOfPepperoniTopping){
        this.size =  size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoniTopping = numOfPepperoniTopping;
    }


    public double calcPrice(){
        int totalNumberOfTopping = numOfCheeseTopping+ numOfPepperoniTopping;
        double totalPriceOfTopping = totalNumberOfTopping *2;
        double totalPrice = totalPriceOfTopping;
        if(size.equalsIgnoreCase("small")){
            totalPrice += 10;
        }else if( size.equalsIgnoreCase("medium")){
            totalPrice += 12;
        }else{
            totalPrice += 14;
        }
        return totalPrice;
    }


    public String toString(){
        return "Size: "+size+"\nNumber of Cheese Topping: "+numOfCheeseTopping
                +"\nNumber of Pepperoni Topping: "+numOfPepperoniTopping
                +"\n Total Price: "+calcPrice();
    }

}
