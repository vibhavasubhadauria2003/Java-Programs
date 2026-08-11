import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int rigtSmaller[]=new int[heights.length];
        int leftSmaller[]=new int[heights.length];
        Stack<Integer> stack1= new Stack<>();
        Stack<Integer> stack2= new Stack<>();
        int n=heights.length;
        int max=0,area;
        for(int i=0;i<n;i++){
            while(stack1.isEmpty()==false&&heights[i]<=heights[stack1.peek()]){
                stack1.pop();
            }
            if(stack1.isEmpty()){
                leftSmaller[i]=-1;
            }
            else{
                leftSmaller[i]=stack1.peek();
            }
            stack1.push(i);


            int j=n-i-1;
            while(stack2.isEmpty()==false&& heights[j]<=heights[stack2.peek()]){
                stack2.pop();
            }
            if(stack2.isEmpty()){
                rigtSmaller[j]=n;
            }
            else{
                rigtSmaller[j]=stack2.peek();
            }
            stack2.push(j);
        }
        for(int i=0;i<heights.length;i++){
            area=heights[i]*(rigtSmaller[i]-leftSmaller[i]-1);
            
            if(area>max){
                max=area;
            }
        }
        return max;
    }
}
public class Q84 {
    public static void main(String[] args) {
        Solution o1=new Solution();
        int nums[]={4,2,0,3,2,4,3,4};
        int c=o1.largestRectangleArea(nums);
        System.out.println(c);
    }
}
