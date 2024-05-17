public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;
        while(n != 0) {
            i++; // counter increment every loop pass

            if(n % 2 == 0) {
                n = n / 2;
            }
            else {
                n--;
            }
        }
        System.out.println(i);
    }
}
