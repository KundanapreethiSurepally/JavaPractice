import java.util.Scanner;

public class QuestionService {
    
    Question[] questions=new Question[5];//array of references

    public QuestionService()
    {
        //now we are creating object
    
        questions[0] = new Question(1, "size of int", new String[]{"2", "6", "4", "8"}, "4");
        questions[1] = new Question(2, "size of double", new String[]{"2", "6", "4", "8"}, "8");
        questions[2] = new Question(3, "size of char", new String[]{"2", "6", "4", "8"}, "2");
        questions[3] = new Question(4, "size of long", new String[]{"2", "6", "4", "8"}, "8");
        questions[4] = new Question(5, "size of boolean", new String[]{"1", "2", "4", "8"}, "1");


    }

    /**
     * 
     */
    public void playQuiz()

    {
        Scanner sc=new Scanner(System.in); 
        int score=0;
        for(int i=0;i<questions.length;i++)
        {
        System.out.println("Question No.: "+questions[i].getId());
        System.out.println(questions[i].getQuestion());

        String[] options=questions[i].getOpt();
       
        for(int j = 0; j < options.length; j++) {
            System.out.println((j + 1) + ": " + options[j]);
        }
        // Get user's answer for each question
        System.out.print("Your answer: ");
        String userAns = sc.nextLine();  // Still collects input for each question

       
       // String userAns=questions[i].getAnswer();
        if(userAns.equals(questions[i].getAnswer()))
        {
            System.out.println("Your Answer is Correct");
            score++;
        }
        else{
            System.out.println("Wrong Answer");
            System.out.println("Correct Answer: "+questions[i].getAnswer());

        }
        
        
         }

         System.out.println("Total Score:  "+score);
    }

}



