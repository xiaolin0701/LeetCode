package src;

import java.util.Scanner;
import java.util.stream.IntStream;

public class acwing_5384_20230116 {
    //给定四个正整数 a,b,c,d
    //，请你计算并输出 a×b+c×d
    // 的值。
    public static int solution(int a,int b,int c,int d){
        return a*b+c*d;
    }

    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner=new Scanner(System.in);
        int[] data=new int[4];
        for(int i=0;i<4;i++){
            data[i]=scanner.nextInt();
        }
        System.out.println(solution(data[0],data[1],data[2],data[3]) );
    }

}
