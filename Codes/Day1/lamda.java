@FunctionalInterface
interface A
{
    void show();    // public abstarct by default
}
// class B implements A{
//     public void show(){
//         System.out.println("Hello");
//     }
// }

// Instead of creating class here,
// and Instantiate A by defining its ownn implementation as below
public class lamda {
    public static void main(String[] args) {
        //A obj = new B();
        //obj.show();


        // A obj = new A() {    // Anonymous class
        //     // trying instantiate class which implements the interface (Anonymous)
        //     public void show()
        //     {
        //         System.out.println("Hello");
        //     }
        // };

        // lamda Expression
        A obj = () -> System.out.println("Hello");
        obj.show();

        // what if method show is accepting value()
        //A obj = (int i) -> System.out.println(i);
        //A obj = i -> System.out.println(i);   // reduced code we dont have to write the type of variable or () if there is single variable
    }

    // lamda expression say we can simplify anonymous in a class.
    // Lamda exp -> it will not create a file of anonymous class file -> so it save amount of files you create (less file to manage)

    // what if we have a return type....
}
