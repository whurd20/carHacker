<%@include file="head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= request.getAttribute("vehicle") %>
<p>Hello World! ${vehicle}</p>
<p>Your password is: ${user.password}</p>

</body>
</html>
