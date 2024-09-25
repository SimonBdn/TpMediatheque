package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	public void printCatalog() {
		System.out.println("Print Catalog : ");
		PrintCatalogVisitor printCatalogVisitor = new PrintCatalogVisitor();
		for (Item i : items) {
			i.accept(printCatalogVisitor);
		}
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
