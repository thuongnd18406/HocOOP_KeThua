package dangthuongngo.com.model;

public class NhanVien {
	protected int ma;
	protected String ten;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void tinhLuong() {
		System.out.println("Nhân viên "+this.ten+" gọi tính lương");
	}

}
