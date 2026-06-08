public class AdultUser implements LibraryUser {
    public void registerAccount(int age)
   {
    if(age>12)
    {
        System.out.println("You have successfully registered adult account");
    }
    if(age<=12)
    {
        System.out.println("Sorry age must be greater than 12 to register account");
    }
    return;
   }
   public void requestBook(String BookType)
   {
    if(BookType.equals("Fiction"))
    {
        System.out.println("Book issued successfully ,please return the book within 7 days");
    }
    else
    {
        System.out.println("Oops yuo are allowed to take only adult fiction books");
    }
   }  
    
}
