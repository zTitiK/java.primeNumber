
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Input: n = ");
        n = sc.nextInt();
        System.out.print("Output:");
        for (int i = 2; i <= n; i++) {
            int key = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    key = 0;
                    break;
                }
            }
            if (key == 1) {
                System.out.print("\t" + i);
            }
        }
        System.out.println("");

    }

}
