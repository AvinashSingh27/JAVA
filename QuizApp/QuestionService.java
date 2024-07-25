import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];  // array of references not the object creation 
    String selection[] = new String[5];   // when you dont know the value initially...
    
    public QuestionService(){
        questions [0] = new Question(1, "What", "Java", "C++", "C", "Spring", "Java");
        questions [1] = new Question(2, "Why", "Java", "C++", "C", "Spring", "Java");
        questions [2] = new Question(3, "where", "Java", "C++", "C", "Spring", "Java");
        questions [3] = new Question(4, "why", "Java", "C++", "C", "Spring", "Java");
        questions [4] = new Question(5, "What", "Java", "C++", "C", "Spring", "Java");   
    }

    public void playQuiz()
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        //for(int i=0;i<5;i++)
        for(Question q : questions)  
        {
        System.out.println("Question no. : " + q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println((q.getOpt3()));
        System.out.println(q.getOpt4());
        System.out.println("Enter your answer: ");
        
        //Scanner sc = new Scanner(System.in);

        selection[i] = sc.nextLine();

        // For checking answer
        if(selection[i].equals(q.getAnswer()))
            System.out.println("Correct Answer");
        else
            System.out.println("Wrong Answer");
        i++;
        }
        
        // Printing all answer...
        System.out.println("Printing all user input");
        for(String s : selection)
        {
            System.out.println(s);
        }
    }
}
