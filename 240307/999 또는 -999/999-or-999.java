public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = 0;
        int max = -999;
        int min = 999;
        for(;;){
            a = sc.nextInt();
            if(a==999 || a==-999){
                break;
            }else{
                max = max>a?max:a;
                min = min<a?min:a;
            }
        }
        System.out.printf("%d %d", max, min);
    }
}