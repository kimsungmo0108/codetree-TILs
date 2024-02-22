public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int sum = 0;
        int c = 0;
        int num = 0;
        for(int i=0; i<10; i++){
            num = sc.nextInt();
            if(num == 0){
                break;
            }else if(num%2 == 0){
                sum += num;
                c++;
            }
        }
        System.out.printf("%d %d", c, sum);
    }
}