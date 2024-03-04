package src;

public class leetcode_20240212_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum=getNodeNum(l2)+getNodeNum(l1);
        ListNode nextList= new ListNode(sum%10);
        ListNode ansList=nextList;
        sum/=10 ;
        while ( sum>0 ){

            ListNode listNode=new ListNode(sum%10);
            nextList.next=listNode;
            sum/=10;
            nextList=listNode;

        }
        return ansList;
    }
    public int getNodeNum(ListNode l1Next){
        int s=0,i=1;
        while(l1Next!=null){
            s+=l1Next.val*i;
            i*=10;
            l1Next=l1Next.next;
        }
        return s;
    }
}
