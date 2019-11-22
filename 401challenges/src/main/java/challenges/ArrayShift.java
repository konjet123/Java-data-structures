package challenges;

public class ArrayShift {

    public static void main(String[] args){
        String[] listOfItems = new String[]{"XBOX","PS4","NVIDIA","IROBOT"};
        String listOfItem= "SWITCH";
        String[] finalArray = insertShiftArray(listOfItems, listOfItem );
         for(String str : finalArray) {
            System.out.println(str);
        }
        if(findDuplicate(finalArray)) {
            System.out.println("Duplicates Found");
        }
        else {
            System.out.println("No Duplicates Found");
        }
    }
    public static boolean findDuplicate(String[] strings) {
        int counter=0;
        for(String searchStringValue : strings) {
            for(int ctr=counter+1;ctr<strings.length;ctr++) {
                if (searchStringValue == strings[ctr]) {
                    return true;
                }
            }
            counter++;
        }
        return false;
    }

    public static String[] insertShiftArray(String[] strings, String addString) {
        int strLength = strings.length;
        int finalArrayLength = strLength + 1;
        String[] mergeArray = new String[finalArrayLength];
        int ctr=0;
        String tempString = null;
        boolean isBookmark = false;
        for(ctr=0;ctr<strLength;ctr++)
        {
            if(isBookmark) {
                mergeArray[ctr] = tempString;
                tempString = strings[ctr];
            }
            else {
                mergeArray[ctr] = strings[ctr];
            }
           if(strLength/2==ctr) {
                mergeArray[ctr] = addString;
                tempString = strings[ctr];
                isBookmark = true;
            }
        }
        if(ctr==finalArrayLength-1){
            mergeArray[ctr] = tempString;
        }
        return mergeArray;
    }

}
