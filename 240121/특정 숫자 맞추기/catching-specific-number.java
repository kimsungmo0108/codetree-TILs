public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if(a == 25){
                System.out.println("Good");
                break;
            }else if(a > 25){
                System.out.println("Lower");
            }else if(a < 25){
                System.out.println("Higher");
            }
        }
    }
}