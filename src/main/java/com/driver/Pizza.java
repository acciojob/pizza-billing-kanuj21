package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";


    private int ExtraCheese = 0;
    private  int ExtraToppings = 0;
    private int Takeaway = 0;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            this.price = 300;
        else
            this.price = 400;


        //this.bill = "Base Price Of The Pizza: toString";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
            ExtraCheese += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
            this.ExtraToppings += 70;
        else
            this.ExtraToppings += 120;
    }

    public void addTakeaway(){
        // your code goes here
        this.Takeaway += 20;
    }

    public String getBill(){
        // your code goes here
        //String basePrice = toString(this.price);
        int total = Takeaway + ExtraToppings + ExtraCheese + price;
        bill += "Base Price Of The Pizza : "+price+"\n";

        if(ExtraCheese > 0)
            bill += "Extra Cheese Added: "+ExtraCheese+"\n";
        if(ExtraToppings > 0)
            bill += "Extra Toppings Added: "+ExtraToppings+"\n";
        if(Takeaway > 0)
            bill += "Paperbag Added: "+Takeaway+"\n";

        bill += "Total Price: "+total+"\n";
        return this.bill;
    }
}
