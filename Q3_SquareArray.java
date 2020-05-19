public class Q3_SquareArray{

  public static int[] createArray(int size) 
  {
    // Your code here
    int[] myArray;
    myArray = new int[size];
    
    for(int i=0; i<size;i++){
      myArray[i] = i*i;
    }
      
    return myArray;
  }

  public static void main(String[] args)
  {
    // Your code here
    int[] myarry;
    myarry = new int[12];
    myarry =  createArray(12);
    for(int i=0;i<12;i++){
      
       System.out.println( "Square of "+ i +" is:" + myarry[i]);
      }
  }
}
