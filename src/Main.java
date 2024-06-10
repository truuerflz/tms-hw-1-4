public class Main {
    public static void main(String[] args) {

        long number = 43567895569L;
        boolean isFirst = true;

        while (number > 9) {

            int temp = (int)(number%10);
            number /= 10;

            if((temp == number%10 + 1) && isFirst == true){
                System.out.print(temp);
                System.out.print(number%10);
                isFirst = false;
            } else if (temp == number%10 + 1) {
                System.out.print(number%10);
            } else if (isFirst == false) {
                isFirst = true;
                System.out.println();
            }
        }

    }
}