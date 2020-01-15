package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Bean.ChiTietMonHoc;
import Bean.MonHocBean;

public class ChiTietMonHocDao {
	DungChung dc = new DungChung();
	public ArrayList<ChiTietMonHoc> getChiTiet() throws Exception {
		ArrayList<ChiTietMonHoc> ds = new ArrayList<ChiTietMonHoc>();	
		dc.KetNoi();
		String sql = "SELECT * FROM SUMTINCHI ORDER BY SoTinChi DESC  ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String maSV = rs.getString("MaSV");
			String tenSV = rs.getString("HoTen");
			String ngaySinh = rs.getString("NgaySinh");
			String gioiTinh = rs.getString("GioiTinh");
			String diaChi = rs.getString("DiaChi");
			String lop = rs.getString("Lop");
			String email = rs.getString("Email");
			String soDienThoai = rs.getString("SoDienThoai");
			int soTinChi = rs.getInt("SoTinChi");
			ChiTietMonHoc bean = new ChiTietMonHoc(maSV, tenSV, ngaySinh, gioiTinh, diaChi, lop, email, soDienThoai, soTinChi);
			ds.add(bean);
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
}
