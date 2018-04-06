import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String args[]){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        input.nextLine();
        int N = input.nextInt();
        input.nextLine();
        String dm[] = input.nextLine().split(" ");
        String pg[] = input.nextLine().split(" ");
        int i=0;
        int j = 0;
        Integer dmo[] = new Integer[N];
        Integer peg[] = new Integer[N];
        Integer both[] = new Integer[N*2];
        for (i=0;i<N;i++){
            dmo[i] = Integer.parseInt(dm[i]);
            peg[i] = Integer.parseInt(pg[i]);
            both[i] = Integer.parseInt(dm[i]);
            both[N+i] = Integer.parseInt(pg[i]);
        }
        Arrays.sort(dmo);
        Arrays.sort(peg);
        Arrays.sort(both);
        if (type == 1){
            for (i=0;i<N;i++){
                if (dmo[i]<peg[i]){
                    sum += peg[i];
                }
                else{
                    sum += dmo[i];
                }
            }
            System.out.println(sum);
        }
        else{
            for (i=N;i<N*2;i++){
                sum += both[i];
            }
            System.out.println(sum);
        }
    }
}