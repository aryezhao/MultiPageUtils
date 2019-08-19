<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/19
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<center>
    <table width="200" border="1">
        <%--private Integer id;--%>
        <%--private String name;--%>
        <%--private String pwd;--%>
        <%--private String image;--%>
        <%--private MultipartFile file;--%>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">姓名</th>
            <th scope="col">性别</th>
            <th scope="col">城市</th>
        </tr>
        <c:forEach items="${pageInfo.list}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.pwd}</td>
                <td>${user.image}</td>
            </tr>
        </c:forEach>
    </table>
    <p>当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
        页,总 ${pageInfo.total } 条记录</div></p>
    <a href="list.do?pageNo=${pageInfo.firstPage}">第一页</a>
    <c:if test="${pageInfo.hasPreviousPage }">
        <a href="list.do?pageNo=${pageInfo.pageNum-1}">上一页</a>
    </c:if>

    <c:if test="${pageInfo.hasNextPage }">
        <a href="list.do?pageNo=${pageInfo.pageNum+1}">下一页</a>
    </c:if>

    <a href="list.do?pageNo=${pageInfo.lastPage}">最后页</a>
</center>
</body>
</html>
