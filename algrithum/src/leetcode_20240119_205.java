package src;


import java.util.*;


/**
 *@Author ylwang
 *@Date   2024/1/19
 */
//给定两个字符串 s 和 t ，判断它们是否是同构的。
//
//如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
//
//每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身
public class leetcode_20240119_205 {
    public static boolean isIsomorphic( String s , String t ) {
        HashSet<ArrayList<Integer>> hashSets=new HashSet<>(returnList( s ));
        HashSet<ArrayList<Integer>> hashSett=new HashSet<>(returnList( t ));
        return hashSett.equals( hashSets );
    }

    public static Collection< ArrayList< Integer > > returnList( String s ) {
        HashMap< Character, ArrayList< Integer > > hashmap = new HashMap<>();
        int num=0;
        for ( char i : s.toCharArray() ) {
            //这部分的逻辑处理：没有的先初始化，有的更新值
            if ( !hashmap.containsKey( i ) ) {
                ArrayList< Integer > arrayList = new ArrayList<>();
                arrayList.add( num );
                hashmap.put( i , arrayList );
                num++;
                continue;
            }
            ArrayList< Integer > array = hashmap.get( i );
            array.add( num );
            num++;
            hashmap.put( i , array );
        }
        return hashmap.values();
    }

    public static void main( String[] args ) {
        System.out.println( isIsomorphic( "bbbaaaba" , "aaabbbba" ) );
        System.out.println(returnList( "bbbaaaba" ));
        System.out.println(returnList( "aaabbbba" ));
    }

}
