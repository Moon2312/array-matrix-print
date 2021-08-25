
package javaapplication25;

import java.util.Scanner;


public class JavaApplication25 {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        
        int[][] number=new int[2][3];
        System.out.println("A");
        for(int row = 0;row<2;row++){
            for(int col = 0;col<3;col++){
                number[row][col]=input.nextInt();
            }
        }
        
        
        
        for (int row=0;row<2;row++){
            for(int col =0;col<3;col++){
                System.out.print(" "+number [row][col]);
            }
                System.out.println(" ");
              
                
        }
    }
    
}
