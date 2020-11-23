public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 1234;
        System.out.println("Reverse using toString()");
        System.out.println(integerReverse(number));
        System.out.println("Reverse using modulus and division by 10");
        System.out.println(anotherIntegerReverse(number));

    }

    public static int integerReverse(int number){
        String numberString = Integer.toString(number);
        String reversed = "";

        for (int i=numberString.length() - 1; i >= 0; i--){
            reversed +=numberString.charAt(i);
        }

        return  Integer.parseInt(reversed);
    }

    public static int anotherIntegerReverse(int number){
        // n = 123
        // reversed = 0
        // remainder = n % 10 = 123 % 10 =3
        // n = n/10 = 123/10 = 12
        // reversed = reversed *10 + remainder = 0*10 + 3 = 3

        // remainder = 12 % 10 = 2
        // n = n/10 = 12/10 = 1
        // reversed =  3*10 + 2 = 32

        // remainder = 1 % 10 = 1
        // n = n/10 = 1/10 = 0
        // reversed =  32*10 + 1 = 321

        // n = 0 ; n !> 0
        // exit loop

        int reversed = 0;
        int remainder;
        while (number>0){
            remainder = number % 10;
            number = number/10;
            reversed = reversed*10 + remainder;
        }
        return reversed;
    }



}
