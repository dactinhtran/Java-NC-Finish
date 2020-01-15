package Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import Bo.CongDanBo;
import Dao.CongDanDao;

/**
 * Servlet implementation class CongDanController
 */
@WebServlet("/CongDanController")
public class CongDanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CongDanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    CongDanBo bo = new CongDanBo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			String cmndID = request.getParameter("cmndID");
			String ten = request.getParameter("ten");
			String ho = request.getParameter("ho");
			String ngaySinh = request.getParameter("ngaySinh");
			String gioiTinh = request.getParameter("gioiTinh");
			String noiSinh = request.getParameter("noiSinh");
			String ttHonNhan = request.getParameter("ttHonNhan");
			String ngheNghiep = request.getParameter("ngheNghiep");
			
			if(request.getParameter("btnAdd")!=null) {
				RequestDispatcher rd = request.getRequestDispatcher("addCongDan.jsp");
				rd.forward(request, response);
			}
			
//			if (request.getParameter("add")!=null) {
//				SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy");
//				Date d1 = df.parse(ngaySinh);
//				if(d1.compareTo(new Date()) < 0) {
//					int n = bo.them(cmndID, ten, ho, ngaySinh, gioiTinh, noiSinh, ttHonNhan, ngheNghiep);
//					if (n==0) request.setAttribute("kqThem", 0);
//				}				
//			}
			
			
			int saingay =0;
			DateFormat df = new SimpleDateFormat("mm-dd-yyyy");
			df.setLenient(false);
			try {
				Date ngayHienTai = new Date();
				Date ns = df.parse(ngaySinh) ;
				if(ns.compareTo(ngayHienTai)>0)
					saingay = 1;
			}catch (Exception e) {
				// TODO: handle exception
				saingay=1;
			}
			
			System.out.println(saingay);
			if (request.getParameter("add")!=null) {
				if(saingay != 1) {
					int n = bo.them(cmndID, ten, ho, ngaySinh, gioiTinh, noiSinh, ttHonNhan, ngheNghiep);
					if (n==0) request.setAttribute("kqThem", 0);
				}				
			}
			
			request.setAttribute("dsCongDan", bo.getCongDan());
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**		
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
