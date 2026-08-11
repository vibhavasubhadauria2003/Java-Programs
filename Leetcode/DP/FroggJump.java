//Frog jump

public class FroggJump
{
    static int absolutrSub(int a,int b){
        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }
    }
    static int findMin(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
    static int froggJump(int nums[],int dp[],int curr){
        if(curr==0){
            return 0;
        }
        else{
            if(dp[curr]!=0){
                return dp[curr];
            }
            int min1=froggJump(nums,dp,curr-1)+absolutrSub(nums[curr],nums[curr-1]);
            int min2=min1+1; //   Inetilizing with one number greater than min1
            if(curr>1){
                min2=froggJump(nums,dp,curr-2)+absolutrSub(nums[curr],nums[curr-2]);
            }
            dp[curr]=findMin(min1,min2);
            return dp[curr];
        }
    }
    static int froggJumpwithoutDp(int nums[]){
        int curr=0;
        int prev=0,prev2=0;
        int tem1,tem2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            tem1=prev+absolutrSub(nums[i], nums[i-1]);
            if(i>1){
            tem2=prev2+absolutrSub(nums[i], nums[i-2]);
            }
            System.out.println("i: "+i+" tem1: "+tem1+" tem2: "+tem2);
            curr=findMin(tem1, tem2);
            prev2=prev;
            prev=curr;
        }
        return curr;
    }
    public static void main(String args[]){
        int nums[]={3,4,7,9,3};
        int dp[]=new int[nums.length];
        int min=froggJumpwithoutDp(nums);
        System.out.println("Min effert by frogg is: "+min);
    }
}