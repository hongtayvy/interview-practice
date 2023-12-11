package problems;

public class InvertCases {
    /**
     * We want to change any lowercases to uppercases, vice versa.
     */
    public static String runInvertCasesSolution(String invert){
        //We create a char array here to modify the char at each index. This allows us to not have to restore the data.
        char[] array = invert.toCharArray();

        for(int i = 0; i < array.length; i++){
            //We check if the character is lowercase, if it is we will uppercase that character vice versa.
            if(Character.isLowerCase(array[i])){
                array[i] = Character.toUpperCase(array[i]);
            } else {
                array[i] = Character.toLowerCase(array[i]);
            }
        }

        return new String(array);
    }
}
