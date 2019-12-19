<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>登录(Login)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- CSS -->
       	<style type="text/css">
       		*{ margin:0; padding:0; }
				body { background:#111; height:100%; }
					img { border:none; }
					
					#supersized-loader { position:absolute; top:50%; left:50%; z-index:0; width:60px; height:60px; margin:-30px 0 0 -30px; text-indent:-999em; background:url(../img/progress.gif) no-repeat center center;}
					
					#supersized {  display:block; position:fixed; left:0; top:0; overflow:hidden; z-index:-999; height:100%; width:100%; }
						#supersized img { width:auto; height:auto; position:relative; display:none; outline:none; border:none; }
							#supersized.speed img { -ms-interpolation-mode:nearest-neighbor; image-rendering: -moz-crisp-edges; }	/*Speed*/
							#supersized.quality img { -ms-interpolation-mode:bicubic; image-rendering: optimizeQuality; }			/*Quality*/
						
						#supersized li { display:block; list-style:none; z-index:-30; position:fixed; overflow:hidden; top:0; left:0; width:100%; height:100%; background:#111; }
						#supersized a { width:100%; height:100%; display:block; }
							#supersized li.prevslide { z-index:-20; }
							#supersized li.activeslide { z-index:-10; }
							#supersized li.image-loading { background:#111 url(../img/progress.gif) no-repeat center center; width:100%; height:100%; }
								#supersized li.image-loading img{ visibility:hidden; }
							#supersized li.prevslide img, #supersized li.activeslide img{ display:inline; }
				
				
				#supersized img { max-width: none !important }
       	</style>
        <style type="text/css">
        	body {
			    background: #f8f8f8;
			    text-align: center;
			    color: #fff;
				font-family:Microsoft YaHei,Segoe UI,Tahoma,Arial,Verdana,sans-serif;
			}
			
			.page-container {
				width:350px;
				height:auto;
			    margin: 120px auto 0 auto;
			}
			
			h1 {
			    font-size: 30px;
			    font-weight: 700;
			    text-shadow: 0 1px 4px rgba(0,0,0,.2);
			}
			
			form {
			    position: relative;
			    width: 350px;
			    margin: 15px auto 0 auto;
			    text-align: center;
			}
			
			input {
			    width: 270px;
			    height: 42px;
			    margin-top: 25px;
			    padding: 0 15px;
			    background: #2d2d2d; /* browsers that don't support rgba */
			    background: rgba(45,45,45,.15);
			    -moz-border-radius: 6px;
			    -webkit-border-radius: 6px;
			    border-radius: 6px;
			    border: 1px solid #3d3d3d; /* browsers that don't support rgba */
			    border: 1px solid rgba(255,255,255,.15);
			    -moz-box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
			    -webkit-box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
			    box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
			    font-family: 'PT Sans', Helvetica, Arial, sans-serif;
			    font-size: 14px;
			    color: #fff;
			    text-shadow: 0 1px 2px rgba(0,0,0,.1);
			    -o-transition: all .2s;
			    -moz-transition: all .2s;
			    -webkit-transition: all .2s;
			    -ms-transition: all .2s;
			}
			
			input:-moz-placeholder { color: #fff; }
			input:-ms-input-placeholder { color: #fff; }
			input::-webkit-input-placeholder { color: #fff; }
			
			input:focus {
			    outline: none;
			    -moz-box-shadow:
			        0 2px 3px 0 rgba(0,0,0,.1) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    -webkit-box-shadow:
			        0 2px 3px 0 rgba(0,0,0,.1) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    box-shadow:
			        0 2px 3px 0 rgba(0,0,0,.1) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			}
			button {
			    cursor: pointer;
			    width: 300px;
			    height: 44px;
			    margin-top: 25px;
			    padding: 0;
			    background: #ef4300;
			    -moz-border-radius: 6px;
			    -webkit-border-radius: 6px;
			    border-radius: 6px;
			    border: 1px solid #ff730e;
			    -moz-box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.25) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    -webkit-box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.25) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.25) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    font-family: 'PT Sans', Helvetica, Arial, sans-serif;
			    font-size: 14px;
			    font-weight: 700;
			    color: #fff;
			    text-shadow: 0 1px 2px rgba(0,0,0,.1);
			    -o-transition: all .2s;
			    -moz-transition: all .2s;
			    -webkit-transition: all .2s;
			    -ms-transition: all .2s;
			}
			button:hover {
			    -moz-box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.15) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    -webkit-box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.15) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.15) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			}
			button:active {
			    -moz-box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.15) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    -webkit-box-shadow:
			        0 15px 30px 0 rgba(255,255,255,.15) inset,
			        0 2px 7px 0 rgba(0,0,0,.2);
			    box-shadow:        
			        0 5px 8px 0 rgba(0,0,0,.1) inset,
			        0 1px 4px 0 rgba(0,0,0,.1);
			
			    border: 0px solid #ef4300;
			}
			form,input,button{font-family:Microsoft YaHei,Segoe UI,Tahoma,Arial,Verdana,sans-serif; text-decoration:none; width:100%;}
			button.submit_button{ font-size:24px; letter-spacing:15px;}
			input.Captcha{ width:130px; float:left;}
        </style>
    </head>
    <body style="background-color:grey">

        <div class="page-container">
            <h1>Login</h1>
            <form action="login.action" method="post">
               <input type="text"  name="user.uname" placeholder="请输入您的用户名！">
               <input type="password" name="user.upwd" placeholder="请输入您的用户密码！">

               <button type="submit" class="submit_button" style="width: 382px">登录</button>
            </form>
        </div>
		
    </body>
</html>

