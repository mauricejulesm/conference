<%--
  Created by IntelliJ IDEA.
  User: Maurice
  Date: 2020-04-21
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration page</h1>
    <form:form modelAttribute="registration">
        <table>
            <tr>
                <td><spring:message code="name"/> </td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td ></td>
                <td><input type="submit" value="Add Registration"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
