<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<s:form action="user">
			<s:select
			label="Months" 
			name="months" 
			list="{'01':'Jan','02':'Feb'}"
			headerKey="-1"
			headerValue="Select Month"
			emptyOption="true"
			doubleList="{'Superman','Mickey Mouse','Donald Duck'}"
			doubleName="rightSides"
			doubleHeaderKey="doubleHeaderKey"
			doubleHeaderValue="--- Please Select ---"
			doubleEmptyOption="true"
			doubleMultiple="true"/>
			<s:submit/>
		</s:form>	
	</center>
</body>
</html>