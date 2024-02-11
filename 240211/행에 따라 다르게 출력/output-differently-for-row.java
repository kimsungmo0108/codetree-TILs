public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1; i<=n; i++){
            if(i%2==1){
                for(int j=0; j<n; j++){
                    System.out.printf("%d ", ++c);
                }
            }else{
                for(int j=0; j<n; j++){
                    c+=2;
                    System.out.printf("%d ", c);
                }
            }
            System.out.println();
        }
    }
}