// throws

class A{
    public void show() throws ClassNotFoundException
    {
        // try{
        // Class.forName("Cla");     // it throw classnotfound exceptions...(Checked Exceptions-> its compulsion to handle the exception)
        // }
        // catch(ClassNotFoundException e)
        // {
        //     System.out.println("Not able to find the class"+e);
        // }
        
        // In below we are simply saying i am not handling the exceptions and now its main resposibilty to handle the exceptions(beacz main is calling the show())
        Class.forName("Calc");
    }
}

public class trythrows {

    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        // try {
        //     obj.show();
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }


        try {
            obj.show();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();// print entire stack,which method calling which method..(You can track entire method call)
        }
    }
}
