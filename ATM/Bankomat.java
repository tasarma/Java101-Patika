import java.util.Scanner;

class Bankomat{
    public static void main(String[] args) {
        print(multiplesOf20(userEnterValue()));
    }

    public static int userEnterValue(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç para çekmek istiyorsunuz : ");
        int value = scan.nextInt();
        scan.close();
        return value;
    }

    public static int[][] multiplesOf20(int value){
        if(value%20==0){
            int[][] adet = {{0,100},{0,50},{0,20}};
            while(value>0){
                if(value>=100){
                    value -= 100;
                    adet[0][0] += 1;
                }

                else if(value<100){
                    value -= 20;
                    adet[2][0] += 1;
                }
                else break;
            }
            return adet;
        }
        return null;
    }

    public static void print(int[][] matrix){
        if(matrix != null){
            for(int row=0; row<matrix.length; row++){
                    if(matrix[row][0] != 0){
                        System.out.println(matrix[row][0]+" adet "+matrix[row][1]+" tl");
                    }
            }
        }
        else System.out.println("Bankomat sadece 20 tl ve katlarını verebilmektedir.");
    }
}