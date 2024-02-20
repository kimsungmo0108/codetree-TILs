public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double avg = 0;
        for(int i=0; i<n; i++){
            sum += sc.nextDouble();
        }
        avg = sum/n;
        System.out.printf("%.1f\n", avg);
        if(avg>=4.0){
            System.out.println("Perfect");
        }else if(avg>=3.0){
            System.out.println("Good");
        }else if(avg<3.0){
            System.out.println("Poor");
        }
    }
}