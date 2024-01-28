package src;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadPoolExample {
    private static final Logger logger = Logger.getLogger( ThreadPoolExample.class.getName() );

    public static void main( String[] args ) {
        // 创建一个线程池，其中包含3个线程
        try ( ExecutorService executor = Executors.newFixedThreadPool( 3 ) ) {
            // 提交10个任务给线程池执行
            for ( int i = 0 ; i < 10 ; i++ ) {
                final int taskId = i;
                executor.execute( () -> {
                    logger.info( STR."Task \{taskId} is being executed by \{Thread.currentThread().getName()}" );
                    try {
                        // 模拟任务执行过程
                        Thread.sleep( 1000 );
                    } catch ( InterruptedException e ) {
                        logger.log( Level.SEVERE , STR."Task \{taskId} was interrupted" , e );
                    }
                    System.out.println( STR."Task \{taskId} has been completed by \{Thread.currentThread().getName()}" );
                } );
            }

            // 关闭线程池
            executor.shutdown();
        }
    }
}
