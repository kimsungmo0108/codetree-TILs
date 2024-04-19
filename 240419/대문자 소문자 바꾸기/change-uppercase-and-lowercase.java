public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                System.out.printf("%s", (char)(str.charAt(i)-'a'+'A'));
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                System.out.printf("%s", (char)(str.charAt(i)-'A'+'a'));
            }
        }
    }
}