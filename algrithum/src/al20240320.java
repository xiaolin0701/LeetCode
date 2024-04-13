package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class al20240320 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<>();

        for(int i=1;i<4;i++){
            for(int j=1;j<4;j++){
                for(int k=1;k<4;k++){
                    for(int l=1;l<4;l++){
                        //枚举满足个数的情况
                        if(i+j+k+l==s.length()){
                            //截取
                            String s1=s.substring(0,i);
                            String s2=s.substring(i,i+j);
                            String s3=s.substring(i+j,i+j+k);
                            String s4=s.substring(i+j+k,i+j+k+l);
                            //判断
                            if(check(s1)&&check(s2)&&check(s3)&&check(s4)) res.add(s1+"."+s2+"."+s3+"."+s4);
                        }
                    }
                }
            }
        }
        return res;
    }
    public boolean check(String s){
        //大于255不满足条件
        if(Integer.parseInt(s)<256){
            //小于等于255，判断首位0的情况
            return s.charAt( 0 ) != '0' || s.charAt( 0 ) == '0' && s.length() == 1;
        }
        return false;
    }
    public List<String> restoreIpAddress(String s){
        //存放答案的数组
        List<String> arraylist=new ArrayList<>();
        int length=s.length();
        //如不符合最大最小长度直接返回
        if(length<4||length>12)     return arraylist;
        LinkedList<String> path=new LinkedList<>();
        DFS( s,length,0,4, path ,arraylist );
        return arraylist;
    }
    //在left与right之间截取字符串，校验是否合法，返回一个布尔类型值
    public boolean ifLegal(String s,int left,int right){
        int length=right-left+1;
        if ( length>1&&s.charAt( left )=='0' )  return false;
        int curIP=0;
        while ( left<=right ){
            //char类型相减返回int,即为两者ASCII码的差值
            curIP=curIP*10+s.charAt( left )-'0';
            left++;
        }
        return curIP>=0&&curIP<=255;
    }

    /**
     * @param s 字符串
     * @param length 字符串长度长度
     * @param begin 开始位置
     * @param remainIPNum 剩下没有处理的几个IP字段
     * @param path  答案路径
     * @param arraylist 答案集合
     */
    public void DFS(String s,int length,int begin,int remainIPNum,LinkedList<String> path,List<String> arraylist){
        //如果开始位置与字符串长度等长，且剩下需要校验的IP段数目为0，则返回答案
        if ( begin==length ){
            if ( remainIPNum==0 )
                arraylist.add( String.join( ".",path ) );
            return;
        }
        for(int i=begin;i<begin+3;++i){
            if ( i>=length )    break;
            //算上当前位和需要校验位*3相加后仍小于字符串长度，则continue
            if(i+remainIPNum*3<length)  continue;
            if(ifLegal( s,begin,i )){
                String curIP=s.substring( begin,i+1 );
                path.addLast( curIP );
                DFS( s,length,i+1,remainIPNum-1,path,arraylist);
                //依次进入递归函数后，再依次从path中剪枝，即为回退到上一个可能的答案
                path.removeLast();
            }
        }
    }
    void main(){
        int num=0;
        while ( num<5 ){
            String s=Integer.toString( new Random().nextInt(1000000000) );
            System.out.println(s);
            System.out.println(restoreIpAddress( s ));
            num++;
        }
    }

}
