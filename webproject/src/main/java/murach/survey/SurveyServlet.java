package murach.survey; // <-- đặt đúng y chang trong web.xml

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/survey") // khớp action="survey"
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // (nếu cần xử lý/validate thêm, setAttribute ở đây)
        RequestDispatcher rd = req.getRequestDispatcher("/thanks.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Cho nút Return GET về form
        RequestDispatcher rd = req.getRequestDispatcher("/index.html");
        rd.forward(req, resp);
    }
}
