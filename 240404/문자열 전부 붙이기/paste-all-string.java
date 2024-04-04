public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String str = new String();
        for(int i=0; i<n; i++){
            String c = sc.next();
            str += c;
        }
        System.out.println(str);
    }
}