import java.util.Scanner;

public class QuestionService {
    Questions[] quizQuestions = new Questions[5];
    Scanner scanner = new Scanner(System.in);
    int correctAnswer=0;

    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        System.out.println("Welcome to the Quiz Console!");

        while (true) {
            System.out.println("1. Add a question");
            System.out.println("2. Take the quiz");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            int option = service.scanner.nextInt();
            service.scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    service.addQuestion();
                    break;
                case 2:
                    service.takeQuiz();
                    break;
                case 3:
                    System.out.println("Thank you for using the Quiz Console. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to add a question interactively
    public void addQuestion() {
        for (int i = 0; i < quizQuestions.length; i++) {
            if (quizQuestions[i] == null) {
                System.out.println("Add Question No " + (i + 1));
                System.out.print("Enter Question ID: ");
                int questionId = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Enter Question: ");
                String question = scanner.nextLine();

                System.out.print("Enter Option 1: ");
                String opt1 = scanner.nextLine();

                System.out.print("Enter Option 2: ");
                String opt2 = scanner.nextLine();

                System.out.print("Enter Option 3: ");
                String opt3 = scanner.nextLine();

                System.out.print("Enter Option 4: ");
                String opt4 = scanner.nextLine();

                System.out.print("Enter Answer: ");
                String answer = scanner.nextLine();

                quizQuestions[i] = new Questions(questionId, question, opt1, opt2, opt3, opt4, answer);
                System.out.println("Question added successfully!");
                
            }else{
                break;
            }
        }
    }

    // Placeholder for quiz logic
    public void takeQuiz() {
        correctAnswer = 0; // Reset counter for new quiz
        System.out.println("Quiz started");
        for (Questions q : quizQuestions) {
            if (q != null) {
                System.out.println(q.getQuestion());
                System.out.println("1. " + q.getOpt1());
                System.out.println("2. " + q.getOpt2());
                System.out.println("3. " + q.getOpt3());
                System.out.println("4. " + q.getOpt4());
                System.out.print("Enter your answer (1-4): ");
                String userAnswer = scanner.nextLine(); // capture user answer
                if(q.getAnswer().equals(userAnswer)) {
                    correctAnswer++;
                }
            }
            
        }

        System.out.println("You got " + correctAnswer + " out of " + quizQuestions.length + " correct!");
    }
}
