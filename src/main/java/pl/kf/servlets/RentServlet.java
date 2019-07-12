package pl.kf.servlets;

import pl.kf.database.CarDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));

        CarDAO.getInstance().rentCar(id);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("rented.jsp");
        requestDispatcher.forward(req, resp);
    }
}
