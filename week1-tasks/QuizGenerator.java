import java.util.*;

public class QuizGenerator {
    static Map<String, Quiz> quizzes = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" .................Welcome to Quiz Generator by Ishika.............");
        while (true) {
            System.out.println("Commands:\ncreate\nadd\ntake\nlist\nexit");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "create":
                    createQuiz();
                    break;
                case "add":
                    addQuestion();
                    break;
                case "take":
                    takeQuiz();
                    break;
                case "list":
                    listQuizzes();
                    break;
                case "exit":
                    System.out.println("Exiting from Quiz");
                    return;
                default:
                    System.out.println("Unknown command. Try again.");
            }
        }
    }

    static void createQuiz() {
        System.out.print("Enter quiz topic: ");
        String topic = scanner.nextLine();
        quizzes.put(topic, new Quiz(topic));
        System.out.println("Quiz '" + topic + "' created.");
    }

    static void addQuestion() {
        System.out.print("Enter quiz topic: ");
        String topic = scanner.nextLine();
        if (!quizzes.containsKey(topic)) {
            System.out.println("Quiz not found.");
            return;
        }
        System.out.print("Enter question: ");
        String questionText = scanner.nextLine();
        List<String> options = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter option " + i + ": ");
            options.add(scanner.nextLine());
        }
        System.out.print("Enter correct option number (1-4): ");
        int correct = Integer.parseInt(scanner.nextLine());
        quizzes.get(topic).addQuestion(new Question(questionText, options, correct));
        System.out.println("Question added.");
    }

    static void takeQuiz() {
        System.out.print("Enter quiz topic: ");
        String topic = scanner.nextLine();
        if (!quizzes.containsKey(topic)) {
            System.out.println("Quiz not found for the given topic");
            return;
        }
        quizzes.get(topic).takeQuiz();
    }

    static void listQuizzes() {
        System.out.println("Available quizzes:");
        for (String topic : quizzes.keySet()) {
            System.out.println("- " + topic);
        }
    }
}
