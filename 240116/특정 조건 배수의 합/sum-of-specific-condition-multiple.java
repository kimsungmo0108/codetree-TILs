public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a>b ? a:b;
        int min = a<b ? a:b;
        int sum = 0;
        for(; min<=max; min++){
            if(min%5==0){
                sum += min;
            }
        }
        System.out.println(sum);
    }
}