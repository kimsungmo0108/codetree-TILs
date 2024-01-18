public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i=0; i<=n; i++){
            if(i%2==0 || i%3==0 || i%5==0){
                continue;
            }else{
                c++;
            }
        }
        System.out.println(c);
    }
}