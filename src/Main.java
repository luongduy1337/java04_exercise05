import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nhập loại xe bạn muốn đi (Grab car (GC), Grab SUV (GS), Grab Black (GB)): ");
        String loaiXeNguoiDungNhap = sc1.nextLine();
        System.out.print("Nhập số km bạn đã đi được: ");
        double soKm = Double.parseDouble(sc1.nextLine());
        System.out.print("Nhập thời gian chờ đợi: ");
        double thoiGianCho = Double.parseDouble(sc1.nextLine());
        switch (loaiXeNguoiDungNhap){
            case "GC":
                double soTienGC = HamTinhTienXeImpl.HamTinhTienGrabCar(soKm, thoiGianCho);
                System.out.println("Số tiền bạn cần phải trả là: " + soTienGC);
                break;
            case "GS":
                double soTienGS = HamTinhTienXeImpl.HamTinhTienGrabSUV(soKm, thoiGianCho);
                System.out.println("Số tiền bạn cần phải trả là: " + soTienGS);
                break;
            case "GB":
                double soTienGB = HamTinhTienXeImpl.HamTinhTienGrabBlack(soKm, thoiGianCho);
                System.out.println("Số tiền bạn cần phải trả là: " + soTienGB);
                break;
            default:
                System.out.println("Xe bạn nhập chưa hợp lệ. Vui lòng kiểm tra lại");
                break;
        }
    }
}