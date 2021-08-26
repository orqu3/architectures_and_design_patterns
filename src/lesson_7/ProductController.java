package lesson_7;

public class ProductController {

    private final Product model;
    private final ProductView view;

    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void setProductName(String name) {
        model.setName(name);
    }

    public String getProductName() {
        return model.getName();
    }

    public void setProductPrice(int price) {
        model.setPrice(price);
    }

    public int getProductPrice() {
        return model.getPrice();
    }

    public void updateView() {
        view.printProductDetails(model.getName(), model.getPrice());
    }
}