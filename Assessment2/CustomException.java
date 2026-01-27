package com.techouts.Assessment2;

class PayTheTax extends Exception {
    PayTheTax(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int earningBusinessMoney = 10000000;
       try {
           if(earningBusinessMoney > 1000000)
               throw new PayTheTax("Pay the tax");
           else {
               System.out.println("You can upto earn 10 lakhs per month");
           }
       }
       catch(PayTheTax p) {
           System.out.println(p.getMessage());
       }
    }
}
