package src;

import java.util.*;

/**
 *@Author ylwang
 *@Date   2024/1/25
 */
//给你一个字符串 word，由 不同 小写英文字母组成。
//
//电话键盘上的按键与 不同 小写英文字母集合相映射，可以通过按压按键来组成单词。例如，按键 2 对应 ["a","b","c"]，我们需要按一次键来输入 "a"，按两次键来输入 "b"，按三次键来输入 "c"。
//
//现在允许你将编号为 2 到 9 的按键重新映射到 不同 字母集合。每个按键可以映射到 任意数量 的字母，但每个字母 必须 恰好 映射到 一个 按键上。你需要找到输入字符串 word 所需的 最少 按键次数。
//
//返回重新映射按键后输入 word 所需的 最少 按键次数。
//
//下面给出了一种电话键盘上字母到按键的映射作为示例。注意 1，*，# 和 0 不 对应任何字母。
public class Leetcode_2024r0125_3014_weeklyMatch {
    public static int minimumPushes(String word) {
        //尝试贪心算法求解，先构建权值map表
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char i:word.toCharArray()){
            hashMap.put(i,hashMap.getOrDefault( i,0 )+1);
        }
        ArrayList< Integer > arrayList = new ArrayList<>( hashMap.values() );
        Collections.sort(arrayList);
        int minPush=0,tool=0,arrayLength=arrayList.size();
        while ( arrayLength > 0 ) {

            minPush += arrayList.get( tool )*(tool/8+1);
            tool++;
            arrayLength--;

        }
        return minPush;
    }

    public static void main( String[] args ) {
        System.out.println(minimumPushes( "xycdefghij" ));
    }
    //我从本题中学到得：排序容器类用collections
    //hashmap初始化时可以用getOrDefault判断是否为空，省去if-else判断
    //仔细审题！！！！！
}
