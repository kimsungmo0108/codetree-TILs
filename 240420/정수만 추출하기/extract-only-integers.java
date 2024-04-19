public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String t = new String();
        int temp = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)>='0' && str1.charAt(i)<='9'){
                t += String.valueOf(str1.charAt(i));
            }else{
                break;
            }
        }
        temp += Integer.parseInt(t);
        t="";
        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i)>='0' && str2.charAt(i)<='9'){
                t += String.valueOf(str2.charAt(i));
            }else{
                break;
            }
        }
        temp += Integer.parseInt(t);
        t="";
        System.out.println(temp);
    }
}