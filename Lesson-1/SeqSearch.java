import java.util.Scanner;

//Author: Gloria Ngan

public class SeqSearch{
  
  /* 
   * Method that generates an array of random 
   * distinct ints under a certain num.
   */ 
  public static int[] generateNums(){
    int[] nums = new int[100];
    for(int i = 0; i < 200; i++){
        int rand = ((int)(Math.random() * 200) + 1);
        for(int j = 0; j < nums.length; j ++){
          if(rand == nums[j])
            
          else
            nums[i] = rand;
        }
    }
    
    return nums;
  }
  
  public static void search(int[] list, int target){
    int comparisons = 0;
    for(int i = 0; i < list.length; i++){
      if(target != list[i])
        comparisons ++;
      else
        break;
    }
    System.out.println("The number of comparisons made was " + comparisons);
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("What number are you searching for?");
    int t = scan.nextInt();
    
    search((generateNums()), t);
  }
}
