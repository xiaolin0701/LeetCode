package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_20240212_102 {
    public List<List<Integer>> levelOrder( TreeNode root) {
    List<List<Integer>> list=new ArrayList<>();

    if(root==null)  return list;

    list.add(new ArrayList<>(){{add(root.val);}});

    Queue<TreeNode> queue=new LinkedList<>(){{
        offer(root);
    }};

    while(!queue.isEmpty()){
        int size=queue.size();
        List<Integer> smallList=new ArrayList<>();
        if(size>0){
            TreeNode treenode=queue.poll();
            if(treenode.left!=null) {
                queue.offer(treenode.left);
                smallList.add(treenode.left.val);
            }
            if(treenode.right!=null) {
                queue.offer(treenode.right);
                smallList.add(treenode.right.val);
            }
            size--;
        }
        if(!smallList.isEmpty())
            list.add(smallList);
    }
    return list;
}
}
