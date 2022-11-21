package Laba_1.Task7;

import  Laba_1.Task7.Product.*;
public class check {
    public static void main(final String[] args) {
        final Pair[] productArray = new Pair[]{
                new Pair(new Product("Milk",10),10),
                new Pair(new Product("Cheese",20),20)
        };
        double  Sum = 0;
       for(final Pair i : productArray)
       {
           System.out.println("Product: Name: ["+i.getProduct().getName()+"] Price ["+i.getProduct().getPrice()+"] Count: ["+i.getCount()+"]");
           Sum += i.getProduct().getPrice() * i.getCount();
       }
       System.out.println("Sum of the products:"+Sum+"\n");
    }

}
