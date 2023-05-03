package Course3oops;

public class Employee {
    String bookName;
    String Isbn;
    int yearOfPublishing;
    String authorName;

    public Employee() {
        bookName = "grey";
        Isbn = "98765431";
        yearOfPublishing = 2965;
        authorName = "Raheem";
    }
    public void display() {
        System.out.println("Book title" + bookName);
        System.out.println("isbn = " + Isbn);
        System.out.println("yearOfPublishng = " + yearOfPublishing);
        System.out.println("autherName = " + authorName);

    }
}

