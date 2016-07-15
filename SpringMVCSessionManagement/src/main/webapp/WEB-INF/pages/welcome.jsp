<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script type="text/javascript">
	var start = new Date;

	setInterval(function() {
		$('.Timer').text(Math.round((new Date - start) / 1000) + " Seconds");
	}, 1000);
</script>
</head>
<body>
	Welcome
	<%=session.getAttribute("un")%>
	<a href="forward">Forward</a>
	<br /> Timer
	<div class="Timer"></div>
</body>
</html>