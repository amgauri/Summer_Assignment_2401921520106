package WEEK1.OOPS;

interface LibraryUser {
    void registerAccount();
    void requestBook();

}
class KidUsers implements LibraryUser{
int age;
String bookType;
@Override
public void registerAccount() {
  
    if(age<12)
        System.out.println("You have successfully registered under a Kids Account");
    else
        System.out.println("Sorry, Age must be less than 12 to register as a kid");

}
@Override
public void requestBook() {
    if(bookType.equals("Kids"))
        System.out.println("Book Issued successfully, please return the book within 10 days");
else
        System.out.println("Oops, you are allowed to take only kids books");
}

}


   class AdultUsers implements LibraryUser{
int age;
String bookType;
@Override
public void registerAccount() {
    if(age>12)
        System.out.println("You have successfully registered under an Adults Account");
    else
        System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    
    
}
@Override
public void requestBook() {
     if(bookType.equals("Fiction"))
        System.out.println("Book Issued successfully, please return the book within 7 days");

    else
        System.out.println("Oops, you are allowed to take only adult Fiction books");
}
}
public class LibraryInterfaceDemo{
    public static void main(String[] args) {
        KidUsers k= new KidUsers();
        k.age=10;
        k.registerAccount();
        k.age=18;
        k.registerAccount();
        k.bookType="Kids";
        k.requestBook();
        k.bookType="Fiction";
        k.requestBook();
        AdultUsers a= new AdultUsers();
        a.age=10;
        a.registerAccount();
        a.age=18;
        a.registerAccount();
        a.bookType="Kids";
        a.requestBook();
        a.bookType="Fiction";
        a.requestBook();

    }
}