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

import Bo.LichSuLuuTruBo;

/**
 * Servlet implementation class LichSuLuuTruController
 */
@WebServlet("/LichSuLuuTruController")
public class LichSuLuuTruController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LichSuLuuTruController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    LichSuLuuTruBo bo = new LichSuLuuTruBo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			String cmndID = request.getParameter("cmnd");
			String hoKhauID = request.getParameter("hokhau");
			String thoiGianBatDauLT = request.getParameter("thoigian");
			String key = request.getParameter("txtTimKiem");
			
			if (cmndID != null && hoKhauID != null && thoiGianBatDauLT !=null) {
				int n = bo.xoa(cmndID, hoKhauID, thoiGianBatDauLT);
				if (n==0) request.setAttribute("kqXoa", 0);
			}
			
			if(key!=null)
				request.setAttribute("dsLichSu", bo.timKiem(key));
			else 
				request.setAttribute("dsLichSu", bo.getLS());

			RequestDispatcher rd = request.getRequestDispatcher("LichSu.jsp");
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
