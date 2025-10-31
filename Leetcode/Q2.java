package Leetcode;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) 
     { 
        this.val = val; 
     }
     ListNode(int val, ListNode next) 
     { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0,s;
        ListNode sum = null;
        ListNode t1=l1,t2=l2;
        while(t1.next!=null||t2.next!=null){
            s=t1.val+t2.val+carry;
            if(s>9){
                carry=s%10;
                s=s/10;
            }
            else{
                carry=0;
            }
            ListNode st=new ListNode(s,null);
            if(sum==null){
                sum=st;
            }
            else{
                ListNode tem=sum;
                while(tem.next!=null){
                    tem=tem.next;
                }
                tem.next=st;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return sum;
    }
}
public class Q2 {
    public static void main(String args[]){
        
    }
}
