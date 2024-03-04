package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_20240211_637 {
    public List<Double> averageOfLevels( TreeNode root) {
        List<Double> arraylist=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>(){{
            offer(root);
        }};
        arraylist.add( (double) root.val );
        if(root.left==null&&root.right==null)

            return arraylist;

        while ( !queue.isEmpty() ){
            int size=queue.size();
            int firstSize=size;
            int sum=0;
            TreeNode treeNode=queue.poll();
            while ( size>0 ) {
                if ( treeNode.left != null ) {
                    queue.offer( treeNode.left );
                    sum += treeNode.left.val;
                }
                if ( treeNode.right != null ) {
                    queue.offer( treeNode.right );
                    sum += treeNode.right.val;
                }
                size--;

            }
            arraylist.add( (double) ( sum / firstSize ) );
    }
        return arraylist;
}
}
