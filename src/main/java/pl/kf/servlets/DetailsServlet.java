package pl.kf.servlets;

import pl.kf.model.Car;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        List<Car> cars = (List<Car>) req.getSession().getAttribute("cars");

        Car selectedCar = Car.findCar(cars, id);

        req.getSession().setAttribute("selectedCar", selectedCar);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("details.jsp");
        requestDispatcher.forward(req, resp);
    }
}
