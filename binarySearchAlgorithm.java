public class binarySearchAlgorithm {
    public static int binarySearch (int[] numbers, int key){
        int start = 0 ;        // Initialization
        int last = numbers.length -1 ; // (n-1)
        int found = -1 ;

        while (start <= last){
            int middle = (start+last)/2 ;

            if (numbers[middle] == key) // Will search element within a respective boundary.
                found = middle ;

            if (numbers[middle] > key) // Element to the Leftside.
                last = middle - 1 ;
                else
                start = middle + 1 ;  // Element to the Right side.
        }
        return found ;
    }
    public static void main(String[] args) {
      int []numbers = {2,1,0,6,7,9,50,4,22,} ;
      int key = 50 ;
      int found = binarySearch(numbers , key) ; // Passing Array by reference.

      if (found == -1)    // Invalid Index
          System.out.println("Not found!");
      else
          System.out.println("Found at index : "+ found);
    }
}