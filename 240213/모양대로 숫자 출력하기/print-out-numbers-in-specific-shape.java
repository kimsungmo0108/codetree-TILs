public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=n; j>i; j--){
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){
                System.out.printf("%d ",k);
            }

            System.out.println();
        }
    }
}