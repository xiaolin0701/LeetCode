package src;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *@Author ylwang
 *@Date   2024/1/18
 */
public class leetcode_20240118_20 {
    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    //
    //有效字符串需满足：
    //
    //左括号必须用相同类型的右括号闭合。
    //左括号必须以正确的顺序闭合。
    //每个右括号都有一个对应的相同类型的左括号。
    public static boolean isValid(String s) {
        int n = s.length();
        if ( n % 2!=0 ) return false;
        Deque< Character > stack = new LinkedList<>();
        HashMap< Character, Character > map = new HashMap<>();
        map.put( '}' , '{' );
        map.put( ']' , '[' );
        map.put( ')' , '(' );
        char[] sChar = s.toCharArray();
        for ( int i = 0 ; i < n ; i++ ) {
            //判断是否是左括号
            if(map.containsKey( sChar[i] )){
                if(stack.isEmpty()||stack.peek()!=map.get( sChar[i] ))  return false;
                stack.pop();
            }else stack.push( sChar[i] );

        }
        return stack.isEmpty();
    }

    public static void main (String[] args) {
        String s = "(()){{}}[[]]";
        boolean valid = isValid( s );
        System.out.println( valid );
    }

}
