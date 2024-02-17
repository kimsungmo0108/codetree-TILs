public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        int sum = 1;
        for(int i=0; i<n; i++){
            nums1[i] = sc.nextInt();
            nums2[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=nums1[i]; j<=nums2[i]; j++){
                sum *= j;
            }
            System.out.println(sum);
            sum=1;
        }
    }
}