package carhacker.controller;

import carhacker.entity.UserPass;
import carhacker.entity.Vehicle;
import carhacker.persistence.UserPassDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.net.URL;

@WebServlet(
        name = "VehicleServlet",
        urlPatterns = { "/vehicle" }
)

public class SearchVIN extends HttpServlet {
    private URL urlResult;
    private Vehicle vehicle;
    private final Logger logger = LogManager.getLogger(this.getClass());



    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //urlResult = NetworkUtils.generateURL();
        //vehicle = NetworkUtils.parseJSONBooks(urlResult);

        logger.info("Log 4 j is working!");
        //logger.error("Some message you want logged", e);
        UserPassDao dao = new UserPassDao();
        UserPass selectedUserPass = dao.getById(1);
        request.setAttribute("userPass", selectedUserPass);
        request.setAttribute("method", "GET");
        request.setAttribute("vehicle", "Your car");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/output.jsp");
        dispatcher.forward(request, response);
    }
}
