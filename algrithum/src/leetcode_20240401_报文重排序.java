package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode_20240401_报文重排序 {
    String reMessage( int num , String Message ) {
        Map< Integer, String > hashmap = new HashMap<>();
        String[] MessageToStringArray = Message.split( " " );
        System.out.println( Arrays.toString( MessageToStringArray ) );
        for ( String string : MessageToStringArray ) {
            hashmap.put( Integer.valueOf( String.valueOf( string.charAt( string.length()-1) ) ) , string.substring( 0 , string.length() - 1 ) );
        }
        System.out.println(hashmap);
        StringBuilder stringBuilder=new StringBuilder();
        for ( int i = 0 ; i < num ; ++i ) {
             stringBuilder.append( hashmap.get( i+1 ) );
            stringBuilder.append( " " );
        }
        return stringBuilder.toString();
    }

    void main() {
        String t= "rolling4 stone3 lki2 ff1 ";
        int num=4;
        System.out.println(reMessage( num,t ));

    }

}
