import java.util.Scanner;

public class Q6 {
  public static void main(String[] args){

    //your code here
    boolean counter = true;
    Scanner scan = new Scanner(System.in);

  
      double[] notes = new double[10] ;

      System.out.println("Please Enter 10 numbers, the grade must be between 0.0 and 100.0:");

        
      for (int i=0;i<10;i++)
      {
        double grade_inputed = scan.nextDouble();
      
        while (grade_inputed <0.0 || grade_inputed>100.0)
        {
          System.out.println(" Please enter a  number between 0.0 and 100.00: ");
          grade_inputed = scan.nextDouble();
        }
        notes[i]= grade_inputed;

      }

      double[] test = sort(notes);
      
      for (int i=0;i< test.length;i++)
        System.out.println(test[i]);

      //testing
      /*
      for (int i=0;i<10;i++)
      {
          System.out.println(notes[i]);
      }
      */
      
      //PRINT OUT VALUES
      double ave = calculateAverage(notes);
      System.out.println("the average is: " + ave);
      
      int passed = calculateNumberPassed(notes);
      System.out.println("You passed: " + passed +" classes");
      
      double median = calculateMedian(notes);
      System.out.println("Your median: " + median +" classes");
      
      int fail = calculateNumberFailed(notes);
      System.out.println("You failed: " + fail + " classes");
      
      
      
      
  }

  public static double calculateAverage(double[] notes){
    //your code here
    double sum =0;
    double average = 0;
    for(int i=0;i<notes.length;i++){
      sum=sum+ notes[i];

    }
    average = sum/notes.length;
    return average;

  }


  public static double calculateMedian(double[] notes){
    //your code here
    
    // arrange in order
    notes=sort(notes);
    
    //calculate median
    
    double median;
    int middle = notes.length/2;
    //if lenght odd
    if (notes.length%2!=0){
      median = notes[middle];

    }else{
      median = notes[middle]+notes[middle-1];
      median = median/2;

    }
  
    return median;
  }

  public static int calculateNumberFailed(double[] notes){
    //your code here
    int fail =0;
    for( int i=0; i<notes.length;i++)
    {
        if (notes[i]<50.0){
            fail++;
        }
    }
    return fail;
  }

  public static int calculateNumberPassed(double[] notes){
    //your code here
    int passed =0;
    for( int i=0; i<notes.length;i++)
    {
        if (notes[i]>50.0){
            passed++;
        }
    }
    return passed;
  }
  //exmaple given in the lab for sorting
  public static double[] sort(double[] xs){
      int i, j, argMin; 
      double tmp;

      for (i = 0; i < xs.length - 1; i++) {
        argMin = i;
        for (j = i + 1; j < xs.length; j++) {
          if (xs[j] < xs[argMin]) {
           argMin = j;
         }
      }

       tmp = xs[argMin];
       xs[argMin] = xs[i];
       xs[i] = tmp;
     }
      return xs;

  }
  

}
