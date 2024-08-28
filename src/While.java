public class While {
    public static void main(String[] args) {
        int j = 1;
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }

        // if we set true or no expression the while loop will always run
//        while (true) {
//            // Having some type of conditions allows us to break out of the while loop with the break keyword
//            if(j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }
//
//        boolean isReady = false;
//
//        do {
//            if(j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = (j > 0);
//        } while (isReady);

        int number = 0;

        while (number < 50) {
            number += 5;
            if(number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
