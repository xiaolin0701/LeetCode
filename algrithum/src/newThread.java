package src;

public class newThread extends Thread{
    @Override
    public void run(){
        System.out.println( STR."\{getName()}线程1启动" );
    }
}
