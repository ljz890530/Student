<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" type="image/png" sizes="16x16"
	href="plugins/images/favicon.png">
<title>Ample Admin Template - The Ultimate Multipurpose admin
	template</title>
<!-- Bootstrap Core CSS -->
<link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Menu CSS -->
<link href="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
<!-- animation CSS -->
<link href="css/animate.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="css/style.css" rel="stylesheet">
<!-- color CSS -->
<link href="css/colors/default.css" id="theme" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body class="fix-header">
	<!-- ============================================================== -->
	<!-- Preloader -->
	<!-- ============================================================== -->
	<div class="preloader">
		<svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none"
				stroke-width="2" stroke-miterlimit="10" />
        </svg>
	</div>
	<!-- ============================================================== -->
	<!-- Wrapper -->
	<!-- ============================================================== -->
	<div id="wrapper">
		<!-- ============================================================== -->
		<!-- Topbar header - style you can find in pages.scss -->
		<!-- ============================================================== -->
		<nav class="navbar navbar-default navbar-static-top m-b-0">
			<div class="navbar-header">
				<div class="top-left-part">
					<!-- Logo -->
					<a class="logo" href="dashboard.html"> <!-- Logo icon image, you can use font-icon also -->
						<b> <!--This is dark logo icon-->
							<img src="plugins/images/admin-logo.png" alt="home"
							class="dark-logo" /> <!--This is light logo icon-->
							<img src="plugins/images/admin-logo-dark.png" alt="home"
							class="light-logo" />
					</b> <!-- Logo text image you can use text also -->
						<span class="hidden-xs"> <!--This is dark logo text-->
							<img src="plugins/images/admin-text.png" alt="home"
							class="dark-logo" /> <!--This is light logo text-->
							<img src="plugins/images/admin-text-dark.png" alt="home"
							class="light-logo" />
					</span>
					</a>
				</div>
				<!-- /Logo -->
				<ul class="nav navbar-top-links navbar-right pull-right">
					<li><a
						class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg"
						href="javascript:void(0)"><i class="fa fa-bars"></i></a></li>
					<li>
						<form role="search" class="app-search hidden-sm hidden-xs m-r-10">
							<input type="text" placeholder="Search..." class="form-control">
							<a href=""><i class="fa fa-search"></i></a>
						</form>
					</li>
					<li><a class="profile-pic" href="#"> <img
							src="plugins/images/users/varun.jpg" alt="user-img" width="36"
							class="img-circle"> <b class="hidden-xs"> <%=session.getAttribute("name")%>
						</b></a></li>
				</ul>
			</div>
			<!-- /.navbar-header -->
			<!-- /.navbar-top-links -->
			<!-- /.navbar-static-side -->
		</nav>
		<!-- End Top Navigation -->
		<!-- ============================================================== -->
		<!-- Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav slimscrollsidebar">
				<div class="sidebar-head">
					<h3>
						<span class="fa-fw open-close"><i class="ti-close ti-menu"></i></span>
						<span class="hide-menu">Navigation</span>
					</h3>
				</div>
				<ul class="nav" id="side-menu">
					<li style="padding: 70px 0 0;">
                   	<a href="showCheck.action" class="waves-effect"><i class="fa fa-clock-o fa-fw" aria-hidden="true"></i>查看考勤</a>
                   </li>
                   <li>
                   	<a href="showStudentInfo.action" class="waves-effect"><i class="fa fa-user fa-fw" aria-hidden="true"></i>学生管理</a>
                   </li>
                   <li>
                   	<a href="showExam.action" class="waves-effect"><i class="fa fa-table fa-fw" aria-hidden="true"></i>成绩信息</a>
                   </li>
                   <li>
                       <a href="tea_index.jsp" class="waves-effect"><i class="fa fa-columns fa-fw" aria-hidden="true"></i>用户管理</a>
                   </li>
				</ul>
			</div>
		</div>


		<div class="col-md-8 col-md-offset-3 col-xs-12">
			<div class="white-box">
				<form class="form-horizontal form-material"
					action="userUpdate.action" method="post">
					<div class="form-group">
						<label class="col-md-12">用户名称</label>
						<div class="col-md-12">
							<input type="text" placeholder="Name"
								class="form-control form-control-line"
								value=" <%=session.getAttribute("name")%>" name="user.uname">
							<input type="hidden" name="user.uid"
								value="<%=session.getAttribute("id")%>">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-12">用户密码</label>
						<div class="col-md-12">
							<input type="password" placeholder="Password"
								class="form-control form-control-line" name="user.upwd">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-12">再次确认密码</label>
						<div class="col-md-12">
							<input type="password" placeholder="Password"
								class="form-control form-control-line">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-12">
							<button class="btn btn-success">提交信息</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<!-- ============================================================== -->
		<!-- End Left Sidebar -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page Content -->
		<!-- ============================================================== -->
		<div id="page-wrapper">
			<div class="container-fluid"></div>
			<!-- /.container-fluid -->
			<footer class="footer text-center">
				Copyright © X-Max • <a href="http://www.cssmoban.com/"
					target="_blank" title="蜗牛学院">蜗牛学院</a>
			</footer>
		</div>
		<!-- ============================================================== -->
		<!-- End Page Content -->
		<!-- ============================================================== -->
	</div>
	<!-- /#wrapper -->
	<!-- jQuery -->
	<script src="plugins/bower_components/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- Menu Plugin JavaScript -->
	<script src="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
	<!--slimscroll JavaScript -->
	<script src="js/jquery.slimscroll.js"></script>
	<!--Wave Effects -->
	<script src="js/waves.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="js/custom.min.js"></script>
</body>

</html>