package newproblems;


public class IntersectionOfTwoLinkedLists {
	
	 public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	 
	 public ListNode findIntersection(ListNode head1, ListNode head2){
		 
		 if (head1 == null || head2 == null){
			 return null;
		 }
		 
		 ListNode cur1 = head1;
		 ListNode cur2 = head2;
		 
		 int M = 1;
		 int N = 1;
		 
		 while (cur1.next != null){
			 cur1 = cur1.next;
			 M++;
		 }
		 
		 while (cur2.next != null){
			 cur2 = cur2.next;
			 N++;
		 }
		 
		 if (cur1 != cur2){
			 return null;
		 }
		 
		 
		 if (M > N){
			 int preLen = M - N;
			 cur1 = head1;
			 while (preLen > 0){
				 cur1 = cur1.next;
				 preLen--;
			 }
		 }
		 
		 else{
			 int preLen = N - M;
			 cur2 = head2;
			 while (preLen > 0){
				 cur2 = cur2.next;
				 preLen--;
			 }
		 }
		 
		 while (cur1 != null && cur2 != null){
			 if (cur1 == cur2){
				 return cur1;
			 }
			 
			 cur1 = cur1.next;
			 cur2 = cur2.next;
		 }
		 
		 return null;
	 }

}
