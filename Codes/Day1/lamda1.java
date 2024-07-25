// what if we have return type -> How to use in Lamda expression

interface A{
    int add(int a,int b);
}

public class lamda1 {
    public static void main(String[] args) {
        // A obj = new A(){                // Anonymous class ???? 
        //     public int add(int a,int b)
        //     {
        //         return a+b;
        //     }
        // };
        // int r=obj.add(2,4);
        // System.out.println(r);

        // whenever you have one statement and that statement is return simply removed that statement
        A obj = (a, b) ->  a+b;    // Lamda Expression
        // if we have more method then see above line which method you are implmenting is confusing for compiler
        // that' why lambda expression is only work with funtional interface

    }
}
