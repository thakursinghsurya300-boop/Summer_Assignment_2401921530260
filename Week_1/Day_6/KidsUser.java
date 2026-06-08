public class KidsUser implements LibraryUser {
   public void registerAccount(int age)
   {
    if(age<=12)
    {
        System.out.println("You have successfully registered kids account");
    }
    if(age>12)
    {
        System.out.println("Sorry age must be less than 12 to register account");
    }
    return;
   }
   public void requestBook(String BookType)
   {
    if(BookType.equals("Kids"))
    {
        System.out.println("Book issued successfully ,please return the book within 10 days");
    }
    else
    {
        System.out.println("Oops yuo are allowed to take only kids book");
    }
   } 
}
