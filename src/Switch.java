public class Switch {
    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                // Need break to get out of statement
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is either 3, 4 or 5");
                System.out.println("Value is " + value);
                break;
            default:
                System.out.println("Value is not 1, 2, 3, 4, 5");
        }
    }
}
