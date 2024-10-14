<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Booking Confirmation</title>
</head>
<body>
    <div class="container">
        <h1>Booking Confirmation</h1>
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String tickets = request.getParameter("tickets");

            if (name != null && email != null && tickets != null) {
                out.println("<p>Thank you, " + name + "!</p>");
                out.println("<p>Your tickets have been booked successfully.</p>");
                out.println("<p>Email: " + email + "</p>");
                out.println("<p>Number of Tickets: " + tickets + "</p>");
            } else {
                out.println("<p>Error in booking tickets. Please try again.</p>");
            }
        %>
    </div>
</body>
</html>
 