package ss2_loop.bai_tap;

public class DisplayPrimeNumber20 {
    public static void main(String[] args) {
        int count = 0;
        int prime = 2;
        boolean check = true;
        while (count < 20) {
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


