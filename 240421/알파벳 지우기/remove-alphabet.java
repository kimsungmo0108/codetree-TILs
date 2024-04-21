public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String temp = new String();
        int sum = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) >= '0' && str1.charAt(i) <= '9'){
                temp += str1.charAt(i);
            }
        }
        sum += Integer.parseInt(temp);
        temp = "";
        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i) >= '0' && str2.charAt(i) <= '9'){
                temp += str2.charAt(i);
            }
        }
        sum += Integer.parseInt(temp);
        System.out.println(sum);
    }
}