public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int c = 0;
        int max = 0;
        int[] index = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(max<nums[i]){
                max = nums[i];
                index[i] = i+1;
            }
        }

        for(int i=n-1; i>=0; i--){
            if(index[i] == 0){
                continue;
            }
            System.out.printf("%d ",index[i]);
        }

    }
}