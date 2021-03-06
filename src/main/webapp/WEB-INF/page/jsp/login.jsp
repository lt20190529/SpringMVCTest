<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring</title>
</head>
<meta http-equiv=Content-Type content=text/html; charset=utf-8>

<script type="text/javascript" src="../../../plugs/js/jQuery/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../../../plugs/js/bootstrap-4.0.0/js/bootstrap.min.js"></script>

<link href="../../../plugs/js/bootstrap-4.0.0/css/bootstrap.css" type="text/css" rel="stylesheet">
<title>登录首页</title>
<style>

</style>
<script type="text/javascript">

</script>

<body>
<div class="container">

    <div class="header">
        <div id="messageBox" class="alert alert-error ${empty message ? 'hide' : ''}">
            <button data-dismiss="alert" class="close">×</button>
            <label id="loginError" class="error">${message}</label>
        </div>
    </div>


    <form id="loginForm" action="/user/login" method="post" class="form-horizontal">
        <fieldset>
            <div class="login_header" style="text-align:center; display:block">
                <br>
                <br>
                <br>
                <br>

                <div style="color:#000 ;font-size:32px; ">管理运营综合平台</div>
                <div style="color:#999 ;font-size:18px;padding-top:2px;">Integrated management and operation platform</div>

            </div>
            <br>
            <br>
            <br>
            <br>

            <div class="form-group" id="midDiv">
                <label class="col-md-3 control-label" for="username">用户名：</label>
                <div class="div col-md-5">
                    <input type="text" id="username" name="username" class="form-control required" placeholder="请输入登录名">
                </div>
                <div class="col-md-4" id="midSpan"></div>
            </div>
            <div class="form-group" id="passwordDiv">
                <label class="col-md-3 control-label" for="password">密码：</label>
                <div class="col-md-5">
                    <input type="password" id="password" name="password" class="form-control required" placeholder="请输入登录密码">
                </div>
                <div class="col-md-4" id="passwordSpan"></div>
            </div>

            <div class="form-group" id="butDiv">
                <div class="col-md-8 ">
                    <button type="submit" id="subBut" class="btn btn-xs btn-primary">登录</button>
                    <button type="reset" id="rstBut" class="btn btn-xs btn-primary">重置</button>
                </div>
            </div>


            <br>
            <br>
            <br>
            <br>
            <div id="footer">
                <nav class="navbar navbar-default navbar-fixed-bottom"  style="background: white;border: none;">
                    <div class="container-fluid" style="margin-bottom:5px;margin-top: 5px;">
                        <div class="media">
                            <div class="media-left">
                                <a href="#" style="cursor: auto;">
                                    <!--<img src="${ctx}/static/images/login/logo_system.png">-->
                                </a>
                            </div>
                            <div class="media-body media-middle">
                                <h3 class="media-heading">系统简介</h3>
                                管理运营综合平台运用先进信息技术为企业提供完整管理解决方案的公司。
                                服务于电信业、制造业、政府等多个行业领域，在ERP咨询服务、ERP系统实施、
                                数据挖掘与分析、资产与设备管理、知识管理等应用领域拥有丰富的经验。
                                公司以服务创新和技术创新为宗旨，通过为客户提供高质量的端到端全方位咨询服务，
                                得到了客户的广泛认可。
                            </div>

                            <div class="media-right">
                                <a href="#" style="cursor: auto;">
                                    <!--  <img src="../image/log.png"/>-->
                                </a>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
        </fieldset>
    </form>

</div>
</body>
</body>

</html>
