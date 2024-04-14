import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private Member borrowedBy;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Member getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(Member borrowedBy) {
        this.borrowedBy = borrowedBy;
    }
}

class Member {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public int getNumOfBorrowedBooks() {
        return borrowedBooks.size();
    }
}

class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Book book, Member member) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            book.setBorrowedBy(member);
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book, Member member) {
        book.setAvailable(true);
        book.setBorrowedBy(null);
        member.returnBook(book);
        System.out.println(member.getName() + " returned " + book.getTitle());
    }

    public Map<Book, Member> getBooksBorrowed() {
        Map<Book, Member> borrowedBooks = new HashMap<>();
        for (Book book : books) {
            if (!book.isAvailable()) {
                borrowedBooks.put(book, book.getBorrowedBy());
            }
        }
        return borrowedBooks;
    }

    public Map<Member, Integer> getMembersWithBorrowedBooksCount() {
        Map<Member, Integer> membersWithBorrowedBooksCount = new HashMap<>();
        for (Member member : members) {
            membersWithBorrowedBooksCount.put(member, member.getNumOfBorrowedBooks());
        }
        return membersWithBorrowedBooksCount;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(book1, member1);
        library.borrowBook(book2, member2);

        library.returnBook(book1, member1);


        System.out.println("\nBooks borrowed by members:");
        Map<Book, Member> borrowedBooks = library.getBooksBorrowed();
        for (Map.Entry<Book, Member> entry : borrowedBooks.entrySet()) {
            System.out.println(entry.getKey().getTitle() + " is borrowed by " + entry.getValue().getName());
        }


        System.out.println("\nNumber of books borrowed by each member:");
        Map<Member, Integer> membersWithBorrowedBooksCount = library.getMembersWithBorrowedBooksCount();
        for (Map.Entry<Member, Integer> entry : membersWithBorrowedBooksCount.entrySet()) {
            System.out.println(entry.getKey().getName() + " has borrowed " + entry.getValue() + " books.");
        }


        System.out.println("\nAvailable books in the library:");
        List<Book> availableBooks = library.getAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getTitle());
        }
    }
}
