public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String sum = String.valueOf(a+b);
        int count = 0;
        for(int i=0; i<sum.length(); i++){
            if(sum.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}