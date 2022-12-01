import java.util.Scanner;

public class SeqSearch{
  
  /* 
   * Method that generates an array of random 
   * distinct ints under a certain num.
   */ 
  public static int[] generateNums(){
    int[] nums = new int[100];
    for(int i = 0; i < 200; i++){
        int rand = ((int)(Math.random() * 200) + 1);
//        for(int j = 0; j < nums.length; j ++){
//          if(rand == nums[j])
//            generateNums();
//          else
//            nums[i] = rand;
//        }
    }
    return nums;
  }
  
  /* 
   * Sequential search method.
   * Params: An array of ints to search thru and the int
   * to search for.
   */ 
  public int sequentialSearch(int[] list, int target){
    int comparisons = 0;
    for(int i = 0; i < list.length; i++){
      if(target != list[i])
        comparisons ++;
      else
        break;
    }
    return comparisons;
  }
  
  /*
   * Binary search method.
   */ 
  public int binarySearch(int[] a, int target){
    int mid = a.length / 2;
    while(a[mid] != target){
      if(a[mid] < target)
        mid += (a.length / mid) / 2;
      else if(a[mid] > target)
        mid -= mid/2;
    }
    return mid;
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //generateNums();
    int[] test = [1, 3, 7, 19, 37, 4];
    //System.out.print("What number are you searching for?");
    //int t = scan.nextInt();
    
    //search((generateNums()), t);
  }
}
