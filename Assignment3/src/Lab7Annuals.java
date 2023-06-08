
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author barbaratosetto
 */
public class Lab7Annuals {

    public Lab7Annuals () {
        
        OrderFlowers newOrder = new OrderFlowers();
        newOrder.userInput();
        System.out.println(newOrder.toString());
        
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        new Lab7Annuals();
    }
    
}
