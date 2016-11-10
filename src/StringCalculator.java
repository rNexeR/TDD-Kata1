/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rnexer
 */
public class StringCalculator {

    static int add(String numbers) throws NegativeNotAllowedException {
        String delimeters = "[,\\\n]";
        if(numbers.contains("//")){
            //change delimeters
            String parts[] = numbers.split("\n", 2);
            numbers = parts[1];
            String delimeters_parts[] = parts[0].split("//");
            delimeters = delimeters_parts[1];
            //System.out.println("New Delimeter: " + delimeters);
        }
        
        int suma = 0;
        String negatives = "";
        if(numbers.equals(""))
            suma = 0;
        else{
            //System.out.println("Array of numbers to sum: " + numbers);
            String arreglo[] = numbers.split(delimeters);
            for (String actual_pos : arreglo) {
                int num = Integer.parseInt(actual_pos);
                //System.out.println("String to parse to int: " + arreglo[i]);
                suma += num;
                if (num < 0) {
                    negatives += actual_pos + " ";
                }
            }
        }
        if(negatives.length() > 0){
            //System.out.println(negatives);
            throw new NegativeNotAllowedException(negatives);
        }else
            return suma;
    }
    
}
