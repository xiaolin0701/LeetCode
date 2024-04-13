package src;

class PrintABC {
    private static final Object lock = new Object();
    private static int state = 0;

    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintThread("A", 0));
        Thread threadB = new Thread(new PrintThread("B", 1));
        Thread threadC = new Thread(new PrintThread("C", 2));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    private static class PrintThread implements Runnable {
        private final String name;
        private final int targetState;

        public PrintThread(String name, int targetState) {
            this.name = name;
            this.targetState = targetState;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (state % 3 != targetState) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.print(name);
                    state++;
                    lock.notifyAll();
                }
            }
        }
    }
}
