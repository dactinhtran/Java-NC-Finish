package Bo;

import java.util.ArrayList;

import Bean.ChiTietMonHoc;
import Dao.ChiTietMonHocDao;


public class ChiTietMonHocBo {
	ChiTietMonHocDao dao = new ChiTietMonHocDao();
	public ArrayList<ChiTietMonHoc> getChiTiet() throws Exception {
		return dao.getChiTiet();
	}
}
