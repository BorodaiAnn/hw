public class CyclicShifter {
    public static void main(String[] args) {
        int [] array={0,1,2,3,4,5,6};
        int shiftPositions=-8;
        System.out.println(Arrays.toString(cyclicShift(array,shiftPositions)));
    }
    public static int [] cyclicShift (int [] array,int shiftPositions){
        int [] cyclicArray= new int[array.length];
        if (shiftPositions<0){
            for (int i=0; i<array.length; i++){
                if (Math.abs(shiftPositions)>array.length) shiftPositions=shiftPositions%array.length;
                if ((i-shiftPositions)<array.length){
                    cyclicArray[i]=array[i-shiftPositions];
                }
                else {
                    cyclicArray[i]=array[-shiftPositions-(array.length-i)];
                }
            }
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (shiftPositions>array.length) shiftPositions=shiftPositions%array.length;
                if ((array.length - shiftPositions + i) < array.length) {
                    cyclicArray[i] = array[array.length - shiftPositions + i];
                } else {
                    cyclicArray[i] = array[i - shiftPositions];
                }
            }
        }
        return cyclicArray;
    }
}