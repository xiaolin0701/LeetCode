package src;

public class threadDemo {
    public static void main( String[] args ) {
        newThread t1=new newThread();
        newThread t2=new newThread();
        t1.start();
        t2.start();
    }
}
