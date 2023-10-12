public class HamTinhTienXeImpl implements HamTinhTienXe {

    public static double HamTinhTienGrabCar(double soKm, double thoiGianCho) {
        double soTienCanTra = 0;
        if(soKm <= 1 && soKm > 0){
            soTienCanTra = soKm * 8000;
            if(thoiGianCho >= 3){
                soTienCanTra += thoiGianCho/3 * 2000;
            }
        }else if(soKm > 1 && soKm <= 19){
            soTienCanTra = 8000 + (soKm - 1)*7500;
            if(thoiGianCho >=3){
                soTienCanTra += thoiGianCho/3 * 2000;
            }
        }else {
            soTienCanTra = 8000 + (19 * 7500) + (soKm -19)*7000;
            if(thoiGianCho >=3){
                soTienCanTra += thoiGianCho/3 * 2000;
            }
        }
        return soTienCanTra;
    }

    public static double HamTinhTienGrabSUV(double soKm, double thoiGianCho) {
        double soTienCanTra = 0;
        if(soKm <= 1 && soKm > 0){
            soTienCanTra = soKm * 9000;
            if(thoiGianCho >= 3){
                soTienCanTra += thoiGianCho/3 * 3000;
            }
        }else if(soKm > 1 && soKm <= 19){
            soTienCanTra = 8000 + (soKm - 1)*8500;
            if(thoiGianCho >=3){
                soTienCanTra += thoiGianCho/3 * 3000;
            }
        }else {
            soTienCanTra = 9000 + (19 * 8500) + (soKm -19)*8000;
            if(thoiGianCho >=3){
                soTienCanTra += thoiGianCho/3 * 3000;
            }
        }
        return soTienCanTra;
    }

    public static double HamTinhTienGrabBlack(double soKm, double thoiGianCho) {
        double soTienCanTra = 0;
        if(soKm <= 1 && soKm > 0){
            soTienCanTra = soKm * 10000;
            if(thoiGianCho >= 3){
                soTienCanTra += thoiGianCho/3 * 3500;
            }
        }else if(soKm > 1 && soKm <= 19){
            soTienCanTra = 10000 + (soKm - 1)*9500;
            if(thoiGianCho >=3){
                soTienCanTra += thoiGianCho/3 * 3500;
            }
        }else {
            soTienCanTra = 10000 + (19 * 9500) + (soKm -19)*9000;
            if(thoiGianCho >=3){
                soTienCanTra += thoiGianCho/3 * 3500;
            }
        }
        return soTienCanTra;
    }
}
