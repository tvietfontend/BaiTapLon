import java.time.Duration;
import java.time.LocalDateTime;

public class LuotGuiXe {
    private String maLuotGui;
    private LocalDateTime thoiGianVao;
    private LocalDateTime thoiGianRa;
    private double tongTien;
    private String trangThaiThanhToan;

    public LuotGuiXe(String maLuotGui) {
        this.maLuotGui = maLuotGui;
        this.thoiGianVao = LocalDateTime.now();
        this.trangThaiThanhToan = "Chưa thanh toán";
    }

    public void ghiNhanRa() {
        this.thoiGianRa = LocalDateTime.now();
    }

    public double tinhTongThoiGian() {
        if (thoiGianRa == null) {
            System.out.println("Xe chưa ra, không thể tính thời gian!");
            return 0;
        }
        Duration duration = Duration.between(thoiGianVao, thoiGianRa);
        return duration.toMinutes() / 60.0;
    }


    public double tinhTien(BieuPhi bieuPhi) {
        if (thoiGianRa == null) {
            System.out.println("Chưa ghi nhận thời gian ra!");
            return 0;
        }
        double soGio = tinhTongThoiGian();
        tongTien = bieuPhi.tinhTienTheoGio(soGio);
        return tongTien;
    }

    public void thanhToan(String hinhThuc) {
        if (tongTien <= 0) {
            System.out.println("Chưa tính tiền hoặc không có phí cần thanh toán!");
            return;
        }
        trangThaiThanhToan = "Đã thanh toán bằng " + hinhThuc;
        System.out.println("Thanh toán thành công (" + hinhThuc + "), số tiền: " + tongTien);
    }

    // Getter (tuỳ chọn)
    public String getMaLuotGui() {
        return maLuotGui;
    }

    public String getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public double getTongTien() {
        return tongTien;
    }
}
