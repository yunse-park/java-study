package ch14.sec04;

public class StopFlagExample {

    static class Worker extends Thread {
        private volatile boolean stop = false;

        public void requestStop() {
            stop = true;
        }

        @Override
        public void run() {
            while (!stop) {
                // 작업 수행
                Thread.onSpinWait();
            }
            System.out.println("작업 종료");
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        Worker worker = new Worker();
        worker.start();

        Thread.sleep(1000);
        worker.requestStop();
        worker.join();

        System.out.println("메인 종료");
    }
}