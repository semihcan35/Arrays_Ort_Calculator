public class Main {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6};
        int sum=0;


        for(int i=0 ; i<num.length;i++){
            sum+=num[i];
        }

        System.out.println("Ortalama = " + sum/num.length);

    }
}