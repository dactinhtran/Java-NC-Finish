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

import Bo.MonHocBo;

/**
 * Servlet implementation class MonHocController
 */
@WebServlet("/MonHocController")
public class MonHocController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonHocController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    MonHocBo bo = new MonHocBo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			String maMH = request.getParameter("maMH");
			String tenMH = request.getParameter("tenMH");
			String soTinChi = request.getParameter("soTinChi");
			String soBuoi = request.getParameter("soBuoi");
			String soSVToiThieu = request.getParameter("soSVToiThieu");
			String soSVToiDa = request.getParameter("soSVToiDa");
			String soSVDangKy = request.getParameter("soSVDangKy");
			String ngayNhapHoc = request.getParameter("ngayNhapHoc");
			String ngayHetHan = request.getParameter("ngayHetHan");
			
			//add
			if(request.getParameter("btnAdd")!=null) {
				RequestDispatcher rd = request.getRequestDispatcher("addMonHoc.jsp");
				rd.forward(request, response);
			}
			
			if (request.getParameter("add")!=null) {
					int n = bo.them(maMH, tenMH, Integer.parseInt(soTinChi), Integer.parseInt(soBuoi), Integer.parseInt(soSVToiThieu), 
							Integer.parseInt(soSVToiDa), Integer.parseInt(soSVDangKy), ngayNhapHoc, ngayHetHan);
					if (n==0) request.setAttribute("kqThem", 0);			
			}
			
			
			//edit
			if (request.getParameter("editMonHoc")!=null) {
				bo.sua(maMH, tenMH, Integer.parseInt(soTinChi), Integer.parseInt(soBuoi), Integer.parseInt(soSVToiThieu), 
							Integer.parseInt(soSVToiDa), Integer.parseInt(soSVDangKy), ngayNhapHoc, ngayHetHan);
			}
			
			if (request.getParameter("monHocChon")!=null) {
				request.setAttribute("monHocChon", bo.getMonHocByMa(request.getParameter("monHocChon")));
				request.setAttribute("dsMonHoc", bo.getMonHoc());
				RequestDispatcher rd = request.getRequestDispatcher("editMonHoc.jsp");
				rd.forward(request, response);
			}
			
			//xoa
			if (request.getParameter("maMHXoa") != null) {
				int n = bo.xoa(request.getParameter("maMHXoa"));
				if (n==0) request.setAttribute("kqXoa", 0);
			}
			
			request.setAttribute("dsMonHoc", bo.getMonHoc());
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
