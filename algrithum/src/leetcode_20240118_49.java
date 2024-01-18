package src;

import java.util.*;

/**
 * @Author ylwang
 * @Date 2024/1/18
 */
//给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表
public class leetcode_20240118_49 {
    public static List< List< String > > groupAnagrams( String[] strs ) {
        Map< String, List< String > > hashmap = new HashMap<>();
        for ( String str : strs ) {
            char[] array = str.toCharArray();
            Arrays.sort( array );
            //在确认是否为key之前先排序
            String key = new String( array );
            //不存在key返回空列表避免类型检查
            List< String > list = hashmap.getOrDefault( key , new ArrayList<>() );
            list.add( str );
            hashmap.put( key , list );
        }
        return new ArrayList<>( hashmap.values() );
    }
    //我学到了什么：1.函数参数可以传进一个构造方法 2.可以对数组进行排序 3.返回值也可以使用构造方法

    public static void main( String[] args ) {
        String[] strs = {"eat" , "tea" , "tan" , "ate" , "nat" , "bat"};
        System.out.println( groupAnagrams( strs ) );
    }
}
