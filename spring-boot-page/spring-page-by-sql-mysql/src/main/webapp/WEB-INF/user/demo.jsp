<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
<div class="container">  
  
    <!--标题-->  
    <div class="row">  
        <div class="col-md-12">  
            <h1>SSM-CRUD</h1>  
        </div>  
  
    </div>  
  
    <!--按钮-->  
    <div class="row">  
        <div class="col-md-4 col-md-offset-8">  
            <button class="btn btn-primary">新增</button>  
            <button class="btn btn-danger">删除</button>  
        </div>  
    </div>  
  
    <!--显示表格数据-->  
    <div class="row">  
        <div class="col-md-12">  
            <table class="table table-hover">  
                <tr>  
                    <th>标题</th>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>密码</th>
                    <th>照片</th>
                    <th>操作</th>  
                </tr>  
  
  
                <c:forEach items="${pageInfo}" var="emp">
                    <tr>  
                        <th>数据</th>
                        <th>${emp.id}</th>
                        <th>${emp.name}</th>
                        <th>${emp.pwd}</th>
                        <th>${emp.image}</th>
                        <th>  
                            <button class="btn btn-primary">  
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>  
                                编辑  
                            </button>  
  
                            <button class="btn btn-danger">  
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>  
                                删除  
                            </button>  
  
                        </th>  
                    </tr>  
                </c:forEach>  
  
            </table>  
        </div>  
  
    </div>  
  
    <!--显示分页信息-->  
    <div class="row">  
        <!--文字信息-->  
        <div class="col-md-6">  
            当前第 1 页.总共 2 页.一共 3 条记录
        </div>  
  
        <!--点击分页-->  
        <div class="col-md-6">  
            <%--<nav aria-label="Page navigation">  --%>
                <%--<ul class="pagination">  --%>
                      <%----%>
                    <%--<li><a href="${pageContext.request.contextPath}/emps?pn=1">首页</a></li>  --%>
                      <%----%>
                    <%--<!--上一页-->  --%>
                    <%--&lt;%&ndash;<li>  &ndash;%&gt;--%>
                        <%--&lt;%&ndash;<c:if test="${pageInfo.hasPreviousPage}">  &ndash;%&gt;--%>
                            <%--&lt;%&ndash;<a href="${pageContext.request.contextPath}/emps?pn=${pageInfo.pageNum-1}" aria-label="Previous">  &ndash;%&gt;--%>
                                <%--&lt;%&ndash;<span aria-hidden="true">«</span>  &ndash;%&gt;--%>
                            <%--&lt;%&ndash;</a>  &ndash;%&gt;--%>
                        <%--&lt;%&ndash;</c:if>  &ndash;%&gt;--%>
                    <%--&lt;%&ndash;</li>  &ndash;%&gt;--%>
  <%----%>
                    <%--<!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->  --%>
                    <%--<c:forEach items="${pageInfo.navigatepageNums}" var="page_num">  --%>
                        <%--<c:if test="${page_num == pageInfo.pageNum}">  --%>
                            <%--<li class="active"><a href="#">${page_num}</a></li>  --%>
                        <%--</c:if>  --%>
                        <%--<c:if test="${page_num != pageInfo.pageNum}">  --%>
                            <%--<li><a href="${pageContext.request.contextPath}/emps?pn=${page_num}">${page_num}</a></li>  --%>
                        <%--</c:if>  --%>
                    <%--</c:forEach>  --%>
  <%----%>
                    <%--<!--下一页-->  --%>
                    <%--<li>  --%>
                        <%--<c:if test="${pageInfo.hasNextPage}">  --%>
                            <%--<a href="${pageContext.request.contextPath}/emps?pn=${pageInfo.pageNum+1}"  --%>
                               <%--aria-label="Next">  --%>
                                <%--<span aria-hidden="true">»</span>  --%>
                            <%--</a>  --%>
                        <%--</c:if>  --%>
                    <%--</li>  --%>
                      <%----%>
                    <%--<li><a href="${pageContext.request.contextPath}/emps?pn=${pageInfo.pages}">尾页</a></li>  --%>
                <%--</ul>  --%>
            <%--</nav>  --%>
        </div>  
  
    </div>  
  
  
</div>  

	</body>
</html>
