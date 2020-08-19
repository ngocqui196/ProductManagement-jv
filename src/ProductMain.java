import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class ProductMain {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int selection, unitPrice, quantity;
        String name, iD, description;

        FileInputStream read = new FileInputStream("C:\\Users\\Admin\\ProductManagement-jv\\ListProducts\\file.txt" );


        ArrayList<Products> listProduct = new ArrayList<>();

        Products line = null;

        do {
            System.out.println("Lựa chọn của bạn: ");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Sửa đổi.");
            System.out.println("3. Xóa.");
            System.out.println("0. Thoát.");

            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    try {
                        System.out.println(" Nhập mã ID cho sản phẩm của bạn:");
                        iD = sc.nextLine();
                        System.out.println("Nhập Tên sản phẩm: ");
                        name = sc.nextLine();
                        System.out.println("Nhập mô tả sản phẩm:");
                        description = sc.nextLine();
                        System.out.println("Nhập gía sản phẩm:");
                        unitPrice = sc.nextInt();
                        System.out.println("Nhập số lượng sản phẩm: ");
                        quantity = sc.nextInt();
                        Products products = new Products(iD, name, description, unitPrice, quantity);
                        listProduct.add(products);

                        FileWriter writer = new FileWriter("C:\\Users\\Admin\\ProductManagement-jv\\ListProducts\\file.txt");
                        writer.write(listProduct.toString());
                        writer.write("\f\n");
                        listProduct.remove(0);
                        writer.close();
                    } catch (IOException | InputMismatchException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Nhập ID sản phẩm bạn muốn sửa: ");
                    iD = sc.nextLine();

                case 0:
                    exit(-1);
            }

        } while (flag);
    }
}
