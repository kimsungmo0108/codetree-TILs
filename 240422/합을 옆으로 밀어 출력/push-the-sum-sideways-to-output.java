public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        String str = new String();
        for(int i=0; i<n; i++){
            num += sc.nextInt();
        }
        str = String.valueOf(num);
        for(int i=1; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.print(str.charAt(0));
    }
}