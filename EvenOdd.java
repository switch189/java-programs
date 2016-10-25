/**
Re-design and re-implement program Practice_6_2 (name it EvenOdd) such that
only one while loop is used to determine all even and odd numbers between 50 and 100. Again, printed all
even numbers on a single line, separated by commas, and all odd numbers on a new line, separated by
commas. Use proper labels for the output. Use escape character to lineup the outputs after the labels
**/



public class EvenOdd {
   public static void main(String [] args) {
      
   
      int evenNum = 50;
      int oddNum = 50;
      
      System.out.println("Even numbers between 50 and 100: ");
      
         while(evenNum <= 100  && oddNum <= 99)    //set condition for while loop so that it's not infinite
         {
            if(evenNum % 2 ==0)  //modulus to determine even
            {  
               System.out.print(evenNum + ", ");   //comma for proper output
            }
               boolean v = oddNum % 2 !=0; 
               System.out.print(oddNum + ", ");
            
            evenNum++;     //increment i
            oddNum++;     //increment o
         }
      System.out.print("Odd numbers between 50 and 100: \t"); 
      
      
       //System.out.println("100");   //print 100 to ensure no comma afterwards
   }
}
