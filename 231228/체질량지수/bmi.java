public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = ((b*100*100)/(a*a));
        System.out.println(c);
        if(c>=25){
            System.out.println("Obesity");
        }
    }
}