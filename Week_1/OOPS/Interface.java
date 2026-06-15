
interface LibraryUser {
    void registerAccount();
    void requestBook();
}


class KidUser implements LibraryUser {
    
    int age;
    String bookType;

  
    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

 
    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if ("Kids".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}


class AdultUser implements LibraryUser {
    
    int age;
    String bookType;

   
    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

   
    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if ("Fiction".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}


public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        
        System.out.println("--- Test Case #1: KidUser ---");
     
        KidUser kidUser = new KidUser();
        
        
        kidUser.setAge(10);
        kidUser.registerAccount();
        
      
        kidUser.setAge(18);
        kidUser.registerAccount();
        
        
        kidUser.setBookType("Kids");
        kidUser.requestBook();
        
       
        kidUser.setBookType("Fiction");
        kidUser.requestBook();


        System.out.println("\n--- Test Case #2: AdultUser ---");
        
        AdultUser adultUser = new AdultUser();
        
        
        adultUser.setAge(5);
        adultUser.registerAccount();
        
        
        adultUser.setAge(23);
        adultUser.registerAccount();
        
      
        adultUser.setBookType("Kids");
        adultUser.requestBook();
        
      
        adultUser.setBookType("Fiction");
        adultUser.requestBook();
    }
}
