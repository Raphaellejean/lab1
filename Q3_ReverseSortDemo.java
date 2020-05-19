public class Q3_ReverseSortDemo {

  public static void main(String[] args){
    char[] unorderedLetters;
    unorderedLetters = new char[]{'x', 'a', 'c', 'm', 'r', 'p'};
    reverseSort(unorderedLetters);
    for (int i = 0 ; i < unorderedLetters.length; i++ )
      System.out.print(unorderedLetters[i]);
  }

  //method that sorts a char array into its reverse alphabetical order
  public static void reverseSort(char[] values){

    //your code here
    int i, j, Min; 
    char tmp;

      for (i = 0; i < values.length - 1; i++) 
      {
        Min = i;
        for (j = i + 1; j < values.length; j++) 
        {
           if (values[j] > values[Min]) 
           {
             Min = j;
           }
       }
        tmp = values[Min];
        values[Min] = values[i];
        values[i] = tmp;
     }
  }

}
