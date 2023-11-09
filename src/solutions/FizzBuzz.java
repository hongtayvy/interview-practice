package solutions;

public class FizzBuzz {
    public static void runFizzBuzzSolution(int fizzBuzzMax){
        //A simple for loop to go through how many iterations the user wants
        for(int i = 1; i <= fizzBuzzMax; i++){
            //Calculate fizz
            String fizz = (i%3 == 0 ? "fizz" : "");

            //Calculate buzz
            String buzz = (i%5 == 0 ? "buzz" : "");

            //Check if fizz or buzz is not empty, then we print out the string else we print out the number
            if(!fizz.isEmpty() || !buzz.isEmpty()){
                System.out.println(fizz + buzz);
            } else {
                System.out.println(i);
            }

        }
    }

}
