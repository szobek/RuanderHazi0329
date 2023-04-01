package teszt;

import java.util.Scanner;

public class Teszt {
    public static void main(String[] args) {
        int[][] tomb = new int[2][5];
        int[] nums = new int[10];
        int[] szamok = {2,3,6,4,33,25,36,32,12,10};
        int tombIndex=0;
        for(int i=0;i<tomb.length;i++){
            nums[i]=szamok[tombIndex];
            for(int j=0;j<tomb[i].length;j++){
                tomb[i][j]=szamok[tombIndex];
                tombIndex++;
            }
        }

    }
   /* public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] szamok1 = {2,3,6,55,23,253,54,20,15,36};



        System.out.println();
        int[][] szamok2x5 = new int[5][2];

        int sorszam=0;
        for (int i=0; i<=szamok2x5.length-1; i++) {
            for (int j=0; j<=szamok2x5[i].length-1; j++) {
                szamok2x5[i][j]=szamok1[sorszam];
                sorszam++;
            }
        }

        for (int i=0; i<=szamok2x5.length-1; i++) {
            for (int j=0; j<=szamok2x5[i].length-1; j++) {
                System.out.println(szamok2x5[i][j]+": ("+(i*2+j)+") 1index ("+i+","+j+") 2index");
            }
            System.out.println();
        }


        sc.close();
    }*/
}
