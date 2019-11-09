public class ArrayReverse {
    public static void main(String[] args){
        int[] numbers = new int[]{1,2,3,4,5,6};
        int[] reverse = reverseArray(numbers);

        
        
    }

    private static int[] reverseArray(int[] numberList)
    {
        int count = findlen(numberList);
        System.out.println("Enhanced for-each loop: " + count);
        int swap1=0;
        int swap2=0;
        if (count>0) {
            for (int i=0;  i<count/2;i++,count--) {
               //System.out.println("Enhanced for-each loop: i = " + numberList[i-1]);
             swap1=numberList[i];
             swap2=numberList[count];
                numberList[count] = swap1;
                numberList[i] = swap2;
            }
        }  

        for(int num : numberList) {
            System.out.println("After reverse array list items: " + num);
        }
        return numberList;
    }
    private static int findlen(int[] numberList)
    {
        int counter=0;
        for (int num : numberList) {
             System.out.println("Before reverse array list items: " + num);
            counter++;
        }
        return counter-1;
    }
}