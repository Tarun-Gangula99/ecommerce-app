<%@ page import="java.util.*" %>

<html>
<body>

<h2>Your Cart</h2>

<%
List<String> cart = (List<String>) request.getAttribute("cart");

if(cart != null){
    for(String item : cart){
%>

<p><%= item %></p>

<% } } %>

<br>
<a href="products">Back to Products</a>

</body>
</html>
