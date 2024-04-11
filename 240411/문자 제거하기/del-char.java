public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int[] index = new int[str.length()-1];
        for(int i=0; i<str.length()-1; i++){
            index[i] = sc.nextInt();
        }
        for(int i=0 ;; i++){
            if(str.length() == 1){
                break;
            }
            if(index[i]>str.length()){
                continue;
            }
            str = str.substring(0, index[i]) + str.substring(index[i]+1);
            System.out.println(str);
            if(str.length() == 2){
                str = str.substring(0, 1);
                System.out.println(str);
            }
        }
    }
}