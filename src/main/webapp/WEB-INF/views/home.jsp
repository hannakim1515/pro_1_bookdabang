<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="userHeader.jsp"></jsp:include>
		<div> 확인 : The time on the server is ${serverTime}. </div>
	<jsp:include page="userFooter.jsp"></jsp:include>
</body>
</html>