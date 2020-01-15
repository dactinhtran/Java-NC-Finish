package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import Bean.CongDanBean;

public class CongDanDao {
	DungChung dc = new DungChung();
	public ArrayList<CongDanBean> getCongDan() throws Exception {
		ArrayList<CongDanBean> ds = new ArrayList<CongDanBean>();		
		dc.KetNoi();
		String sql = "SELECT * FROM CONGDAN ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String cmndID = rs.getString("CmndID");
			String ten = rs.getString("Ten");
			String ho = rs.getString("Ho");
			String ngaySinh = rs.getString("NgaySinh");
			String gioiTinh = rs.getString("GioiTinh");
			String noiSinh = rs.getString("NoiSinh");
			String ttHonNhan = rs.getString("TTHonNhan");
			String ngheNghiep = rs.getString("NgheNghiep");
			CongDanBean bean = new CongDanBean(cmndID, ten, ho, ngaySinh, gioiTinh, noiSinh, ttHonNhan, ngheNghiep);
			ds.add(bean);
		}
		rs.close();
		dc.cn.close();
		return ds;
	}	
	
	
	public int them(String cmndID, String ten, String ho, String ngaySinh, String gioiTinh, String noiSinh, String ttHonNhan, String ngheNghiep) throws Exception {
		dc.KetNoi();
		String sql = "INSERT INTO CONGDAN values (?,?,?,?,?,?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1,cmndID);
		cmd.setString(2,ten);
		cmd.setString(3,ho);
		cmd.setDate(4, java.sql.Date.valueOf(ngaySinh));
		cmd.setString(5, gioiTinh);
		cmd.setString(6, noiSinh);
		cmd.setString(7, ttHonNhan);
		cmd.setString(8, ngheNghiep);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}
}
