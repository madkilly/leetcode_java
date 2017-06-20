package com.zhu.exercise;

import org.junit.Test;

/**
 * <p>
 * Title: AddTwoNumbers
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author zhukai
 */
public class AddTwoNumbers {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode a=l1;
		ListNode b=l2;
		ListNode c;
		ListNode tmp= result;
		int carry=0;
		int tmp2=0;
		
		tmp.val = (a.val+b.val)%10+carry;
		carry = (a.val+b.val)/10;
		while(null!=a.next&&null!=b.next){
				a=a.next;
				b=b.next;
				tmp.next=new ListNode(0); 
				tmp=tmp.next;
				
				tmp2 = a.val+b.val+carry;
				tmp.val = (a.val+b.val+carry)%10;
				carry = (tmp2)/10;
		}

			
		if(null!=a.next){
			c=a;
		}else{
			c=b;
		}
		while(null!=c.next){
			c=c.next;
			tmp.next=new ListNode(0); 
			tmp=tmp.next;
			tmp2 = (c.val+carry);
			tmp.val = tmp2%10;
			carry = (tmp2)/10;
		}
		while(carry!=0){
			tmp.next=new ListNode(0); 
			tmp=tmp.next;
			tmp2=carry;
			tmp.val = carry%10;
			carry = (tmp2)/10;
		}
		return result;
	}
	
	public ListNode genLinkList(int [] group){
		ListNode result = new ListNode(0);
		ListNode tmp = result;
		if(group.length>0){
			tmp.val=group[0];
		}
		for(int i=1;i<group.length;i++){
			tmp.next= new ListNode(0);
			tmp=tmp.next;
			tmp.val=group[i];
		}
		return result;
	}
	
	@Test
	public void testAddtwoNumbers(){
		ListNode l1,l2;
		int[] g1= {5};
		int[] g2= {5};
		
		l1=genLinkList(g1);
		l2=genLinkList(g2);
		
		ListNode tmp = addTwoNumbers(l1,l2);
		
		while(null!=tmp.next){
			System.out.println(tmp.val);
			tmp=tmp.next;
		}
		System.out.println(tmp.val);
	}

}
