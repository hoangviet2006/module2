package ss2_loop.bai_tap;

public class DisplayPrimeNumber100 {
    public static void main(String[] args) {
        int prime = 2;
        int count = 0;
        boolean check = true;
        while (count < 100) {
            check = true;
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
}
