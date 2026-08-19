import java.util.Scanner;

class EB {
    String ctype;
    int units, amount;

    void getInput() {
        Scanner s = new Scanner(System.in);
        // Added double quotes around the string literal
        System.out.println("Connection Type");
        ctype = s.nextLine();
        // Added double quotes around the string literal
        System.out.println("Units Consumed");
        units = s.nextInt();
    }

    void cal() {
        if (ctype.equalsIgnoreCase("domestic")) {
            if (units <= 100) {
                amount = 0;
            } else if (units <= 200) {
                amount = (units - 100) * 2;
            } else if (units <= 500) {
                amount = 200 + (units - 200) * 4;
            } else {
                amount = 1400 + (units - 500) * 6;
            }
        } else if (ctype.equalsIgnoreCase("commercial")) {
            if (units <= 100) {
                amount = units * 2;
            } else if (units <= 200) {
                amount = 200 + (units - 100) * 4;
            } else if (units <= 500) {
                amount = 600 + (units - 200) * 6;
            } else {
                amount = 2400 + (units - 500) * 7;
            }
        } else {
            // Added double quotes around the string literal
            System.out.println("Invalid connection type");
            return;
        }
        // Added double quotes around the string literal
        System.out.println("Amount to be paid : Rs " + amount);
    }

    public static void main(String[] args) {
        EB a = new EB();
        a.getInput();
        a.cal();
    }
}
