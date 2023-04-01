package teszt;

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
StringBuilder stringBuilderObj = new StringBuilder(" a szám: ");
        for(int i=0;i<10;i++){
            stringBuilderObj.append(nums[i]);
            stringBuilderObj.append(" az egyik index: "+i);
            if(i<2){

                for(int j=0;j<tomb[i].length;j++){
                    System.out.print(stringBuilderObj.toString());
                    stringBuilderObj.setLength(0);
                }
            }
        }
    }
}
