package hackerrank;

import java.util.Arrays;

public class GradingStudents {

    public static void main(String[] args) {

        int grades[] = {73, 67, 38, 33};
        int[] result = gradingStudents(grades);
        System.out.println(Arrays.toString(result));
    }

    static int[] gradingStudents(int[] grades) {

        int result[] = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            
            if(grades[i] > 37) {
                
                int mod = grades[i]%10;
                if(mod > 5 && (10-mod < 3)) {
                    result[i] = grades[i]+(10-mod);
                } else if(mod < 5 && (5-mod < 3)) {
                    result[i] = grades[i]+(5-mod);
                } else {
                    result[i] = grades[i];
                }
            } else {
                result[i] = grades[i];
            }
        }
        
        return result;
    }
}
