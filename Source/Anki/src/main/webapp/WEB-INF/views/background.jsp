<%@ page language="java" pageEncoding="utf8" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/menu.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Thông tin cá nhân</title>
<link href="<c:url value="/resources/css/background.css" />" rel="stylesheet">
</head>
<body style="padding-top: 70px; font-family: 'Source Sans Pro', sans-serif;" >
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="container">
<div class="row">
<div class="col-md-2 text-center">
	<div class="img-rounded logoImg" style="margin-bottom:0; height: 180px; width: 171px; padding: 0px;" >
      <form method="POST" action="/luanvan/uploadFile" role="form"  id="formUploadFile">
     
      	<div onclick="showDialog()" style="height: 180px; width: 171px; padding: 0px; margin: 0px; cursor: pointer;	 z-index: 9;">
      		<c:if test="${not empty user.image }">
      			<img src="<c:url value="${user.image}" />" style="height: 180px; width: 171px;">
      			
      		</c:if>
      		<c:if test="${empty user.image }">
      			<img src="<c:url value="/resources/img/hinh.svg" />" style="height: 180px; width: 171px;">
      		</c:if>
      		<div class="hoverImg" style="z-index: 10;color: #fff;background: rgba(34, 85, 85, 0.3); position: relative; top: -60px; width: 171px; padding: 20px 15px; ">
      			<i class="glyphicon glyphicon-edit"></i> Ảnh đại diện</div>
      	</div>
      	
      	 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
      	 <input type="hidden" name="file" id="fileString"/>
      	 <input type="file"  style="opacity:0;" id="uploadImageId"/>
      </form>
    </div>
    
    <span style="font-size:20px; color:#666;">${user.username}</span>
    <div class="tabs-left">
		<ul class="nav nav-stacked tab-left">
	        <li class="classLi active text-left" id="duAn"><a href="#tabDuAn" data-toggle="tab"><i class="glyphicon glyphicon-list-alt"></i> Các dự án</a></li>
	        <li class="classLi text-left" id="matKhau"><a href="#tabMatKhau" data-toggle="tab"><i class="glyphicon glyphicon-pencil"></i> Đổi mật khẩu</a></li>
	        <li class="classLi text-left" id="thongTin"><a href="#tabThongTin" data-toggle="tab"><i class="glyphicon glyphicon-info-sign"></i> Thông tin cá nhân</a></li>
	    </ul>
	</div>
</div>
<div class="col-md-10">
	 <div class="tab-content">
        <div class="tab-pane fade in active" id="tabDuAn">
            <div class="panel panel-default">
			  <div class="panel-heading" >
			  		<span style="font-size: 20px">Các dự án</span>
			 	 <a type="button" class="btn btn-primary pull-right"  href="${contextPath}/formCreateProject">
			 	 	<i class="glyphicon glyphicon-plus"></i> Tạo dự án</a>
			  </div>
			  <div class="panel-body">
				  <div class="col-md-4">
				  	<div class="panel panel-default" style="margin-top: 5px">
					  <div class="panel-heading">Đang tiến hành <span class="pull-right badge">${fn:length(listMaking)}</span></div>
					  <div class="panel-body" style="padding: 0px;">
					  	<table class="table">
							<c:forEach var="list" items="${listMaking}">
								<tr>
									<td>
										<a href="${contextPath}/detailProject/name=${list.tenproject}" class="projectName">${list.tenproject}</a><br>
										<span class="description">${list.motaproject}</span>
										<span class="pull-right date-create"><fmt:formatDate value="${list.ngaytao}" pattern="dd-MM-yyyy" /></span>
									</td>
								</tr>
							</c:forEach>
  						</table>
					  </div>
					</div>
				  </div>
				  
				  <div class="col-md-4">
				  	<div class="panel panel-default" style="margin-top: 5px">
					  <div class="panel-heading">Đã hoàn thành <span class="pull-right badge">${fn:length(listFinish)}</span></div>
					  <div class="panel-body" style="padding: 0px;">
						  <table class="table">
								<c:forEach var="list" items="${listFinish}">
									<tr>
										<td>
											<a href="${contextPath}/detailProject/name=${list.tenproject}" class="projectName">${list.tenproject}</a><br>
											<span class="description">${list.motaproject}</span>
											<span class="pull-right date-create"><fmt:formatDate value="${list.ngaytao}" pattern="dd-MM-yyyy" /></span>
										</td>
									</tr>
								</c:forEach>
	  					  </table>
					  </div>
					</div>
				  </div>
				  
				  <div class="col-md-4">
				  	<div class="panel panel-default" style="margin-top: 5px">
					  <div class="panel-heading">Tạm dừng <span class="pull-right badge">${fn:length(listStopping)}</span></div>
					  <div class="panel-body" style="padding: 0px;">
						<table class="table">
							<c:forEach var="list" items="${listStopping}">
								<tr>
									<td>
										<a href="${contextPath}/detailProject/name=${list.tenproject}" class="projectName">${list.tenproject}</a><br>
										<span class="description">${list.motaproject}</span>
										<span class="pull-right date-create"><fmt:formatDate value="${list.ngaytao}" pattern="dd-MM-yyyy" /></span>
									</td>
								</tr>
							</c:forEach>
	  					</table>
					  </div>
					</div>
				  </div>
			  </div>
			</div>
        </div>
        <div class="tab-pane fade" id="tabMatKhau">
            <%@ include file="/WEB-INF/views/changepassword.jsp" %>               
        </div>
        <div class="tab-pane fade" id="tabThongTin">
            <div class="panel panel-default">
			  <div class="panel-heading">Thông tin cá nhân</div>
			  <div class="panel-body">
				  <form action="/luanvan/updateInformation" role="form" method="POST">
				  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					  	<div class="form-group">
					  		<span>Họ và tên:</span>
					  		<input type="text" name="name" class="form-control" value="${user.fullname}"  placeholder="Nhập họ và tên vào đây">
					  	</div>
					  	<div class="form-group">
					  		<span>Email:</span>
					  		<input type="email" name="updateEmail" class="form-control" value="${user.email}">
					  	</div>
					  	<div class="form-group">
					  		<span>Số điện thoại:</span>
					  		<input type="text" name="phone" value="${user.phone}"  class="form-control" placeholder="Nhập số điện thoại vào đây" maxlength="11">
					  	</div>
					  	<div class="form-group">
					  		<span>Địa chỉ:</span>
					  		<textarea name="address"  class="form-control" rows="3" >${user.address}</textarea>
					  	</div>
					  	<button type="submit" class="btn btn-default btn-primary">Cập nhật</button>
					  	<c:if test="${not empty updateSuccess}">
						  	<div class="alert alert-success text-center alert-update-success" style="margin-top: 10px;">
								<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
								${updateSuccess}
							</div>
					  	</c:if>
				  </form>
			  </div>
			</div><!-- End panel -->
        </div>
    </div>
</div>

</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</div>
<script src="<c:url value="/resources/js/background.js" />" ></script>
<script src="<c:url value="/resources/js/changepassword.js" />" ></script>
<script src="<c:url value="/resources/js/updateInfor.js" />" ></script>
</body>
</html>