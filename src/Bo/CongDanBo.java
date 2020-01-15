package Bo;

import java.util.ArrayList;

import Bean.CongDanBean;
import Dao.CongDanDao;


public class CongDanBo {
	CongDanDao dao = new CongDanDao();
	
	public int them (String cmndID, String ten, String ho, String ngaySinh, String gioiTinh, String noiSinh, String ttHonNhan, String ngheNghiep) throws Exception {
		return dao.them(cmndID, ten, ho, ngaySinh, gioiTinh, noiSinh, ttHonNhan, ngheNghiep);
	}
	
	public ArrayList<CongDanBean> getCongDan() throws Exception {
		return dao.getCongDan();
	}
}
