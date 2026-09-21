public class Main {
    public static void main(String[] args) {
        int numToExamine = 7;

        System.out.println("Number examined: " + numToExamine);
        System.out.println(numToExamine + " % 2 = " + (numToExamine % 2));

        if (numToExamine % 2 == 0) {
            System.out.println(numToExamine + " is even.");
        } else {
            System.out.println(numToExamine + " is odd.");
        }
    }
}