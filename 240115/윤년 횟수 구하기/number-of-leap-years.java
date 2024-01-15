public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i = 1; i<=n; i++){
            if(i%4 == 0){
                if(i%100==0 && i%400!=0){
                    c--;
                }
                c++;
            }
        }
        System.out.println(c);
    }
}