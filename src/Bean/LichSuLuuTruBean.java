package Bean;

public class LichSuLuuTruBean {
	private String cmndID;
	private String hoKhauID;
	private String loaiLuuTruID;
	private String thoiGianBatDau;
	private String thoiGianKetThuc;
	private String quanHeVoiChuHo;
	
	public LichSuLuuTruBean() {
		super();
	}
	
	public LichSuLuuTruBean(String cmndID, String hoKhauID, String loaiLuuTruID, String thoiGianBatDau,
			String thoiGianKetThuc, String quanHeVoiChuHo) {
		super();
		this.cmndID = cmndID;
		this.hoKhauID = hoKhauID;
		this.loaiLuuTruID = loaiLuuTruID;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.quanHeVoiChuHo = quanHeVoiChuHo;
	}

	public String getCmndID() {
		return cmndID;
	}

	public void setCmndID(String cmndID) {
		this.cmndID = cmndID;
	}

	public String getHoKhauID() {
		return hoKhauID;
	}

	public void setHoKhauID(String hoKhauID) {
		this.hoKhauID = hoKhauID;
	}

	public String getLoaiLuuTruID() {
		return loaiLuuTruID;
	}

	public void setLoaiLuuTruID(String loaiLuuTruID) {
		this.loaiLuuTruID = loaiLuuTruID;
	}

	public String getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(String thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public String getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(String thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getQuanHeVoiChuHo() {
		return quanHeVoiChuHo;
	}

	public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
		this.quanHeVoiChuHo = quanHeVoiChuHo;
	}
	
	
}
