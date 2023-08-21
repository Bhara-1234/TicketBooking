<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,example.Calculation,example.Ticket,example.Passenger,example.Passengers" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Booking Details</title>
    <style>
    tr.border-top {
            border-top: 1px solid black;
        }
        
        tr.border-bottom {
            border-bottom: 1px solid black;
        }
        
        /* Apply border to specific columns */
        td.border-left {
            border-left: 1px solid black;
        }
        
        td.border-right {
            border-right: 1px solid black;
        }
        .center {
            text-align: center;
        }
        table {
            width: 100%;
            border:none;
        }
        th, td {
           
            padding: 5px;
            text-align: center;
        }
        th.column1, td.column1 {
            width: 150px;
        }
    </style>
</head>
<body>
    <h1 class="center" style="color: green;">Your tickets are successfully booked</h1><br><br><br>
    <h2 align="center">TicketDetails</h2>
    <table>
        <tr>
            <th>FROM</th>
            <th>Date</th>
            <th>TO</th>
        </tr>
        <tr>
            <td><%=((Ticket) request.getAttribute("ticket")).getFrom()%></td>
            <td><%=((Ticket) request.getAttribute("ticket")).getDate()%></td>
            <td><%=((Ticket) request.getAttribute("ticket")).getTo()%></td>
        </tr>
    </table>
    <br><br>
    <table>
        <tr>
            <th>PNR number</th>
            <th>Train Name</th>
            <th>CLASS</th>
        </tr>
        <tr>
            <td><%=((int) request.getAttribute("pnr"))%></td>
            <td><%=((Ticket) request.getAttribute("ticket")).getTrain()%></td>
            <td><%=((Ticket) request.getAttribute("ticket")).getClas()%></td>
        </tr>
    </table>
    
    <br><br>
    
    <h2 class="center">Passenger Details:</h2>
    <br>
    
    <table>
        <tr>
            <th>slno</th>
            <th>PassengerName</th>
            <th>Gender</th>
            <th>Age</th>
            <th>Berth</th>
        </tr>
        <%
        List<Passenger> pass = (List<Passenger>)request.getAttribute("passengers");
                                        if (pass != null) {
                                            for (Passenger p : pass) {
        %>
        <tr>
            <td><%= p.getSlno() %></td>
            <td><%= p.getName() %></td>
            <td><%= p.getGender() %></td>
            <td><%= p.getAge() %></td>
            <td><%= p.getBerth() %></td>
        </tr>
        <% }
        } %>
    </table><br>
    <div align="center"><h3>Total Fare :<%=(double)request.getAttribute("fare") %></h3></div>
</body>
</html>