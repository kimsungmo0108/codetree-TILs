public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int count = 0;
        char c = str.charAt(0);
        int[] len = new int[str.length()];
        char[] ch = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                count++;
                if(i==str.length()-1){
                    len[i] = count;
                    ch[i] = c;
                }
            }else if(str.charAt(i) != c){
                len[i-1] = count;
                ch[i-1] = c;
                count=1;
                c=str.charAt(i);
            }
        }
        String abc = new String();
        for(int i=0; i<str.length(); i++){
            if(len[i] == 0){
                continue;
            }
            abc += ch[i];
            abc += len[i];
        }
        System.out.printf("%d\n%s", abc.length(), abc);
    }
}