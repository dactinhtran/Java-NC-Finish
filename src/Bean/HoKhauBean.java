package Bean;

public class HoKhauBean {
	private String hoKhauID;
	private String tinhTP;
	private String quanHuyen;
	private String phuongXa;
	private String toThon;
	private String chuHoID;
	
	
	public HoKhauBean() {
		super();
	}

	public HoKhauBean(String hoKhauID, String tinhTP, String quanHuyen, String phuongXa, String toThon,
			String chuHoID) {
		super();
		this.hoKhauID = hoKhauID;
		this.tinhTP = tinhTP;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.toThon = toThon;
		this.chuHoID = chuHoID;
	}

	public String getHoKhauID() {
		return hoKhauID;
	}

	public void setHoKhauID(String hoKhauID) {
		this.hoKhauID = hoKhauID;
	}

	public String getTinhTP() {
		return tinhTP;
	}

	public void setTinhTP(String tinhTP) {
		this.tinhTP = tinhTP;
	}

	public String getQuanHuyen() {
		return quanHuyen;
	}

	public void setQuanHuyen(String quanHuyen) {
		this.quanHuyen = quanHuyen;
	}

	public String getPhuongXa() {
		return phuongXa;
	}

	public void setPhuongXa(String phuongXa) {
		this.phuongXa = phuongXa;
	}

	public String getToThon() {
		return toThon;
	}

	public void setToThon(String toThon) {
		this.toThon = toThon;
	}

	public String getChuHoID() {
		return chuHoID;
	}

	public void setChuHoID(String chuHoID) {
		this.chuHoID = chuHoID;
	}
	
	
}
