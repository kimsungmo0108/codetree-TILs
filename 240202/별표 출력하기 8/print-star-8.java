public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                System.out.print("*");
            }else if(i%2 == 0){
                for(int j=0; j<i; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}