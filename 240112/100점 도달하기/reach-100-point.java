public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a; i<=100; i++){
            if(i>=90){
                System.out.printf("%s ", "A");
            }else if(i>=80 && i<90){
                System.out.printf("%s ", "B");
            }else if(i>=70 && i<80){
                System.out.printf("%s ", "C");
            }else if(i>=60 && i<70){
                System.out.printf("%s ", "D");
            }else if(i<60){
                System.out.printf("%s ", "F");
            }
        }
    }
}