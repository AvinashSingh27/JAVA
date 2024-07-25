// try with multiple catch blo

class AviExceptions extends Exception{    // Custom Exception
    public AviExceptions(String s){
        super(s);  // calling superclass constructor
    }
}
public class tryCatch {
    public static void main(String[] args) {
        //int i=0;
        //int i=2;
        int i=20;   //  if we dont want our j value is ZERO and also 
        int j=0;

        int arr[] = new int[5];

        try{
            j=18/i;
            if(j==0)
                throw new AviExceptions("I dont want to print Zero");   // creating the object of arithmetic Exceptions();
            
            
            //System.out.println(arr[1]);
            //System.out.println(arr[5]);
        }
        catch(AviExceptions e)
        {
            j=18/1;   // Here we doing some operation not just priting the error message
            System.out.println("That's the defualt value I have " + e.getMessage());   
            //System.out.println("Can not divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be into your limit");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println(j);

    }
}
