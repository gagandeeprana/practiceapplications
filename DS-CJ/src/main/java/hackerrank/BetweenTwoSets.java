package hackerrank;



public class BetweenTwoSets {

    public static void main(String[] args) {

//        int a[] = {2, 4};
//        int a[] = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91};
//        int a[] = {1};
        int a[] = {2, 3, 6};
//        int b[] = {16, 32, 96};
//        int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int b[] = {72, 48};
        int b[] = {42, 84};
        System.out.println(getTotalX(a, b));
    }

    static int getTotalX(int[] a, int[] b) {

        /*int arrayFirst[] = new int[100];
        int index = 0;

        if(a.length > 1) {
            for (int i = 1; i <= 100; i++) {
    
                int j = 0;
                while (j < a.length) {
    
                    if (i % a[j] != 0) {
                        break;
                    } else {
                        j++;
                    }
                }
                if (j == a.length && index < arrayFirst.length) {
                    arrayFirst[index] = i;
                    if (index == arrayFirst.length - 1) {
                        break;
                    }
                    index++;
                }
            }
        } else {
            arrayFirst[0] = a[0];
        }

            
        int finalArray[] = new int[arrayFirst.length];
        for (int i = 0; i < arrayFirst.length; i++) {
            
            int j = 0;
            int counter = 0;
            while(j < b.length) {
                
                if(arrayFirst[i] != 0 && b[j] % arrayFirst[i] == 0) {
                    counter++;
                }
                j++;
            }
            if(counter == b.length) {
                finalArray[i] = arrayFirst[i];
            }
        }
        
        int counter = 0;
        for (int i = 0; i < finalArray.length; i++) {
            if(finalArray[i] != 0) {
                counter++;
            }
        }
        return counter;*/
        
        int firstArrLastElement = a[a.length -1];
        int secondArrFirstElement = b[0];
        int count = 0;
        for (int i = firstArrLastElement; i <= secondArrFirstElement; i++) {
            boolean isDivisible = true;
            for (int j = 0; j < a.length; j++) {
                if(i % a[j] != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if(isDivisible) {
                for (int j = 0; j < b.length; j++) {
                    if(b[j] % i != 0){
                        isDivisible = false;
                        break;
                    }
                }
            }
            
            if(isDivisible) {
                count = count + 1;
            }
        }
        
        return count;
    }
}
