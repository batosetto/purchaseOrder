/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barbaratosetto
 */
public class AnnualFlowers {

    private final String[][] flowersArray = {{"Marigold", "2.3"},
                                             {"Pansy", "1.50"},
                                             {"Zinnias", "5.12"},
                                             {"Petunia", "3.25"}
    };
    private String flower;
    private double howMuch;  //quantity belongs to OrderFlowers
    
    public AnnualFlowers(String flowerName, double cost) {
        this.flower = flowerName;
        this.howMuch = cost;
    }
    
    public String getFlower(){
        return flower;
    }
    
    public void setFlower(String flowerName){
        this.flower = flowerName;
    }
    
    
    public double flowerPrice(){
        for(int i = 0; i < flowersArray .length; i++){
            if(flowersArray [i][0].equals(flower)){
                howMuch = Double.parseDouble(flowersArray [i][1]);
            }
        }
        return howMuch;
    }
    
     @Override
    public String toString() {
        String result = "";
        
         System.out.println("**Price Per Stem** \n" 
                 + MyUtilityClass.flowerArray2D(flowersArray));
         
         return result;
        
    }
    
}
