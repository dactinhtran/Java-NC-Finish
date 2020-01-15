package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Bean.ChiTietMonHoc;
import Bean.HoKhauBean;
import Bean.MonHocBean;


public class MonHocDao {
	DungChung dc = new DungChung();
	public ArrayList<MonHocBean> getMonHoc() throws Exception {
		ArrayList<MonHocBean> ds = new ArrayList<MonHocBean>();		
		dc.KetNoi();
		String sql = "SELECT * FROM MONHOC ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String maMH = rs.getString("MaMH");
			String tenMH = rs.getString("TenMH");
			int soTinChi = rs.getInt("SoTinChi");
			int soBuoi = rs.getInt("SoBuoi");
			int soSVToiThieu = rs.getInt("SoSVToiThieu");
			int soSVToiDa = rs.getInt("SoSVToiDa");
			int soSVDangKy = rs.getInt("SoSVDangKy");
			String ngayNhapHoc = rs.getString("NgayNhapHoc");
			String ngayHetHan = rs.getString("NgayHetHan");
			MonHocBean bean = new MonHocBean(maMH, tenMH, soTinChi, soBuoi, soSVToiThieu, soSVToiDa, soSVDangKy, ngayNhapHoc, ngayHetHan);
			ds.add(bean);
		}
		rs.close();
		dc.cn.close();
		return ds;
	}	
	
	public MonHocBean getMonHocByMa (String key) throws Exception {	
		dc.KetNoi();
		String sql = "SELECT * FROM MONHOC WHERE MaMH = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, key);
		ResultSet rs = cmd.executeQuery();
		MonHocBean bean = null;
		if (rs.next()) {
			String maMH = rs.getString("MaMH");
			String tenMH = rs.getString("TenMH");
			int soTinChi = rs.getInt("SoTinChi");
			int soBuoi = rs.getInt("SoBuoi");
			int soSVToiThieu = rs.getInt("SoSVToiThieu");
			int soSVToiDa = rs.getInt("SoSVToiDa");
			int soSVDangKy = rs.getInt("SoSVDangKy");
			String ngayNhapHoc = rs.getString("NgayNhapHoc");
			String ngayHetHan = rs.getString("NgayHetHan");
			bean = new MonHocBean(maMH, tenMH, soTinChi, soBuoi, soSVToiThieu, soSVToiDa, soSVDangKy, ngayNhapHoc, ngayHetHan);
		}
		rs.close();
		dc.cn.close();
		return bean;
	}
	
	public boolean trungMa (String maMH) throws Exception {
		String sql = "SELECT MaMH FROM MONHOC WHERE MaMH = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maMH);
		ResultSet rs = cmd.executeQuery();
		boolean kq = rs.next();
		rs.close();
		return kq;
	}
	
	public boolean kiemTraXoa (String maMH) throws Exception {
		String sql = "SELECT MaMH FROM DangKy WHERE MaMH = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maMH);
		ResultSet rs = cmd.executeQuery();
		boolean kq = rs.next();
		rs.close();
		return kq;
	}
	
	
	public int them(String maMH, String tenMH, int soTinChi, int soBuoi, int soSVToiThieu,int SoSVToiDa, int soSVDangKy,String ngayNhapHoc, String ngayHetHan) throws Exception {
		dc.KetNoi();
		if(trungMa(maMH) == false) {
			String sql = "INSERT INTO MONHOC values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			cmd.setString(1,maMH);
			cmd.setString(2,tenMH);
			cmd.setInt(3,soTinChi);
			cmd.setInt(4,soBuoi);
			cmd.setInt(5,soSVToiThieu);
			cmd.setInt(6,SoSVToiDa);
			cmd.setInt(7,soSVDangKy);
			cmd.setDate(8, java.sql.Date.valueOf(ngayNhapHoc));
			cmd.setDate(9, java.sql.Date.valueOf(ngayHetHan));
			int kq = cmd.executeUpdate();
			dc.cn.close();
			return kq;
		}
		else return 0;
	}
	
	public int sua (String maMH, String tenMH, int soTinChi, int soBuoi, int soSVToiThieu,int SoSVToiDa, int soSVDangKy,String ngayNhapHoc, String ngayHetHan) throws Exception {
		dc.KetNoi();
		String sql = "UPDATE MONHOC SET TenMH=?, soTinChi=?, SoBuoi=?, soSVToiThieu=?, soSVToiDa=?, SoSVDangKy=?,NgayNhapHoc=?,NgayHetHan=? where MaMH=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, tenMH);
		cmd.setInt(2, soTinChi);
		cmd.setInt(3, soBuoi);
		cmd.setInt(4, soSVToiThieu);
		cmd.setInt(5, SoSVToiDa);
		cmd.setInt(6, soSVDangKy);
		cmd.setDate(7, java.sql.Date.valueOf(ngayNhapHoc));
		cmd.setDate(8, java.sql.Date.valueOf(ngayHetHan));
		cmd.setString(9, maMH);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}
	
	public int xoa (String maMH) throws Exception {
		dc.KetNoi();
		if (kiemTraXoa(maMH)==false) {
			String sql = "DELETE FROM MONHOC WHERE MaMH=?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			cmd.setString(1, maMH);
			int kq = cmd.executeUpdate();
			dc.cn.close();
			return kq;
			}
		else return 0;
	}
	

}	
