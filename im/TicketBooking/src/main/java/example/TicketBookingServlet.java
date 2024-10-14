package example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class TicketBookingServlet extends HttpServlet {
    protected <String> void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String tickets = request.getParameter("tickets");

        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("tickets", tickets);
        
        request.getRequestDispatcher("booking.jsp").forward(request, response);
    }
}
