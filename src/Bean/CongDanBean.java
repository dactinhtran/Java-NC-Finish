package Bean;

import java.util.Date;

public class CongDanBean {
	private String cmndID;
	private String ten;
	private String ho;
	private String ngaySinh;
	private String gioiTinh;
	private String noiSinh;
	private String ttHonNhan;
	private String ngheNghiep;
	
	
	public CongDanBean() {
		super();
	}

	public CongDanBean(String cmndID, String ten, String ho, String ngaySinh, String gioiTinh, String noiSinh,
			String ttHonNhan, String ngheNghiep) {
		super();
		this.cmndID = cmndID;
		this.ten = ten;
		this.ho = ho;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.noiSinh = noiSinh;
		this.ttHonNhan = ttHonNhan;
		this.ngheNghiep = ngheNghiep;
	}

	public String getCmndID() {
		return cmndID;
	}

	public void setCmndID(String cmndID) {
		this.cmndID = cmndID;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getTtHonNhan() {
		return ttHonNhan;
	}

	public void setTtHonNhan(String ttHonNhan) {
		this.ttHonNhan = ttHonNhan;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	
}
