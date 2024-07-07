import java.util.Scanner;

class ete70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the number of contacts
        int numberOfContacts = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        // Creating arrays to store contact details
        String[] names = new String[numberOfContacts];
        String[] phoneNumbers = new String[numberOfContacts];
        String[] emails = new String[numberOfContacts];

        // Reading contacts details and storing them in the arrays
        for (int i = 0; i < numberOfContacts; i++) {
            names[i] = sc.next();
            phoneNumbers[i] = sc.next();
            emails[i] = sc.next();
        }

        // Reading the name to search for
        String searchName = sc.next();

        // Performing linear search
        int index = linearSearch(names, searchName);

        // Printing the result
        if (index != -1) {
            System.out.println(names[index]);
            System.out.println(phoneNumbers[index]);
            System.out.println(emails[index]);
        } else {
            System.out.println(-1);
        }
    }

    // Linear search method
    public static int linearSearch(String[] names, String searchName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                return i;
            }
        }
        return -1;
    }
}
