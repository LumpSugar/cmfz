<%--
  Created by IntelliJ IDEA.
  User: fyx
  Date: 2018/7/7
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $( function() {

    });

</script>
<form id="gaf" method="post" enctype="multipart/form-data">
    <div style="margin-left: 100px;margin-top: 20px">
        法   名  : <input class="easyui-validatebox" data-options="label:'法名:'" name="religiousName"/> <br>
        头   像 : <input class="easyui-filebox" data-options="label:'头像:'" name="myFile"/> <br>
        介   绍 : <input class="easyui-textbox" data-options="label:'介绍:'" name="guruIntro"/> <br>
    </div>
</form>
