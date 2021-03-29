// JAVA101 ARRAYS
// HOMEWORK

public class ArrayList {

    private static int[] array = new int[14];

    public static void main(String[] args) {
        //for(int i: array) System.out.print(i+" ");
        count(0);
        //System.out.println();
        //for(int i: array) System.out.print(i + " ");
    }

    public static void newArray(int[] arr){
        array = new int[(arr.length)*2];
    }

    public static void add(int value){
        int length = array.length;
        newArray(array);
        array[length+1] = value;
    }

    public static void insert(int index, int value){
        for(int i=array.length-1; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = value;
    }

    public static void count(){
        int lengthOfArray=0;
        for (int i:array) { lengthOfArray++;}
        System.out.println(lengthOfArray);
    }

    public static int get(int index){
        return array[index];
    }

    public static void set(int index, int value){
        array[index] = value;
    }

    public static void remove(int value){
        for(int i=value; i<array.length-1; i++){
            array[i] = array[i+1];
        }
    }
}
