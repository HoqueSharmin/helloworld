/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//compile on command line javac Assignment3.java  run  java assignment3
package assignment.pkg3;
import java.util.Random;

/**
 *
 * @author rafi
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       int in_circle_count=0;
       int n=100;
      // while(n<100000){
       double x,y,pi_estimate=0;
        Random random = new Random();
        long startTime=System.currentTimeMillis();
       for (int i=0;i<n;i++){
           x = random.nextDouble()*Math.pow(-1,random.nextInt());
            y = random.nextDouble()*Math.pow(-1,random.nextInt()); 
            if(x*x+y*y <=1){
                    in_circle_count++;
       
       }//end of if
          //  System.out.println(in_circle_count);
          pi_estimate = 4.0*in_circle_count/n;
          // System.out.println("pi_estimate"+pi_estimate);
           
        // TODO code application logic here
        long endTime=System.currentTimeMillis();
        System.out.println("Total execution time: "+(endTime-startTime));
        System.out.println("pi_estimate"+pi_estimate+"The value of i is :"+ i);
    }//end of loop
     //  System.out.println("pi_estimate"+pi_estimate+"The value of n is :"+ n);
      // n=n+10000;
       }//end of while loop
    
}//end of main


//end of class
/*Total execution time: 10
pi_estimate2.88The value of i is :99
Total execution time: 128
pi_estimate3.144The value of i is :999
Total execution time: 181490
pi_estimate3.139684The value of i is :999999
BUILD SUCCESSFUL (total time: 3 minutes 1 second



*/