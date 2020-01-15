package Bo;

import java.util.ArrayList;

import Bean.MonHocBean;
import Dao.MonHocDao;


public class MonHocBo {
	MonHocDao dao = new MonHocDao();
	
	public int them (String maMH, String tenMH, int soTinChi, int soBuoi, int soSVToiThieu,int SoSVToiDa, int soSVDangKy,String ngayNhapHoc, String ngayHetHan) throws Exception {
		return dao.them(maMH, tenMH, soTinChi, soBuoi, soSVToiThieu, SoSVToiDa, soSVDangKy, ngayNhapHoc, ngayHetHan);
	}
	
	public int sua(String maMH, String tenMH, int soTinChi, int soBuoi, int soSVToiThieu,int SoSVToiDa, int soSVDangKy,String ngayNhapHoc, String ngayHetHan) throws Exception{
		return dao.sua(maMH, tenMH, soTinChi, soBuoi, soSVToiThieu, SoSVToiDa, soSVDangKy, ngayNhapHoc, ngayHetHan);
	}
	public ArrayList<MonHocBean> getMonHoc() throws Exception {
		return dao.getMonHoc();
	}
	public MonHocBean getMonHocByMa (String key) throws Exception {	
		return dao.getMonHocByMa(key);
	}
	
	public int xoa (String maMH) throws Exception {
		return dao.xoa(maMH);
	}
}

