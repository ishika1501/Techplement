import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // ← Add this line


public class Quiz {
    String topic;
    List<Question> questions;

    public Quiz(String topic) {
        this.topic = topic;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void takeQuiz() {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println(q.questionText);
            for (int i = 0; i < q.options.size(); i++) {
                System.out.println((i + 1) + ". " + q.options.get(i));
            }
            System.out.print("Your answer: ");
            int ans = sc.nextInt();
            if (q.isCorrect(ans)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. Correct answer: " + q.correctOption + "\n");
            }
        }
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}
