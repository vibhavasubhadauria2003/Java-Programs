public class Test {
    static void alter(int nums[]){
        nums[0]=9;
    }
    public static void main(String args[]){
        int nums[]={1,1};
        alter(nums);
        System.out.println(nums[0]);
    }
}
