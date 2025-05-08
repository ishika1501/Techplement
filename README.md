# 📚 Quiz Generator:

A simple and interactive **Java-based command-line quiz application** that lets users create quizzes, add multiple-choice questions, take quizzes, and manage them efficiently through a user-friendly interface.

---

## 📝 Description

The **Quiz Generator** allows you to:
- Create quizzes on different topics.
- Add multiple-choice questions to quizzes.
- Take quizzes and receive instant feedback.
- View a list of available quizzes.
- Exit anytime with a command.

It provides a **menu-driven interface**, making it easy for users to interact without needing any prior technical knowledge.

---

## ✨ Features

- 🔹 **Create a Quiz** — Set up quizzes on any subject.
- 🔹 **Add Questions** — Add MCQs (Multiple Choice Questions) with 4 options and one correct answer.
- 🔹 **Take a Quiz** — Attempt questions and get results.
- 🔹 **List Quizzes** — View all created quizzes.
- 🔹 **Exit** — Exit the application gracefully.

---

## 📂 Project Structure

| File Name             | Description                                                                 |
|-----------------------|-----------------------------------------------------------------------------|
| `QuizGenerator.java`  | The main driver class handling user commands and routing actions.           |
| `Quiz.java`           | Defines the `Quiz` class which holds quiz title and questions.              |
| `Question.java`       | Defines the `Question` class that holds question statement, options, answer.|

---

## 🚀 How It Works

### 🧪 Create a Quiz
- Run the application and type `create`.
- Input a topic (e.g., "Java Basics").

### ✏️ Add Questions
- Type `add`.
- Provide:
  - Quiz topic (must exist).
  - Question text.
  - 4 option strings.
  - Correct option number (1-4).

### ✅ Take a Quiz
- Type `take`.
- Choose a quiz and answer each question.
- See your score at the end.

### 📋 List Quizzes
- Type `list` to display all available quizzes.

### ❌ Exit
- Type `exit` to terminate the program.

---

## 🛠️ Requirements

- Java JDK **8 or higher**
- Command-line interface (Terminal / Command Prompt)

---

## ▶️ How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/Techplement.git
   cd Techplement/week1-tasks

2. **Compile the Java files**:
   ```bash
   javac *.java

3. **Run the program**:
   ```bash
   java QuizGenerator

   
## 📸 Screenshots

![Quiz Screenshot](https://github.com/ishika1501/Techplement/blob/main/week1-tasks/Images/quiz_screenshot1.png)
![Quiz Screenshot](https://github.com/ishika1501/Techplement/blob/main/week1-tasks/Images/quiz_screenshot2.png)
