<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
<body>
	<!--   Hello ${name} -->
	<% 
	// for(String item : items){
	//	System.out.println(item);
	//}
	%>
	<div>
      <table border="1">
        <tr>
          <th>First Name</th>
          <!-- <th>Last Name</th> -->
        </tr>
        <c:forEach items="${empSchedTaskInfos}" var ="schedinfo"> <!-- accountInfos is the attribute from the MainController.java -->
        <tr>
          <td>${schedinfo.taskName}</td>
          <!-- <td>${person.lastName}</td> -->
        </tr>
        </c:forEach>
      </table>
    </div>
</body>
</html>