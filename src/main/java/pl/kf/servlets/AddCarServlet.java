package pl.kf.servlets;

import pl.kf.database.CarDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCarServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mark = req.getParameter("mark");
        String model = req.getParameter("model");
        Integer yearOfProduction = Integer.parseInt(req.getParameter("yearOfProduction"));
        String imageUrl = req.getParameter("imageUrl");

        CarDAO.getInstance().addNewCar(mark, model, yearOfProduction, imageUrl);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("added.jsp");
        requestDispatcher.forward(req, resp);
    }
}
