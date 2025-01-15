package ss4_oop.bai_tap;

public class Main1 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        stopWatch.stop();
        System.out.println("Thời gian thực thi thuật toán: "+ stopWatch.getElapsedTime()+ " milliseconds");
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getStopTime());
    }

}
