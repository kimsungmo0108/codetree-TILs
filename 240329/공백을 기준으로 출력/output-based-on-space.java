public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == ' '){
                continue;
            }
            System.out.printf("%s", str1.charAt(i));
        }
        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i) == ' '){
                continue;
            }
            System.out.printf("%s", str2.charAt(i));
        }
    }
}