
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barbaratosetto
 */
public class OrderFlowers { 
    
    private int quant;
    private AnnualFlowers annualFlowers;
    
    public OrderFlowers() {
        annualFlowers = new AnnualFlowers("", quant);
    }
    
    public void userInput(){
        Scanner scan = new Scanner(System.in);
        
        AnnualFlowers[] order1 = new AnnualFlowers[10];
        String customer = "";
        int input = 0;
        do{
            System.out.println("Type the flower and the quantity for your order "
                    + "(please separate the information with a coma). "
                    + "Enter exit to stop the order.");
            customer = scan.next();
            if(!customer.equals("exit")){
                String[] information = customer.split(",");
                String flower = information[0];
                int quantity = Integer.parseInt(information[1]);
                order1[input] = new AnnualFlowers(flower, quantity);
                input++;
            }
        }while (!customer.equals("exit"));
    }
    
    public double totalOrder(){
        double flowerPrice = annualFlowers.flowerPrice();
        double totalPrice = (flowerPrice * quant);
        
        return totalPrice;
    }
    
    @Override
    public String toString() {
        String result = "";
        
        System.out.println("********** Bill **********");
        
        return annualFlowers.toString() + result + "\n" +
                annualFlowers + "costs " + totalOrder() + "for " + quant + "stems.";
                
    }  
     
}
