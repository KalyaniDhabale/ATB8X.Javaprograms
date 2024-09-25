package sept.Task;

public class Task03 {
    public static void main(String[] args) {
        int score = 85;
        String grade = score >= 90 ? "A" :(score >= 80 ? "B": (score >= 70 ? "C":"D"));
        System.out.println("grade of student is " + grade);
    }
}
