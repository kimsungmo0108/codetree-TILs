public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0 || i%10==5 || (i%3==0 && i%9>1)){
                continue;
            }else{System.out.printf("%d ", i);}
        }
    }
}