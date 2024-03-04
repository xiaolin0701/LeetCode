package src;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 *@Author ylwang
 *@Date   2024/2/5
 */
//做链表习题
public class leetcode_20240205_104 {



    public int maxDepth(TreeNode root) {

        int result=0;

        if(root==null)  return 0;
        Queue< TreeNode > queue = new LinkedList<>() {{
            add( root );
        }};
        while(!queue.isEmpty()){

            int size=queue.size();

            while ( size>0 ){

                TreeNode treeNode=queue.poll();

                if ( treeNode.left != null ) {

                    queue.offer( treeNode.left );

                }
                if ( treeNode.right!= null ) {

                    queue.offer( treeNode.right );

                }

                size--;
            }
            result++;

        }
        return result;
    }
    static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)    return true;
        if(p!=null&&q!=null)    ;
            else    return false;
        Queue<TreeNode> queueP=new LinkedList<>(){{offer(p);}};
        Queue<TreeNode> queueQ=new LinkedList<>(){{offer(q);}};
        while(!queueP.isEmpty()&&!queueQ.isEmpty()){
            int sizeP=queueP.size();
            int sizeQ=queueQ.size();
            if(sizeP!=sizeQ)    return false;
            while(sizeP>0){
                TreeNode treenodeP=queueP.poll();
                TreeNode treenodeQ=queueQ.poll();
                if(!Objects.equals(treenodeP,treenodeQ))    return false;
                if(treenodeP.left!=null) queueP.offer(treenodeP.left);
                if(treenodeP.right!=null) queueP.offer(treenodeP.right);
                if(treenodeQ.left!=null)   queueQ.offer(treenodeQ.left);
                if(treenodeQ.right!=null)   queueQ.offer(treenodeQ.right);
                sizeP--;
            }
        }
        return true;
    }

    public static void main( String[] args ) {
        TreeNode root = new TreeNode(); // 使用无参构造函数创建对象
        TreeNode leftChild = new TreeNode(2); // 使用带参构造函数创建对象并初始化val属性
        TreeNode rightChild = new TreeNode(7); // 使用带参构造函数创建对象并初始化val属性
        root.val = 5; // 初始化val属性
        root.left = leftChild; // 初始化left属性
        root.right = rightChild; // 初始化right属性
        TreeNode rootq=root;
        System.out.println(isSameTree( root,rootq ));
    }
}
