public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] num = new int[5];
        for(int i=0; i<5; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.printf("%s ", (char)num[i]);
        }
    }
}