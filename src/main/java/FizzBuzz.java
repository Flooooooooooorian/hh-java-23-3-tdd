public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static String fizzBuzz(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(num);
    }
}
