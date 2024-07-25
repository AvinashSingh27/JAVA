

class Hello
{
public static void main(String a[])
{
    //System.out.println("Hello world");
    //System.out.println(3+5);
    //System.out.println(3+50);

    //int b = 12;  // here it will print 12 becuase 12 comes in range of byte
    int b = 257;
    byte k = (byte) b;
    System.out.println(k);
    // it will give 1 because here it is performing modulus operation
    // 257 is modulus with range of byte. 257%256.


}
}