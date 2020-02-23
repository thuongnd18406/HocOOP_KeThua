package dangthuongngo.com.test;

import dangthuongngo.com.model.NhanVienChinhThuc;
import dangthuongngo.com.model.NhanVienThoiVu;

public class TestNhanVien {
	public static void main(String[] args) {
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1, "Văn Tèo");
		NhanVienThoiVu ti= new NhanVienThoiVu(2,"Tràn thì tí");
		
		teo.tinhLuong();
		ti.tinhLuong();
	}
}
