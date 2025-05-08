# Quiz Generator by Ishika

## Description
Welcome to the **Quiz Generator** program! This Java-based application allows users to create quizzes, add questions, take quizzes, and list available quizzes. The program is interactive and provides a simple menu to manage quizzes and questions.

## Features
- **Create a Quiz**: Create a quiz on any topic.
- **Add Questions**: Add multiple-choice questions to your quiz.
- **Take a Quiz**: Answer questions from any available quiz.
- **List Quizzes**: View all available quizzes.
- **Exit**: Close the program.

## Files
1. **QuizGenerator.java**: Main file that handles user input, displays commands, and calls methods to create, add, and take quizzes.
2. **Quiz.java**: Represents a quiz, stores questions, and handles the process of taking a quiz.
3. **Question.java**: Represents a single question, storing the question text, options, and the correct answer.

## How It Works

1. **Create a Quiz**:
   - Type `create` to create a new quiz.
   - Enter a topic for the quiz.
   
2. **Add Questions**:
   - Type `add` to add questions to a quiz.
   - Enter the quiz topic, the question text, and 4 options. Also, specify the correct option number.

3. **Take the Quiz**:
   - Type `take` to take a quiz.
   - Enter the quiz topic and answer the questions.

4. **List Quizzes**:
   - Type `list` to see all available quizzes.

5. **Exit**:
   - Type `exit` to exit the program.

## Requirements
- Java 8 or higher to run the program.

## How to Run
1. Download or clone the repository to your local machine.
2. Open a terminal/command prompt.
3. Navigate to the project directory.
4. Compile the Java files:
   ```bash
   javac QuizGenerator.java Quiz.java Question.java
