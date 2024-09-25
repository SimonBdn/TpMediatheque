package mediatheque;

public class PrintCatalogVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + " de " + book.getAuthor());
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD: " + cd.getTitle() + " (" + cd.getNumberOfTracks() + ")");
    }
}