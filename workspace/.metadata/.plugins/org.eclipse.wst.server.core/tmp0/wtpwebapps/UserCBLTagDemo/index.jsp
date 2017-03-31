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
			<s:checkboxlist name="characters" list="#{'a':'1','b':'2','c':'3','d':'4'}" 
			label="choose a character:" labelposition="top" listKey="key" listValue="value"/>
			<s:checkboxlist label="Interest:" name="interests" list="{'football','basketball',
			'volleyball','swimming'}" labelposition="top"/>
			<s:submit/>
		</s:form>	
	</center>
</body>
</html>