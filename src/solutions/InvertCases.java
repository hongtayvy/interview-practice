package solutions;

public class InvertCases {
    /**
     * We want to change any lowercases to uppercases, vice versa.
     */
    public static void runInvertCasesSolution(String invert){
        char[] array = invert.toCharArray();

        for(int i = 0; i < array.length; i++){
            char c = array[i];
            if(Character.isLowerCase(c)){
                array[i] = Character.toUpperCase(c);
            } else {
                array[i] = Character.toLowerCase(c);
            }
        }

        System.out.println("Original phrase was: " + invert + " now flipped cases is: " + new String(array));
    }
}
