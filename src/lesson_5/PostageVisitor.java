package lesson_5;

public class PostageVisitor implements Visitor {

    private double totalPostageForCart;

    public void visit(Book book) {

        //assume we have a calculation here related to weight and price
        //free postage for a book over 10

        if (book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    /*
     * add other visitors here
     *
     * public void visit(Card card) {...}
     * public void visit(Game game) {...}
     *
     */

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
