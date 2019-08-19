<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/6
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>注册成功</title>
</head>
<body>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">客户信息列表</div>
            <!-- /.panel-heading -->
            <table class="table table-bordered table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>客户名称</th>
                    <th>客户来源</th>
                    <th>客户所属行业</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${page}" var="row">
                    <tr>
                        <td>${row.id}</td>
                        <td>${row.name}</td>
                        <td>${row.pwd}</td>
                        <td>${row.image}</td>
                        <td>${row.file}</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${row.id})">修改</a>
                            <a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.id})">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <%--<a href="${pageContext.request.contextPath }/row.do">下一页</a>--%>
            <%--<div class="col-md-12 text-right">--%>
                <%--<itcast:page url="${pageContext.request.contextPath }/row.do" />--%>
            <%--</div>--%>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
</div>
</table>
</body>
</html>
