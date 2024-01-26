public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner (System.in);
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        int c = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                nums[i] = n/i;
                c++;
            }
        }
        if(c >= 3){
            System.out.println("C");
        }else{
            System.out.println("N");
        }
    }
}