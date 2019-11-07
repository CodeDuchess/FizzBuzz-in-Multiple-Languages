public class FizzBuzz {
  
  public static void main(String[] args) {
    printFizzBuzz(100);
  }
  public static void printFizzBuzz(int n) {
//create a for loop to cycle thorugh all the numbers from 1 to 100    
    for (int i = 1; i <= n; i++) {
   // create a conditional statment to determine divisibility by 3 and 5 and both 3 and 5
     if ((i % 3 == 0) && (i % 5 == 0)){
         System.out.println("FizzBuzz");
     }
      else if (i % 3 == 0) {
        System.out.println("Fizz");
      }
      else if (i % 5 == 0) {
        System.out.println ("Buzz");
      }
      // if the number does not fit any of the conditions above, simply print it to the screen
      else {
        System.out.println(i);  
      }   
    }
  } 
 }
