public class Q3_ArrayInsertionDemo {

  public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
    // Your code here
    int[] NewArray;
    NewArray = new int[beforeArray.length+1];
    boolean counter = false;
  
      for( int i=0;i< NewArray.length;i++)
      {
        if( i== indexToInsert)
        {
          NewArray[indexToInsert]=valueToInsert;
          counter=true;
        }
        if (i!=beforeArray.length)
        {
          if(counter){
            NewArray[i+1]=beforeArray[i];
          }else{
            NewArray[i]=beforeArray[i];
          }
        }
      }

    return NewArray;
  }

  public static void main(String[] args){
    // Your code here
    int[] MyArray;
    MyArray =  new int[]{1,5,4,7,9,6};
    
    System.out.println("Array before insertion");
    for(int i=0;i<6;i++)
    {
      System.out.println(MyArray[i]);
    }
     MyArray= insertIntoArray(MyArray, 6, 0);

    System.out.println("Array after insertion:");
    for(int i=0;i<7;i++)
    {
      System.out.println(MyArray[i]);
    }
    
  }
}
