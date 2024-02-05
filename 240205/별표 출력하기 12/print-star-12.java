public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            if(i>0){
                for(int m=0; m<i; m++){
                    System.out.print("  ");
                }
            }
            for(int j=i; j<n; j++){
                if(i==0){
                    System.out.print("* ");
                }else{
                    if(j%2==0){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");}
                }
            }
            System.out.println();
        }
    }
}