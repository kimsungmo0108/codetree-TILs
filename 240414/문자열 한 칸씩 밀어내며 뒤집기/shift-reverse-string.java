public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int[] num = new int[n];
        String str2 = new String();
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
           if(num[i] == 1){
                str = str.substring(1, str.length()) + str.substring(0, 1);
                System.out.println(str);
            }else if(num[i] == 2){
                str = str.substring(str.length()-1) + str.substring(0, str.length()-1);
                System.out.println(str);
            }else if(num[i] == 3){
                for(int j = str.length()-1; j>=0; j--){
                    str2 += String.valueOf(str.charAt(j));
                }
                str = str2;
                System.out.println(str);
                str2 = "";
            }
        }
    }
}