package mediatheque;

public class PrintBooksOnlyVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + " de " + book.getAuthor());
    }

    @Override
    public void visit(CD cd) {
        // do nothing
    }
}
