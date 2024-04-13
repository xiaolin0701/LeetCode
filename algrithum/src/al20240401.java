package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class al20240401 {
        List<List<Integer>> solution(TreeNode root){
        Queue< TreeNode > queue = new LinkedList<>();
        List<List<Integer>> arraylist=new ArrayList<>();
        if ( root != null ) {
            queue.offer( root );
        }
        while ( !queue.isEmpty() ) {
            List<Integer> list=new ArrayList<>();
            for ( int i = queue.size() ; i > 0 ; i-- ) {

                TreeNode currNode=queue.poll();

                if ( currNode.left != null ) {
                    queue.offer( currNode.left );
                }
                if ( currNode.right != null ) {
                    queue.offer( currNode.right );
                }
                list.add( currNode.val );
            }
            arraylist.add( list );

        }
        return arraylist;
    }

    void main() {
        TreeNode root = new TreeNode( 3 );
        root.left= new TreeNode( 9 );
        root.right = new TreeNode( 20 );
        root.right.left = new TreeNode( 15 );
        root.right.right = new TreeNode( 7 );
        System.out.println(solution( root ));
    }
}
