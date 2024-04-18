public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                System.out.print((char)(str.charAt(i)-'A'+'a'));
            }else if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                System.out.print(str.charAt(i));
            }else if('1' <= str.charAt(i) && str.charAt(i) <= '9'){
                System.out.print(str.charAt(i));
            }else{
                continue;
            }
        }
    }
}