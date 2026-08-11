public class NinjaTrainng {
    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // By DP Recurtion
    static int trainNinja(int arr[][], int dp[][], int day, int prev) {
        if (day == 0) {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i != prev && arr[0][i] > max) {
                    max = arr[0][i];
                }
            }
            return max;
        } else {
            if (dp[day][prev] != -1) {
                return dp[day][prev];
            }
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i != prev) {
                    int x = arr[day][i] + trainNinja(arr, dp, day - 1, i);
                    if (x > max) {
                        max = x;
                    }
                }
            }
            dp[day][prev] = max;
            return max;
        }
    }

    // DP Tabulation
    static int trainNinja(int arr[][], int dp[][]) {
        int day=0;
        for(int prev =0;prev<4;prev++){
            int max=0;
            for (int i = 0; i < 3; i++) {
                if (i != prev && arr[0][i] > max) {
                    max = arr[0][i];
                }
            }
            dp[0][prev]=max;
        }
        for (day = 1; day < arr.length; day++) {
            for (int prev = 0; prev < 4; prev++) {
                int max = 0;
                for (int i = 0; i < 3; i++) {
                    if (i != prev) {
                        int x = arr[day][i] + dp[day-1][i];
                        if (x > max) {
                            max = x;
                        }
                    }
                }
                dp[day][prev] = max;
            }
        }
        return dp[arr.length-1][3];
    }

    //wiyhout dp array
    static int trainNinja(int arr[][]) {
        int curr[]=new int[4];
        int prevArr[];

        int day=0;
        for(int prev =0;prev<4;prev++){
            int max=0;
            for (int i = 0; i < 3; i++) {
                if (i != prev && arr[0][i] > max) {
                    max = arr[0][i];
                }
            }
            curr[prev]=max;
        }
        
        for (day = 1; day < arr.length; day++) {
            prevArr=curr;
            curr=new int[4];
            for (int prev = 0; prev < 4; prev++) {
                int max = 0;
                for (int i = 0; i < 3; i++) {
                    if (i != prev) {
                        int x = arr[day][i] + prevArr[i];
                        if (x > max) {
                            max = x;
                        }
                    }
                }
                curr[prev] = max;
            }
        }
        return curr[3];
    }

    public static void main(String args[]) {

        int arr[][] = {
                { 23, 123, 45 },
                { 12, 236, 34 },
                { 24, 121, 35 }
        };
        int dp[][] = new int[arr.length][arr[0].length + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
       // int max = trainNinja(arr, dp, 2, 3);
        int max = trainNinja(arr);
        System.out.println(max);

    }
}
