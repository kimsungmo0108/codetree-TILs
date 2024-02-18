public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int answer_cnt = 0;

        for(int curr_num = start; curr_num <= end; curr_num++) {
            // Step 1:
            int divisor_sum = 0;
            for(int divisor = 1; divisor <= curr_num-1; divisor++){
                if(curr_num % divisor == 0){
                    divisor_sum += divisor;
                }
            }
            // Case 1:
            if(divisor_sum == curr_num){
                answer_cnt++;
            }
        }
        
        System.out.println(answer_cnt);
    }
}