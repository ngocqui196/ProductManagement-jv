import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int selection;
        String name,ID;
        do {
            System.out.println("Lựa chọn của bạn: ");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Sửa đổi.");
            System.out.println("3. Xóa.");
            System.out.println("0. Thoát.");

            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.println(" Nhập mã ID cho sản phẩm của bạn:");
                    ID = sc.nextLine();

                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm bạn muốn sửa: ");
                    name = sc.nextLine();
            }

        }while (flag);
    }
}
