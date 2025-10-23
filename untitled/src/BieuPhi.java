public class BieuPhi {
    private double giaGioDau;
    private double giaMoiGioTiepTheo;

    public BieuPhi(double giaGioDau, double giaMoiGioTiepTheo) {
        this.giaGioDau = giaGioDau;
        this.giaMoiGioTiepTheo = giaMoiGioTiepTheo;
    }

    public double tinhTienTheoGio(double soGio) {
        if (soGio <= 1) return giaGioDau;
        return giaGioDau + Math.ceil(soGio - 1) * giaMoiGioTiepTheo;
    }
}

