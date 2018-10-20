package JavaTaskTwo.Model.ArrayOperations;

import JavaTaskTwo.Model.StringOperations.IsStringNumeric;

public class CheckArrayForNumbers {

    public static boolean isThereAnyNumbers (String[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (IsStringNumeric.isNumeric(arr[i])==true){
                return true;
            }
        }
        return false;
    }
}
