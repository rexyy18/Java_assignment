public class executeGradeReport {
    public static void executeGradeReport(double score){
        if (validateScore(score)){
            System.out.println("Invalid score");
            return;
        }
    char grade = calculateLetterGrade(score);
    displayPerformanceMessage(grade);

    }
    public static boolean validateScore(double score){
        return score < 0 || score > 100;
        }
    public static char calculateLetterGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score>= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        }
        return 'F';
    }
    public static void displayPerformanceMessage(char grade) {
        if (grade == 'A') {
            System.out.println("Execellent");;
        }else if (grade == 'B') {
            System.out.println("You have done well");
        }else if (grade == 'C') {
            System.out.println("Keep trying");
        }else if (grade == 'D') {
            System.out.println("More room for improvement");
        }else if (grade == 'E') {
            System.out.println("Learn Hard");
        }else if (grade == 'F') {
            System.out.println("See me!!!");
        }

    }

    }


