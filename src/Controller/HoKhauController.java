package Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bo.HoKhauBo;

/**
 * Servlet implementation class HoKhauController
 */
@WebServlet("/HoKhauController")
public class HoKhauController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoKhauController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    HoKhauBo bo = new HoKhauBo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			String hoKhauID = request.getParameter("hoKhauID");
			String tinhTP = request.getParameter("tinhTP");
			String quanHuyen = request.getParameter("quanHuyen");
			String phuongXa = request.getParameter("phuongXa");
			String toThon = request.getParameter("toThon");
			String chuHoID = request.getParameter("chuHoID");
			
			
			if (request.getParameter("editHoKhau")!=null) {
				bo.sua(hoKhauID, tinhTP, quanHuyen, phuongXa, toThon, chuHoID);
			}
			
			if (request.getParameter("maLoaiChon")!=null) {
				request.setAttribute("hoKhauChon", bo.getHoKhauID(request.getParameter("maLoaiChon")));
				request.setAttribute("dsHoKhau", bo.getHoKhau());
				RequestDispatcher rd = request.getRequestDispatcher("EditHoKhau.jsp");
				rd.forward(request, response);
			}
//			
//			if (request.getParameter("maLoaiXoa")!=null) {
//				int n = bo.xoa(request.getParameter("maLoaiXoa"));
//				if (n==0) request.setAttribute("kqXoa", 0);
//			}
			request.setAttribute("dsHoKhau", bo.getHoKhau());
			RequestDispatcher rd = request.getRequestDispatcher("HoKhau.jsp");
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
