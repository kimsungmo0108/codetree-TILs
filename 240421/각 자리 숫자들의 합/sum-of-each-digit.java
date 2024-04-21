public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String n = sc.next();
        int sum = 0;
        for(int i=0; i<n.length(); i++){
            int digit = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum += digit;
        }
        System.out.println(sum);
    }
}