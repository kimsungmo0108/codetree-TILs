public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int len = 0;
        int c = 0;
        for(int i=0; i<n; i++){
            str[i] = sc.next();
            len += str[i].length();
            if(str[i].charAt(0) == 'a'){
                c++;
            }
        }
        System.out.printf("%d %d", len, c);
    }
}