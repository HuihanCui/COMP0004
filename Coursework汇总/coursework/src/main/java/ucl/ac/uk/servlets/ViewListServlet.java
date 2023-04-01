package ucl.ac.uk.servlets;

import ucl.ac.uk.things.Model;
import ucl.ac.uk.things.ModelFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MainList.html")
public class ViewListServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        Model m = ModelFactory.getModel();
        request.setAttribute("mainList", m.getHashMap().get(0));

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/MainView.jsp");
        dispatch.forward(request, response);
    }
}
