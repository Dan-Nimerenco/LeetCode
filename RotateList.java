package LeetCode.LeetCode;

public class RotateList {
//    ListNode headNew;
//    public ListNode rotateRight(ListNode head, int k) {
//        headNew = head;
//        ListNode prev;
//        ListNode it;
//        ListNode ver=head;
//        int cnt=0;
//        if(head == null){
//            return head;
//        }
//        while(ver!=null){
//            ver=ver.next;
//            cnt++;
//        }
//        while(k>=cnt){
//            k-=cnt;
//        }
//
//        for(int i = 1; i<=k;i++){
//            it=head;
//            while(true){
//                if(it == null || it.next==null){
//                    break;
//                }
//                if(it.next.next ==null){
//                    head = new ListNode(it.next.val,head);
//                    it.next=null;
//                }
//                it=it.next;
//            }
//        }
//        return head;
//    }
}
