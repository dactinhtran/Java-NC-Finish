package Bean;

public class MonHocBean {
	private String maMH;
	private String tenMH;
	private int soTinChi;
	private int soBuoi;
	private int soSVToiThieu;
	private int soSVToiDa;
	private int soSVDangKy;
	private String ngayNhapHoc;
	private String ngayHetHan;
	
	public MonHocBean() {
		super();
	}

	public MonHocBean(String maMH, String tenMH, int soTinChi, int soBuoi, int soSVToiThieu, int soSVToiDa,
			int soSVDangKy, String ngayNhapHoc, String ngayHetHan) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.soTinChi = soTinChi;
		this.soBuoi = soBuoi;
		this.soSVToiThieu = soSVToiThieu;
		this.soSVToiDa = soSVToiDa;
		this.soSVDangKy = soSVDangKy;
		this.ngayNhapHoc = ngayNhapHoc;
		this.ngayHetHan = ngayHetHan;
	}

	public String getMaMH() {
		return maMH;
	}

	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public int getSoSVToiThieu() {
		return soSVToiThieu;
	}

	public void setSoSVToiThieu(int soSVToiThieu) {
		this.soSVToiThieu = soSVToiThieu;
	}

	public int getSoSVToiDa() {
		return soSVToiDa;
	}

	public void setSoSVToiDa(int soSVToiDa) {
		this.soSVToiDa = soSVToiDa;
	}

	public int getSoSVDangKy() {
		return soSVDangKy;
	}

	public void setSoSVDangKy(int soSVDangKy) {
		this.soSVDangKy = soSVDangKy;
	}

	public String getNgayNhapHoc() {
		return ngayNhapHoc;
	}

	public void setNgayNhapHoc(String ngayNhapHoc) {
		this.ngayNhapHoc = ngayNhapHoc;
	}

	public String getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	
	
}	
