public class Main {
    public static void main(String[] args) throws InterruptedException {
        BieuPhi bp = new BieuPhi(5000, 3000);
        LuotGuiXe luot = new LuotGuiXe("LX001");

        Thread.sleep(2000); // giả lập thời gian gửi xe
        luot.ghiNhanRa();

        double tongGio = luot.tinhTongThoiGian();
        System.out.println("Tổng thời gian: " + tongGio + " giờ");

        double tien = luot.tinhTien(bp);
        System.out.println("Tiền gửi xe: " + tien + "đ");

        luot.thanhToan("tiền mặt");
    }
}

