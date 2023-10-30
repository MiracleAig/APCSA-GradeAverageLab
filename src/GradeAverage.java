import java.text.DecimalFormat;

public class GradeAverage {
    public static char gradeLetter(double average){
        if(average >= 90.0){
            return 'A';
        } else if (average >= 80.0 && average < 90) {
            return 'B';
        } else if (average >= 75.0 && average < 80.0){
            return 'C';
        } else if (average >= 70 && average < 75.0) {
            return 'D';
        } else if(average <= 70){
            return 'F';
        }else {
            return 'F';
        }

    }

    public static  char gradeLetter(double grade1, double grade2, double grade3, double grade4){
      double gradeAverage =  average(grade1, grade2, grade3, grade4);
      char gradeLetter = gradeLetter(gradeAverage);

      return gradeLetter;
    }

    public static double average(double grade1, double grade2,  double grade3, double grade4){
        double averageGrade = (grade1 + grade2 + grade3 + grade4) / 4.0;
        double averageGradeRounded = Math.round(averageGrade * 100.0) / 100.0d;


        return  averageGradeRounded;

    }
}
