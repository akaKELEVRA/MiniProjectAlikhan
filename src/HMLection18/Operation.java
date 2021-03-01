package HMLection18;

public class Operation extends Thread{
    String operationName;
    int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        for (int i=0; i<operationTime; i++) {
            System.out.println("Operation " + operationName + ": " + i + " second");
            try {
                sleep (100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Operation " + operationName + ": finished");
        }
    }
}
