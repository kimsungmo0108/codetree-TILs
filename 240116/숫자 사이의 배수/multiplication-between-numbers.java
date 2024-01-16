public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int c = 0;
        for(; a<=b ; a++){
            if(a%5==0 || a%7==0){
                sum += a;
                c++;
            }
        }
        System.out.printf("%d %.1f", sum, (sum/(float)c));
    }
}