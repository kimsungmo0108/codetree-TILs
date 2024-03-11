public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int max = 0;
        int min = 1001;
        int[] nums = new int[10];
        for(int i=0; i<10; i++){
            nums[i] = sc.nextInt();
            if(nums[i] < 500){
                max = nums[i]>max?nums[i]:max;
            }else if(nums[i] > 500){
                min = nums[i]<min?nums[i]:min;
            }
        }

        System.out.printf("%d %d", max, min);
    }
}