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
<link
	href="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css"
	rel="stylesheet">
<!-- toast CSS -->
<link
	href="plugins/bower_components/toast-master/css/jquery.toast.css"
	rel="stylesheet">
<!-- morris CSS -->
<link href="plugins/bower_components/morrisjs/morris.css"
	rel="stylesheet">
<!-- chartist CSS -->
<link
	href="plugins/bower_components/chartist-js/dist/chartist.min.css"
	rel="stylesheet">
<link
	href="plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css"
	rel="stylesheet">
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
						<b> <!--This is dark logo icon--> <img
							src="plugins/images/admin-logo.png" alt="home"
							class="dark-logo" /> <!--This is light logo icon--> <img
							src="plugins/images/admin-logo-dark.png" alt="home"
							class="light-logo" />
					</b> <!-- Logo text image you can use text also --> <span
						class="hidden-xs"> <!--This is dark logo text--> <img
							src="plugins/images/admin-text.png" alt="home"
							class="dark-logo" /> <!--This is light logo text--> <img
							src="plugins/images/admin-text-dark.png" alt="home"
							class="light-logo" />
					</span>
					</a>
				</div>
				<!-- /Logo -->
				<ul class="nav navbar-top-links navbar-right pull-right">
					<li><a
						class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg"
						href="javascript:void(0)"><i class="fa fa-bars"></i></a></li>

					<li><a class="profile-pic" href="#"> <img
							src="plugins/images/users/varun.jpg" alt="user-img" width="36"
							class="img-circle"><b class="hidden-xs"><%=session.getAttribute("name")%></b></a></li>
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
		<!-- ============================================================== -->
		<!-- End Left Sidebar -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page Content -->
		<!-- ============================================================== -->
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row bg-title">
					<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
						<h4 class="page-title">
							用户身份:教师&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;帐号名称:
							<%=session.getAttribute("name")%></h4>
					</div>
					<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
						<ol class="breadcrumb">
							<li><a href="#">所属班级：163班</a></li>
						</ol>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->
				<!-- ============================================================== -->
				<!-- Different data widgets -->
				<!-- ============================================================== -->
				<!-- .row -->
				<div class="row">
					<div class="col-lg-4 col-sm-6 col-xs-12">
						<div class="white-box analytics-info">
							<h3 class="box-title">迟到&nbsp;&nbsp;&nbsp;周/次</h3>
							<ul class="list-inline two-part">
								<li>
									<div id="sparklinedash"></div>
								</li>
								<li class="text-right"><i class="ti-arrow-up text-success"></i>
									<span class="counter text-success">659</span></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-4 col-sm-6 col-xs-12">
						<div class="white-box analytics-info">
							<h3 class="box-title">早退&nbsp;&nbsp;&nbsp;周/次</h3>
							<ul class="list-inline two-part">
								<li>
									<div id="sparklinedash2"></div>
								</li>
								<li class="text-right"><i class="ti-arrow-up text-purple"></i>
									<span class="counter text-purple">869</span></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-4 col-sm-6 col-xs-12">
						<div class="white-box analytics-info">
							<h3 class="box-title">旷课&nbsp;&nbsp;&nbsp;周/次</h3>
							<ul class="list-inline two-part">
								<li>
									<div id="sparklinedash3"></div>
								</li>
								<li class="text-right"><i class="ti-arrow-up text-info"></i>
									<span class="counter text-info">911</span></li>
							</ul>
						</div>
					</div>
				</div>
				<!--/.row -->
				<!--row -->
				<!-- /.row -->
				<div class="row">
					<div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
						<div class="white-box">
							<h3 class="box-title">学员考勤情况</h3>
							<ul class="list-inline text-right">
								<li>
									<h5>
										<i class="fa fa-circle m-r-5 text-danger"></i>旷课
									</h5>
								</li>
								<li>
									<h5>
										<i class="fa fa-circle m-r-5 text-info"></i>早退
									</h5>
								</li>
								<li>
									<h5>
										<i class="fa fa-circle m-r-5 text-inverse"></i>迟到
									</h5>
								</li>
							</ul>
							<div id="ct-visits" style="height: 405px;"></div>
						</div>
					</div>
				</div>
				<!-- ============================================================== -->
				<!-- table -->
				<!-- ============================================================== -->
				<div class="row">
					<div class="col-md-12 col-lg-12 col-sm-12">
						<div class="white-box">
							<div class="col-md-3 col-sm-4 col-xs-6 pull-right">
								<select class="form-control pull-right row b-none">
									<option>March 2017</option>
									<option>April 2017</option>
									<option>May 2017</option>
									<option>June 2017</option>
									<option>July 2017</option>
								</select>
							</div>
							<h3 class="box-title">考勤情况</h3>
							<div class="table-responsive">
								<table class="table">
									<!-- =======================================================================================================================================-->



									<!-- =======================================================================================================================================-->
									<thead>
										<tr>
											<th>#</th>
											<th>学生姓名</th>
											<th>学员编号</th>
											<th>时间</th>
											<th>状态</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="chrecords" status="i">
											<tr>
												<td><s:property value="#i.count" /></td>
												<td class="txt-oflo"><s:property
														value="student.stuName" /></td>
												<td><s:property value="student.stuId" /></td>
												<td class="txt-oflo"><s:date name="chReTime"
														format="yyyy-MM-dd" /></td>
												<td><span class="text" id="color"> <s:property
															value="check.chName" />
												</span></td>
											</tr>
										</s:iterator>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>


			</div>
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
	<!-- ============================================================== -->
	<!-- End Wrapper -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- All Jquery -->
	<!-- ============================================================== -->
	<script src="plugins/bower_components/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- Menu Plugin JavaScript -->
	<script
		src="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
	<!--slimscroll JavaScript -->
	<script src="js/jquery.slimscroll.js"></script>
	<!--Wave Effects -->
	<script src="js/waves.js"></script>
	<!--Counter js -->
	<script
		src="plugins/bower_components/waypoints/lib/jquery.waypoints.js"></script>
	<script
		src="plugins/bower_components/counterup/jquery.counterup.min.js"></script>
	<!-- chartist chart -->
	<script
		src="plugins/bower_components/chartist-js/dist/chartist.min.js"></script>
	<script
		src="plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js"></script>
	<!-- Sparkline chart JavaScript -->
	<script
		src="plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="js/custom.min.js"></script>
	<script src="js/dashboard1.js"></script>
	<script
		src="plugins/bower_components/toast-master/js/jquery.toast.js"></script>
</body>

</html>
