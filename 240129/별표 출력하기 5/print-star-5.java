public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                for(int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}