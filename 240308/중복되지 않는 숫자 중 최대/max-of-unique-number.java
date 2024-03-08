public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n =sc.nextInt();
        int c = -1;
        int[] nums = new int[n];
        int max = -1;
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(max == nums[i]){
                c=-1;
            }else{
                max = max>nums[i]?max:nums[i];
                c++;
            }
        }
        if(c == -1){
            System.out.println(c);
        }else{
            System.out.println(max);
        }
    }
}