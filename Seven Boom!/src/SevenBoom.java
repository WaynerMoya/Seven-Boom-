/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SevenBoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Create a function that takes an array of numbers and return "Boom!"
        if the number 7 appears in the array. Otherwise, return "there is no 7 in the array".
        
        Examples
        
        sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"

        sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"

        sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
        
        */
        
        int[] array= {8, 6, 33, 100};
        
        System.out.println(sevenBoom(array));     
    }
    
    public static String sevenBoom(int[] array){
        
        for (int i = 0; i < array.length; i++) {
            
            String x = Integer.toString(array[i]);
            
            for (int j = 0; j < x.length(); j++) {
               
                char temp = x.charAt(j);
                
                int comprobacion = Character.getNumericValue(temp);
                
                if(comprobacion == 7){
                    return "Boom!";
                }    
            }            
        }
        
        return "there is no 7 in the array";
    }
    
}
