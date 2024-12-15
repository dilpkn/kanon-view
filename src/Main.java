import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        Scanner in = new Scanner(input);
        int n =in.nextInt();
        int[] P = new int[n];
        for(int i=0;i<n-1;i++){
            int temp = in.nextInt();
            int x = in.nextInt();
            P[x-1] = temp;
        }
        FileWriter writer = new FileWriter("output.txt");
        for(int t:P){
            writer.write(t + " ");
        }
        writer.close();
    }
}
