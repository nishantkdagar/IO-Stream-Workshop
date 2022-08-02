import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    static int noOfBooks;
    static String[] bookName = new String[noOfBooks];
    static int totalPerson;
    static ArrayList<Contact> ContactDetails1 = new ArrayList<>();
    static ArrayList<Contact> ContactDetails2 = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter how many books needs to be created");
        noOfBooks = sc.nextInt();
        addBooks();
        showSavedDetails();


    }
    public static void addBooks(){
        for (int i = 0; i <noOfBooks; i++){
            System.out.println("Enter how many person will be in this address book: ");
            totalPerson = sc.nextInt();
            for (int x = 0; x < totalPerson; x++){
                Contact object = new Contact();
                System.out.println("Enter Person details");
                System.out.println("Enter Full Name");
                object.setFullName(sc.nextLine());
                System.out.println("Enter City");
                object.setCity(sc.nextLine());
                System.out.println("Enter Phone Number");
                object.setPhoneNO(sc.nextLine());
                if(i == 0){
                    ContactDetails1.add(object);

                } else if (i == 1) {
                    ContactDetails2.add(object);
                }
            }
        }

    }
    public static void showSavedDetails(){
        System.out.println("The following person are in address book");
        for (Contact allperson: ContactDetails1){
            System.out.println(allperson);

        }
    }
}
