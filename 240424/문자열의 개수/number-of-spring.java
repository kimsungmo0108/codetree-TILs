public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] str = new String[200];
        int count = 0;
        for(int i=0; i<200; i++){
            str[i] = sc.next();
            count++;
            if(str[i].equals("0")){
                break;
            }
        }
        System.out.println(count-1);
        for(int i=0; i<count-1; i+=2){
            System.out.println(str[i]);
        }
    }
}