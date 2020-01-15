package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Bean.LichSuLuuTruBean;


public class LichSuLuuTruDao {
	
	DungChung dc = new DungChung();
	public ArrayList<LichSuLuuTruBean> getLS() throws Exception {
		ArrayList<LichSuLuuTruBean> ds = new ArrayList<LichSuLuuTruBean>();		
		dc.KetNoi();
		String sql = "SELECT * FROM LichSuLuuTru ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String cmndID = rs.getString("CmndID");
			String hoKhauID = rs.getString("HoKhauID");
			String loaiLuuTruID = rs.getString("LoaiLuuTruID");
			String thoiGianBatDau = rs.getString("ThoiGianBatDauLT");
			String thoiGianKetThuc = rs.getString("ThoiGianKetThucLT");
			String quanHeVoiChuHo = rs.getString("QuanHeVoiChuHo");
			LichSuLuuTruBean bean = new LichSuLuuTruBean(cmndID, hoKhauID, loaiLuuTruID, thoiGianBatDau, thoiGianKetThuc, quanHeVoiChuHo);
			ds.add(bean);
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	public int xoa (String cmndID, String hoKhauID, String thoiGianBatDauLT) throws Exception {
		dc.KetNoi();
			String sql = "DELETE FROM LichSuLuuTru WHERE CmndID = ? and HoKhauID = ? and ThoiGianBatDauLT = ?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			cmd.setString(1, cmndID);
			cmd.setString(2, hoKhauID);
			cmd.setString(3, thoiGianBatDauLT);
			int kq = cmd.executeUpdate();
			dc.cn.close();
			return kq;
	}
}
