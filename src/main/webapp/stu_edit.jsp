<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="plugins/images/favicon.png">
    <title>Ample Admin Template - The Ultimate Multipurpose admin template</title>
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
            <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" />
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
                    <a class="logo" href="dashboard.html">
                        <!-- Logo icon image, you can use font-icon also --><b>
                            <!--This is dark logo icon--><img src="plugins/images/admin-logo.png" alt="home"
                                class="dark-logo" />
                            <!--This is light logo icon--><img src="plugins/images/admin-logo-dark.png" alt="home"
                                class="light-logo" />
                        </b>
                        <!-- Logo text image you can use text also --><span class="hidden-xs">
                            <!--This is dark logo text--><img src="plugins/images/admin-text.png" alt="home"
                                class="dark-logo" />
                            <!--This is light logo text--><img src="plugins/images/admin-text-dark.png" alt="home"
                                class="light-logo" />
                        </span> </a>
                </div>
                <!-- /Logo -->
                <ul class="nav navbar-top-links navbar-right pull-right">
                    <li>
                        <a class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg"
                            href="javascript:void(0)"><i class="fa fa-bars"></i></a>
                    </li>
                    <li>
                        <form role="search" class="app-search hidden-sm hidden-xs m-r-10">
                            <input type="text" placeholder="Search..." class="form-control"> <a href=""><i
                                    class="fa fa-search"></i></a> </form>
                    </li>
                    <li>
                        <a class="profile-pic" href="#"> <img src="plugins/images/users/varun.jpg" alt="user-img"
                                width="36" class="img-circle"><b class="hidden-xs"><%=session.getAttribute("name")%></b></a>
                    </li>
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
                    <h3><span class="fa-fw open-close"><i class="ti-close ti-menu"></i></span> <span
                            class="hide-menu">Navigation</span></h3>
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
                        <h4 class="page-title">学生管理</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <ol class="breadcrumb">
                            <li>添加考试成绩</li>
                            <li class="active">添加评语</li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->
                <!-- .row -->
                <div class="row">
                    <div class="col-md-4 col-xs-12">
                        <div class="white-box">
                            <div class="user-bg"> <img width="100%" alt="user" src="plugins/images/large/zi.jpg">
                                <div class="overlay-box">
                                    <div class="user-content">
                                        <a href="javascript:void(0)"><img src="plugins/images/users/genu.jpg"
                                                class="thumb-lg img-circle" alt="img"></a>
                                        <h4 class="text-white" id="name"></h4>
                                        <h5 class="text-white">班级：163班</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="user-btm-box">
                                <div class="col-md-4 col-sm-4 text-center">
                                    <p class="text-purple"><i class="ti-facebook">性别</i></p>
                                    <h1 id="sex"></h1>
                                </div>
                                <div class="col-md-4 col-sm-4 text-center">
                                    <p class="text-blue"><i class="ti-twitter">地址</i></p>
                                    <h1 id="site"></h1>
                                </div>
                                <div class="col-md-4 col-sm-4 text-center">
                                    <p class="text-danger"><i class="ti-dribbble">电话号码</i></p>
                                    <div style="margin-top:15px;">
                                    	<h2 id="phone"></h2>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8 col-xs-12">
                        <div class="white-box">
                            <form class="form-horizontal form-material">
                                <div class="form-group">
								    <label class="col-sm-12">学生姓名</label>
								    <div class="col-sm-12">
								        <select class="form-control form-control-line" id="test">
								    		<s:iterator value="students" status="i">				    			
								    			<option name="option" value="<s:property value="stuId"/>">								    		
								    				<s:property value="stuName"/>								    									    				
								    			</option>
								    		</s:iterator>						           
								        </select>
								    </div>
								</div>
								<div class="form-group">
								    <label class="col-sm-12">学生班级</label>
								    <div class="col-sm-12">
								        <select class="form-control form-control-line">
								    		<s:iterator value="grades" status="i">
								    			<option value="<s:property value="gid"/>">								    		
								    				<s:property value="gname"/>
								    			</option>
								    		</s:iterator>						           
								        </select>
								    </div>
								</div>
								 <div class="form-group">
								    <label class="col-sm-12">选择阶段</label>
								    <div class="col-sm-12">
								        <select class="form-control form-control-line">
								        	<s:iterator value="stages" status="i">
								    			 <option value="<s:property value="staId"/>">
								    			 	<s:property value="staName"/>								    			 
								    			 </option>
								    		</s:iterator>							            
								        </select>
								    </div>
								</div>
                                <div class="form-group">
                                    <label class="col-md-12">考试成绩</label>
                                    <div class="col-md-12">
                                        <input type="datetime" placeholder="Examination Date" class="form-control form-control-line">
                                    </div>
                                </div>                             
								<div class="form-group">
								    <label class="col-md-12">考试日期</label>
								    <div class="col-md-12">
								        <input type="date" placeholder="Examination Score" class="form-control form-control-line">
								    </div>
								</div>
                                <div class="form-group">
                                    <label class="col-md-12">添加评语</label>
                                    <div class="col-md-12">
                                        <textarea rows="5" class="form-control form-control-line"></textarea>
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
                </div>
                <!-- /.row -->
            </div>
           <!-- /.container-fluid -->
           <footer class="footer text-center"> Copyright © X-Max • <a href="http://www.cssmoban.com/" target="_blank" title="蜗牛学院">蜗牛学院</a></footer>
        </div>
        <!-- /#page-wrapper -->
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
	<!--引入jquery-->
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
	</script>
	<script>
		$(document).ready(function(){	
			$("#test").change(function(){
// 				alert($(this).val());
				$.ajax({
					url:"studentInfoById.action",
					data:{"id":$(this).val()},
					type:"post",
					dataType:"json",
					scriptCharset:'utf-8',
					success:function(data){
						// alert(data["stuName"]); 
						$("#sex").text(data["stuSex"]);
						$("#site").text(data["stuAdd"]);
						$("#phone").text(data["stuPhone"]);
						$("#name").text(data["stuName"]);
					}
				});
			})			
		});
	</script>
</body>

</html>