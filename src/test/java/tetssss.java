public class tetssss {

    public static void main(String[] args) {
        PrintFizzBuzz(44);
    }

    public static void PrintFizzBuzz(int n) {
        for (int i =1; i<=n; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println("n "+i);
            }

        }

    }
}
