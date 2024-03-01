public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] temp = new int[3];
        String[] symp = new String[3];
        int[] n = new int[4];
        int c = 0;
        for(int i=0; i<3; i++){
            symp[i] = sc.next();
            temp[i] = sc.nextInt();
        }

        for(int j=0; j<3; j++){
            if(temp[j]>=37 && symp[j].equals("Y")){
                n[0] += 1;
            }else if(temp[j]>=37 && symp[j].equals("N")){
                n[1] += 1;
            }else if(temp[j]<=36 && symp[j].equals("Y")){
                n[2] += 1;
            }else{n[3] += 1;}
        }

        for(int k=0; k<=3; k++){
            System.out.printf("%d ", n[k]);
        }

        if(n[0]>=2){
            System.out.print("E");
        }
        System.out.println();
    }
}