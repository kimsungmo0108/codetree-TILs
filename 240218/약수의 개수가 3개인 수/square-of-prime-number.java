public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int d = 0;
        for(int i=a; i<=b; i++){
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    c++;
                }
            }
            if(c==3){
                d++;
            }
                c=0;
        }
        System.out.println(d);
    }
}