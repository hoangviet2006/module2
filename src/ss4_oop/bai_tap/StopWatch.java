package ss4_oop.bai_tap;

public class StopWatch {
    long startTime;
    long stopTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
         this.startTime= System.currentTimeMillis();
    }

    public  void stop(){
        this.stopTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return this.startTime;
    }

    public long getStopTime(){
        return  this.stopTime;
    }

    public long getElapsedTime(){
        return this.stopTime - this.startTime;
    }

} 
