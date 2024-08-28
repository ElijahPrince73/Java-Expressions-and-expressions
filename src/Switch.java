public class Switch {
    public static void main(String[] args) {
        int value = 3;
        // Traditional switch statement
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
        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        char natoLetter = 'z';
        System.out.println(NATO(natoLetter));
    }

    public static String getQuarter (String month) {
        // New switch statement
        return switch (month) {
            case "jan", "feb", "mar" -> "1st";
            case "apr", "may", "jun" -> "2nd";
            case "jul", "aug", "sep" -> "3nd";
            case "oct", "nov", "dec" -> "4th";
            // Always include a default case
            // Code blocks need yield keyword
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

    public static String NATO (char letter) {
        switch (letter) {
            case 'a':
                return "Able";
            case 'b':
                return "Baker";
            case 'c':
                return "Charlie";
            case 'd':
                return "Dog";
            case 'e':
                return "Easy";
            case 'f':
                return "Fox";
            case 'g':
                return "George";
            case 'h':
                return "How";
            case 'i':
                return "Item";
            case 'j':
                return "Jig";
            case 'k':
                return "King";
            case 'l':
                return "Love";
            case 'm':
                return "Mike";
            case 'n':
                return "Nan";
            case 'o':
                return "Oboe";
            case 'p':
                return "Peter";
            case 'q':
                return "Queen";
            case 'r':
                return "Roger";
            case 's':
                return "Sugar";
            case 't':
                return "Tare";
            case 'u':
                return "Uncle";
            case 'v':
                return "Victor";
            case 'w':
                return "William";
            case 'x':
                return "X-ray";
            case 'y':
                return "Yoke";
            case 'z':
                return "Zebra";
            default:
                return "not a letter";
        }
    }
}
