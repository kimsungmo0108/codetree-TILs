public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if(a>=3 && a<=5){
            System.out.println("Spring");
        }else if(a>=6 && a<=8){
            System.out.println("Summer");
        }else if(a>=9 && a<=11){
            System.out.println("Fall");
        }else{System.out.println("Winter");}
    }
}