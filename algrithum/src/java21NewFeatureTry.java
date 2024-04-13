package src;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *@Author ylwang
 *@Date   2024/2/4
 */
public class java21NewFeatureTry {
    //尝试java21新特性
    record Point(int x ,int y){}

    void collectionsTry() {
        String address = "ylwangblog.com";
        System.out.println(STR."YLWANGBLOG IS \{address}");
        String json=STR."""
        {
            "address":"\{address}";
        }""";
        System.out.println(json);
    }
    static void p(Object obj){
        HashMap< Object, Object > objectObjectHashMap = new HashMap<>();
        LinkedList< Integer > integers = new LinkedList<>();
        if(obj instanceof Point(int x ,int y) )
            System.out.println(x+y);
        Thread virtualThread=Thread.startVirtualThread( runnable );

    }
    static Runnable runnable=()-> System.out.println("虚拟线程启动");

    void main(  ) {
        p( new Point(996,996) );
        collectionsTry();
    }

}
