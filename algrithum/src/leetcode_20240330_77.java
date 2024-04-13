package src;

import java.util.ArrayList;
import java.util.List;

public class leetcode_20240330_77 {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List< List< Integer > > combine( int n , int k ) {
        OnTheWay( n,k,1 );
        return ans;
    }

    public void OnTheWay( int n , int k , int startIndex ) {

        if ( path.size()==k ) {
            ans.add( new ArrayList<>(path));
            System.out.println(STR."一个答案被加入到队列中，当前答案为\{ans}");
            return;
        }
        for ( int i = startIndex ; i <= n ; i++ ) {
            path.add( i );
            System.out.println( STR."加入到现有队列中的i是:\{i}" );
            System.out.println(STR."当前队列中元素为：\{path}");
            OnTheWay( n , k , i + 1 );
            System.out.println(STR."当前移除的元素为:\{path.removeLast()}");
        }
    }

    void main() {
        combine( 10 , 4 );
    }

}
