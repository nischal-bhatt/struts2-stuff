<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="testAction">
	<s:textfield name="firstName" label="Your Name"></s:textfield>
	<s:submit value="Submit"></s:submit>
</s:form>

<s:form action="anotherAction">
	<s:textfield name="nameOfPerson" label="Your Name"></s:textfield>
	<s:radio name="gender" list="{'male','female','others'}" label = "Gender"/>
	<s:submit value="Submit"></s:submit>
</s:form>

</body>
</html>