public class Products {     // Khởi tạo lớp sản phẩm với những thuộc tính.
    private String productId;
    private String productName;
    private String description;
    private int unitPrice;
    private int quantity;

    public Products() {}         // Khởi tạo contructer không tham số.

    public Products(String productId, String productName,           // Còn đây là contructer có tham số.
                           String description, int unitPrice,
                           int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // phương thức get và set cho thuộc tính:
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Phương thức thêm sản phẩm;
    public void addProduct(String ID) {

    }

    // Phương thức sửa sản phẩm:
    public void editProduct() {

    }

    // Phương thức xóa sản phẩm:
    public void deleteProduct() {

    }

    @Override
    public String toString() {
        return "Products{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
