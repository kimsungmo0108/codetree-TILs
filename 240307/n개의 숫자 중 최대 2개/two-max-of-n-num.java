public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int max1 = -2147483648;
        int max2 = -2147483648;
        int index = -1;
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
            if(max1<nums[i]){
                max1 = nums[i];
                index = i;
            }else if(max1>nums[i]){
                continue;
            }
        }
        for(int i=0; i<n; i++){
            if(i==index){
                continue;
            }
            max2 = max2>nums[i]?max2:nums[i];
        }
        System.out.printf("%d %d", max1, max2);
    }
}