package lesson_7;

public class MVCPatternDemo {

    public static void main(String[] args) {
        Product model = retriveProductFromDatabase();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(model, view);
        controller.updateView();
        controller.setProductName("Le Club des incorrigibles optimistes");
        controller.updateView();
    }

    private static Product retriveProductFromDatabase() {
        Product product = new Product();
        product.setName("book");
        product.setPrice(700);
        return product;
    }
}
