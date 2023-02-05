package LeetCode.LeetCode;

public class MergeTwoSortedLists {

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode noul = new ListNode();
//        ListNode rez = noul;
//        ListNode it1=list1;
//        ListNode it2=list2;
//        while(it1!=null && it2!=null){
//            if(it1.val>it2.val){
//                noul.next=it2;
//                it2 = it2.next;
//                noul = noul.next;
//            }
//            else{
//                noul.next = it1;
//                it1 = it1.next;
//                noul = noul.next;
//            }
//        }
//        while(it1!=null){
//            noul.next = it1;
//            it1 = it1.next;
//            noul = noul.next;
//        }
//        while(it2!=null){
//            noul.next = it2;
//            it2 = it2.next;
//            noul = noul.next;
//        }
//        noul.next = null;
//        return rez.next;
//    }
}
