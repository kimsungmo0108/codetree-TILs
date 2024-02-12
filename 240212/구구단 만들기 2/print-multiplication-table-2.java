public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=2; i<=8; i+=2){
            for(int j=b; j>=a; j--){
                System.out.printf("%d * %d = %d", j, i, j*i);
                if(j>a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}