/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


/**
 *
 * @author COSLAB
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check){

    int n = list.size();
        
    for(int i = 0; i < n; i++){
           
        if (check.test(list.get(i))) 
        {       
            return i; 
        }
    }
    
    return -1;
        
    }
            
            
   public static Predicate<String> findP(){
       return p -> p.length() == 5;
   }
            
   public static Predicate<Integer> findI(){
       return p -> p > 50;
   }
   
   public static Predicate<Integer> findX(){
       return p -> p > 150;
   }  
            
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> strList =  Arrays.asList("tiger","wolf","fox","fish","dog");
        List<Integer> numList = Arrays.asList(10,20,25,30,45,149);
        System.out.println("find the word that has five characaters");
        System.out.println(linearSearch(strList,findP()));
        System.out.println("find a number that is greater than 50");
        System.out.println(linearSearch(numList,findI()));
        System.out.println("find one that no match");
        System.out.println(linearSearch(numList,findX()));
    }
    
}
