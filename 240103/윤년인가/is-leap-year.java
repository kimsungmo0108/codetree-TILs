public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a % 4;
        int a2 = a % 100;
        int a3 = a % 400;

        if ((a1 == 0) && (a2 > 0)) {
            System.out.println("true");
        } else if (a3 == 0) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}