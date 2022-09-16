package swap_puzzle;
import java.util.Scanner;
public class Swap_puzzle {
    public static tools aste = new tools ();
//    public static int board [][] = new int [3][3];
    public static void main(String[] args) {
//        tools aste = new tools();
        Scanner in = new Scanner(System.in);
        int angka [] = new int [9];
        int a =0,x=0,y=0;
        System.out.println(" masukan angka :");
        while(a<9){
            while(x<3){
                while(y<3){
                    aste.setboard(x,y,in.nextInt());
//                    board [x][y] = in.nextInt();
                    y++;
                }
                y=0;
                x++;
            }
            a++;
        }
        tampil();
        aste.cari();
        System.out.println("-----------------------------------------------");
        tampil();
    }
    public static void tampil(){
//        tools aste = new tools ();
        int a=0, x=0, y=0;
        while(x<3){
            while(y<3){
                System.out.print(" "+aste.getboard(x,y));
                y++;
            }
            y=0;
            System.out.println("");
            x++;
        }
    }    
}
