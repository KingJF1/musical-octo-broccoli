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
			<s:optiontransferselect
			label="Favourite Cartoons Characters" 
			name="leftSides" 
			leftTitle="Left Title" 
			rightTitle="Ritle Title"
			list="{'People','He-Man','Spiderman'}"
			multiple="true"
			headerKey="headerKey"
			headerValue="--- Please Select ---"
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