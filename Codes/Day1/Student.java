// Practise for enhanced loop and array of object 
public class Student {
    int rollno;
    String name;
    int marks;

    
    public static void main(String[] args) {
        Student s1 = new Student();   // creating object of first student   // manually creating object and assigning below.
        s1.name="Avi";
        s1.marks=10;

        Student s2 = new Student();   // creating object of second student
        s2.name="Avinash";
        s2.marks=20;
        
        
        // **
        Student std[]=new Student[2];     // here we are not creating 2 distinct object, we are creating array to hold Student(class) references
        // above s1 and s2 object will become the part of this array.
        std[0]=s1;   // first references is getting stored here.
        std[1]=s2;
        // Above we got two object in an array std[].
        

        // Enhanced LOOP or For-each loop
        for(Student s:std)
        {
            System.out.println(s.name+": "+s.marks+":"+s.rollno);
        }
        
        
    }
}

