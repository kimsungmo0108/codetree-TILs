public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int count = 0;
        double len = 0;
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        for(int i=0; i<n; i++){
            if(c == str[i].charAt(0)){
                count++;
                len += str[i].length();
            }
        }
        System.out.printf("%d %.2f", count, (len/count));
    }
}