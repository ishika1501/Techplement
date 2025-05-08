import java.util.List;

public class Question {
    String questionText;
    List<String> options;
    int correctOption; // 1-based index

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }
}
