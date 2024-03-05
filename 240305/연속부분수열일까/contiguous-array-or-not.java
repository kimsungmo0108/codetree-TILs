public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] n1 = new int[a];
        int[] n2 = new int[b];
        int count = -1;
        for(int i=0; i<a; i++){
            n1[i] = sc.nextInt();
        }
        for(int i=0; i<b; i++){
            n2[i] = sc.nextInt();
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(n1[i] == n2[j]){
                    count++;
                }
            }
        }
        if(count >= b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}