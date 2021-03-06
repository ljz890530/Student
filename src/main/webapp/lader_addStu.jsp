<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<<<<<<< HEAD
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
                                width="36" class="img-circle"><b class="hidden-xs">Steave</b></a>
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
                        <a href="profile.jsp" class="waves-effect"><i class="fa fa-user fa-fw"
                                aria-hidden="true"></i>个人信息</a>
                    </li>
                    <li>
                        <a href="lader_show.jsp" class="waves-effect"><i class="fa fa-table fa-fw"
                                aria-hidden="true"></i>查看学员</a>
                    </li>
                    <li>
                        <a href="lader_addStu.jsp" class="waves-effect"><i class="fa fa-font fa-fw"
                                aria-hidden="true"></i>添加学员</a>
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
                        <h4 class="page-title">添加学员</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="#" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light">导入学员Excele表

                        </a>
                        <ol class="breadcrumb">
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /row -->
                <div class="row">
                    <div class="col-sm-12">
                        
                        <div class="white-box">
                            <form class="form-horizontal form-material" action="addStu.action" method="post">
                            	<!--姓名-->
                                <div class="form-group">
                                    <label class="col-md-12">学生姓名</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="李某某"
                                            class="form-control form-control-line" name="stu.stuName"> </div>
                                </div>
                                <!--性别-->
                                <div class="form-group">
                                    <label class="col-sm-12">性别</label>
                                    <div class="col-sm-12">
                                        <input type="radio" name="stu.stuSex" value="男">男
                                        <input type="radio" name="stu.stuSex" value="女">女
                                    </div>
                                </div>
                                <!--身份证-->
                                <div class="form-group">
                                    <label class="col-md-12">身份证</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuCard"> </div>
                                </div>
                                
                                <!--联系电话-->
                                <div class="form-group">
                                    <label class="col-md-12">联系电话</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" placeholder="1336390xxxx" name="stu.stuPhone"> </div>
                                </div>
                                <!--地址-->
                                <div class="form-group">
                                    <label class="col-md-12">地址</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuAdd"> </div>
                                </div>
                                <!--学历-->
                                <div class="form-group">
                                    <label class="col-sm-12">学历</label>
                                    <div class="col-sm-12">
                                        <select class="form-control form-control-line" name="stu.stuEdu">
                                            <option>专科</option>
                                            <option>本科</option>
                                            <option>研究生</option>
                                            <option>博士</option>
                                        </select>
                                    </div>
                                </div>
                                <!--毕业院校-->
                                <div class="form-group">
                                    <label class="col-md-12">毕业院校</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuCollege"> </div>
                                </div>
                                <!--专业-->
                                <div class="form-group">
                                    <label class="col-md-12">专业</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuMajor"> </div>
                                </div>
                                <!--毕业时间-->
                                <div class="form-group">
                                    <label class="col-md-12">毕业时间</label>
                                    <div class="col-md-12">
                                        <input type="date" name="stu.stuGradu"> </div>
                                </div>
                                <!--所属班级-->
                                <div class="form-group">
                                    <label class="col-sm-12">所属班级</label>
                                    <div class="col-sm-12">
                                        <select class="form-control form-control-line" name="stu.gRade.gType">
                                            <option>1班</option>
                                            <option>22期</option>
                                            <option>22期</option>
                                            <option>22期</option>
=======
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
                                width="36" class="img-circle"><b class="hidden-xs">Steave</b></a>
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
                        <a href="profile.jsp" class="waves-effect"><i class="fa fa-user fa-fw"
                                aria-hidden="true"></i>个人信息</a>
                    </li>
                    <li>
                        <a href="showAllStu.action" class="waves-effect"><i class="fa fa-table fa-fw"
                                aria-hidden="true"></i>查看学员</a>
                    </li>
                    <li>
                        <a href="lader_addStu.jsp" class="waves-effect"><i class="fa fa-font fa-fw"
                                aria-hidden="true"></i>添加学员</a>
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
                        <h4 class="page-title">添加学员</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="lader_excel.jsp" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light">导入学员Excele表

                        </a>
                        <ol class="breadcrumb">
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /row -->
                <div class="row">
                    <div class="col-sm-12">
                        
                        <div class="white-box">
                            <form class="form-horizontal form-material" action="addStu.action" method="post">
                            	<!--姓名-->
                                <div class="form-group">
                                    <label class="col-md-12">学生姓名</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="李某某"
                                            class="form-control form-control-line" name="stu.stuName"> </div>
                                </div>
                                <!--性别-->
                                <div class="form-group">
                                    <label class="col-sm-12">性别</label>
                                    <div class="col-sm-12">
                                        <input type="radio" name="stu.stuSex" value="男">男
                                        <input type="radio" name="stu.stuSex" value="女">女
                                    </div>
                                </div>
                                <!--身份证-->
                                <div class="form-group">
                                    <label class="col-md-12">身份证</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuCard"> </div>
                                </div>
                                
                                <!--联系电话-->
                                <div class="form-group">
                                    <label class="col-md-12">联系电话</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" placeholder="1336390xxxx" name="stu.stuPhone"> </div>
                                </div>
                                <!--地址-->
                                <div class="form-group">
                                    <label class="col-md-12">地址</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuAdd"> </div>
                                </div>
                                <!--学历-->
                                <div class="form-group">
                                    <label class="col-sm-12">学历</label>
                                    <div class="col-sm-12">
                                        <select class="form-control form-control-line" name="stu.stuEdu">
                                            <option>专科</option>
                                            <option>本科</option>
                                            <option>研究生</option>
                                            <option>博士</option>
                                        </select>
                                    </div>
                                </div>
                                <!--毕业院校-->
                                <div class="form-group">
                                    <label class="col-md-12">毕业院校</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuCollege"> </div>
                                </div>
                                <!--专业-->
                                <div class="form-group">
                                    <label class="col-md-12">专业</label>
                                    <div class="col-md-12">
                                        <input type="text" class="form-control form-control-line" name="stu.stuMajor"> </div>
                                </div>
                                <!--毕业时间-->
                                <div class="form-group">
                                    <label class="col-md-12">毕业时间</label>
                                    <div class="col-md-12">
                                        <input type="date" name="stu.stuGradu"> </div>
                                </div>
                                <!--所属班级-->
                                <div class="form-group">
                                    <label class="col-sm-12">所属班级</label>
                                    <div class="col-sm-12">
                                        <select class="form-control form-control-line" name="stu.gid">
                                        	<c:forEach items="${grades }" var="g">
                                        		<option value="${g.gid }">${g.gname }</option>
                                        	</c:forEach>
>>>>>>> branch 'master' of https://github.com/ljz890530/Student.git
                                        </select>
                                    </div>
                                </div>
                               <div class="form-group">
                                    <div class="col-sm-12">
                                        <button class="btn btn-success">提交</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        
                    </div>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
            <footer class="footer text-center"> 2019 &copy; yy-group版权所有</footer>
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
</body>

</html>