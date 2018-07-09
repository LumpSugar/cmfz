<%--
  Created by IntelliJ IDEA.
  User: fyx
  Date: 2018/7/6
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $( function() {

        /*$("#fb").filebox({
            buttonText : "选择文件",
            buttonAlign : "right",
            onChange : function(newValue,oldValue){
                console.log(newValue);
            }
        });*/

        /*$("#fb").change(function(){
            console.log($(this).val());
        });*/

        $("#sb").switchbutton({
            checked : true,
        });

    });

</script>
<form id="af" method="post" enctype="multipart/form-data">
    <div style="margin-left: 100px;margin-top: 20px">
        上传路径 : <input class="easyui-filebox" data-options="label:'上传路径:'" name="myFile"/> <br>
        相关信息 : <input class="easyui-textbox" data-options="label:'相关信息:'" name="pictureDescription"/> <br>
        是否展示 : <input id="sb" class="easyui-switchbutton" data-options="label:'展示:' " name="showPic"/><br>
    </div>
</form>