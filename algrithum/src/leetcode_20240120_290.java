package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *@Author ylwang
 *@Date   2024/1/20
 */
//给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
//
//这里的 遵循 指完全匹配，
//例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
public class leetcode_20240120_290 {
    public static Collection< ArrayList< Integer>> returnValues( String[] pattern ) {
        HashMap< String, ArrayList< Integer > > hashMap = new HashMap<>();
        int num = 0;
        for ( String ch : pattern ) {
            if ( hashMap.containsKey( ch ) ) {
                ArrayList< Integer > arrayList = hashMap.get( ch );
                arrayList.add( num );
                hashMap.put( ch , arrayList );
                num++;
            } else {
                ArrayList< Integer > arrayList = new ArrayList<>();
                arrayList.add( num );
                hashMap.put( ch , arrayList );
                num++;
            }
        }
        System.out.println( hashMap.values());
       return hashMap.values();
    }
    public static boolean wordPattern(String pattern, String s){
        char[] patternToChar=pattern.toCharArray();
        String[] newPattern=new String[patternToChar.length];
        for ( int i=0;i< patternToChar.length;++i ){
            newPattern[i]=String.valueOf( patternToChar[i] );
        }
        String[] newS=s.split( " " );
        return returnValues( newS ).containsAll( returnValues( newPattern ) )&&returnValues( newPattern ).containsAll( returnValues( newS ) );
    }

    public static void main( String[] args ) {
        System.out.println(wordPattern( "abba","dog cat cat fish" ));
    }
}
