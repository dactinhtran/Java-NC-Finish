package Bo;

import java.util.ArrayList;

import Bean.LichSuLuuTruBean;
import Dao.LichSuLuuTruDao;


public class LichSuLuuTruBo {
LichSuLuuTruDao dao = new LichSuLuuTruDao();
	
	ArrayList<LichSuLuuTruBean> ds;
	public ArrayList<LichSuLuuTruBean> getLS() throws Exception {
		ds= dao.getLS();
		return ds;
	}
	
	public int xoa (String cmndID, String hoKhauID, String thoiGianBatDauLT) throws Exception {
		return dao.xoa(cmndID, hoKhauID, thoiGianBatDauLT);
	}
	
	public ArrayList<LichSuLuuTruBean> timKiem(String key) throws Exception {
		ArrayList<LichSuLuuTruBean> tam = new ArrayList<LichSuLuuTruBean>();
		for (LichSuLuuTruBean s : ds) {
			if (s.getCmndID().trim().toLowerCase().contains(key.trim().toLowerCase()))
				tam.add(s);
		}
		return tam;
	}
}
