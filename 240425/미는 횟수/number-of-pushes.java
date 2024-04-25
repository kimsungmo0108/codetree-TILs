public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int count = 0;
        char[] c = new char[str1.length()];
        for(;;){
            if(str1.equals(str2) || count >= c.length){
                break;
            }
            c = str1.toCharArray();
            str1 = "";
            str1 += String.valueOf(c[c.length-1]);
            for(int i = 0; i < c.length-1; i++){
                str1 += String.valueOf(c[i]);
            }
            count++;
        }
        if(count >= c.length){
            System.out.println(-1);
        }else if(count == 0){
            System.out.println(c.length);
        }else{
            System.out.println(count);
        }
    }
}