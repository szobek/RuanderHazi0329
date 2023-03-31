import java.util.Scanner;

/*
Töltsünk fel egy 10 elemű tömböt a felhasználótól bekért egész számokkal.
A., Írjuk ki az adatokat egymás mellé szóközzel elválasztva! -
B., Írjuk ki az első elem négyzetét! -
C., Írjuk ki a páratlan számokat és indexeiket (soronként egy szám-index párt kiírva)!-
D., Írjuk ki a hárommal osztható számokat a tömb utolsó elemétől az első felé haladva!-
E., Írjuk ki az első öt elem összegét és külön az utolsó öt elem összegét!-
F., Hozzunk létre egy ugyancsak 10 elemű, de kétdimenziós tömböt és töltsük fel ugyanazokkal az értékekkel mint az első tömböt! -
G., Listázzuk ki egymás alá a számokat úgy, hogy minden szám mellé írjuk ki mindkét tömbbeli indexét!
 */
public class Main {
    static void tombFeltoltes() {
        Scanner sc = new Scanner(System.in);
        int[] tomb = new int[10];
        int[][] szamok2 = new int[2][5];
        for (int i = 0; i < tomb.length; i++) {
            System.out.print("Kérem adja meg a(z) " + (i + 1) + ". számot: ");
            tomb[i] = Integer.parseInt(sc.nextLine());
        }
        adatokListazasa(tomb);
        System.out.println();
        elsoElemNegyzete((double) tomb[0]);
        System.out.println();
        paratlanListaIndexszel(tomb);
        System.out.println();
        harommalOszthtoForditottSorrendben(tomb);
        System.out.println();
        elsoEsUtolsoOtElemOsszege(tomb);
        ujTombKeszites(tomb, szamok2);
        System.out.println();
        ertekMindketTombbolIndexszel(tomb, szamok2);
    }

    static void adatokListazasa(int[] tomb) {
        for (int elem : tomb) {
            System.out.print(elem + " ");
        }
    }

    static void elsoElemNegyzete(double szam) {
        System.out.println("Az első elem négyzete: " + Math.pow(szam, 2));
    }

    static void paratlanListaIndexszel(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0) {
                System.out.println("A páratlan szám: " + tomb[i] + " és az index: " + i);
            }
        }
    }

    static void harommalOszthtoForditottSorrendben(int[] tomb) {
        for (int i = tomb.length - 1; i >= 0; i--) {
            if (tomb[i] % 3 == 0) {
                System.out.println("A hárommal osztható szám: " + tomb[i] + " és az index: " + i);
            }
        }
    }

    static void elsoEsUtolsoOtElemOsszege(int[] tomb) {
        int elsoOtOsszeg = 0, utolsoOtOsszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (i < 5) {
                elsoOtOsszeg += tomb[i];
            } else {
                utolsoOtOsszeg += tomb[i];
            }

        }
        System.out.println("az első 5 összege: " + elsoOtOsszeg + ", az utolsó 5 összege: " + utolsoOtOsszeg);
    }

    static void ujTombKeszites(int[] tomb, int[][] szamok2) {
        int index = 0;
        for (int i = 0; i < szamok2.length; i++) {
            for (int j = 0; j < szamok2[i].length; j++) {
                szamok2[i][j] = tomb[index];
                index++;
            }
        }
        for (int[] i : szamok2) {
            for (int elem : i) {
                System.out.print(elem + " | ");
            }
        }
    }

    static void ertekMindketTombbolIndexszel(int[] tomb, int[][] szamok2) {
        for (int i = 0; i < tomb.length; i++) {
            String masodikTombIndex = getIndexByNum(tomb[i], szamok2);
            System.out.println("szám: " + tomb[i] + " ,index1: " + i + " | index2:" + masodikTombIndex);
        }
    }

    static String getIndexByNum(int num, int[][] szamok2) {
        StringBuilder index = new StringBuilder("");
        for (int i =0;i<szamok2.length;i++){
            for (int j=0;j< szamok2[i].length;j++){
                if(num==szamok2[i][j]){
                    index.append(" az i: "+i + " a j: "+j);
                }
            }
        }
        return index.toString();
    }

    public static void main(String[] args) {
        tombFeltoltes();
    }
}