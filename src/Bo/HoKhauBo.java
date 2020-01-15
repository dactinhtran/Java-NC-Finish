package Bo;

import java.util.ArrayList;

import Bean.HoKhauBean;
import Dao.HoKhauDao;


public class HoKhauBo {
HoKhauDao dao = new HoKhauDao();
	
	public int sua (String hoKhauID, String tinhTP, String quanHuyen , String phuongXa, String toThon, String chuHoID) throws Exception {
		return dao.sua(hoKhauID, tinhTP, quanHuyen, phuongXa, toThon, chuHoID);
	}
	
	public ArrayList<HoKhauBean> getHoKhau() throws Exception {
		return dao.getHoKhau();
	}
	
	public HoKhauBean getHoKhauID (String key) throws Exception {	
		return dao.getHoKhauID(key);
	}
}
