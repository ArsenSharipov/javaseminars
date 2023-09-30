public class task2 {
    public static void main(String[] args) {
        try {
            int[] intntArray = {0,1,2,3,4,5,6,7,8};
            int d = 1;
            double catchedRes1 = intntArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
}
//объявить массив и изменить значения переменной d