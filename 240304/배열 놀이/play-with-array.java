public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int c = 0;
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] nums = new int[n];
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        for(int j=0; j<q; j++){
            c = sc.nextInt();
            if(c==1){
                a = sc.nextInt();
                System.out.println(nums[a-1]);
            }else if(c==2){
                a = sc.nextInt();
                for(int k=0; k<n; k++){
                    if(a==nums[k]){
                        System.out.println(k+1);
                        break;
                    }else if(k==(n-1)){
                        System.out.println(0);
                        }
                }
            }else if(c==3){
                a = sc.nextInt();
                b = sc.nextInt();
                for(int k=a-1; k<b; k++){
                    System.out.printf("%d ", nums[k]);
                }
                System.out.println();
            }
        }
    }
}