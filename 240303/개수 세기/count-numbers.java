public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(m == num){
                c++;
            }
        }
        System.out.println(c);
    }
}