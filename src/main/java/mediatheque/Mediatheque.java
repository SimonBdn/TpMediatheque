package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		System.out.println("Print Only Books : ");
		PrintBooksOnlyVisitor printBooksOnlyVisitor = new PrintBooksOnlyVisitor();
		for (Item i : items)
			i.accept(printBooksOnlyVisitor);
	}

	public void printOnlyCDs() {
		System.out.println("Print Only CDs : ");
		PrintCDOnlyVisitor printCDOnlyVisitor = new PrintCDOnlyVisitor();
		for (Item i : items) {
			i.accept(printCDOnlyVisitor);
		}
	}


}
