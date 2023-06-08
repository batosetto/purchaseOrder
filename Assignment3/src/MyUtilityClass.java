/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barbaratosetto
 */
public class MyUtilityClass {
    
    public static String flowerArray2D(String[][] fArray) {
    String result = "";
    
    for (int i = 0; i < fArray.length; i++) {
        for (int j = 0; j < fArray[i].length; j++) {
            result += String.format("%s ", fArray[i][j]);
        }
        result += "\n";
    }
    
    return result;
}

    
    
}
