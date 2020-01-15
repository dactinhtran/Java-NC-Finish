package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Bean.HoKhauBean;

public class HoKhauDao {
	
	DungChung dc = new DungChung();
	public ArrayList<HoKhauBean> getHoKhau() throws Exception {
		ArrayList<HoKhauBean> ds = new ArrayList<HoKhauBean>();		
		dc.KetNoi();
		String sql = "SELECT * FROM HOKHAU ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String hoKhauID = rs.getString("HoKhauID");
			String tinhTP = rs.getString("Tinh_TP");
			String quanHuyen = rs.getString("Quan_Huyen");
			String phuongXa = rs.getString("Phuong_Xa");
			String toThon = rs.getString("To_Thon");
			String chuHoID = rs.getString("ChuHoID");
			HoKhauBean bean = new HoKhauBean(hoKhauID, tinhTP, quanHuyen, phuongXa, toThon, chuHoID);
			ds.add(bean);
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	public HoKhauBean getHoKhauID (String key) throws Exception {	
		dc.KetNoi();
		String sql = "SELECT * FROM HOKHAU WHERE HoKhauID = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, key);
		ResultSet rs = cmd.executeQuery();
		HoKhauBean bean = null;
		if (rs.next()) {
			String hoKhauID = rs.getString("HoKhauID");
			String tinhTP = rs.getString("Tinh_TP");
			String quanHuyen = rs.getString("Quan_Huyen");
			String phuongXa = rs.getString("Phuong_Xa");
			String toThon = rs.getString("To_Thon");
			String chuHoID = rs.getString("ChuHoID");
			bean = new HoKhauBean(hoKhauID, tinhTP, quanHuyen, phuongXa, toThon, chuHoID);
		}
		rs.close();
		dc.cn.close();
		return bean;
	}
	
	public int sua (String hoKhauID, String tinhTP, String quanHuyen , String phuongXa, String toThon, String chuHoID) throws Exception {
		dc.KetNoi();
		String sql = "UPDATE HOKHAU SET Tinh_TP=?, Quan_Huyen=?, Phuong_Xa=?, To_Thon=?, ChuHoID=? where HoKhauID=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, tinhTP);
		cmd.setString(2, quanHuyen);
		cmd.setString(3, phuongXa);
		cmd.setString(4, toThon);
		cmd.setString(5, chuHoID);
		cmd.setString(6, hoKhauID);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}
}
