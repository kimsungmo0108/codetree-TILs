public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int min = 1000;
        int max = 0;
        int index = -1;
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(min>nums[i]){
                min = nums[i];
                index = i;
            }
        }

        for(int i=index;i<n;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }

        if((min-max)<0){
            System.out.printf("%d\n", max-min);
        }else{
            System.out.println(0);
        }
    }
}