import java.io.File;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws Exception {
        File a = new File("nadim.txt");
        Scanner scan = new Scanner(a);

        int count = 0;

        while(scan.hasNext()){
            count += scan.nextLine().split(" ").length;
        }
        System.out.println(count);

    }
}
