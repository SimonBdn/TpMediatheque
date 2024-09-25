package mediatheque;

public class PrintCDOnlyVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        // do nothing
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD: " + cd.getTitle() + " (" + cd.getNumberOfTracks() + ")");
    }
}
