<%--
  Created by IntelliJ IDEA.
  User: fyx
  Date: 2018/7/6
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

    <script type="text/javascript" <%--src="../js/datagrid-detailview.js"--%>>
        $(function(){

            $("#dg").datagrid({
                url : "${pageContext.request.contextPath}/slideShow/show",
                title : "轮播图管理",
                //从远程站点请求数据
                columns : [ [ {
                    title : "id",
                    field : "pictureId",
                    width : 100,
                }, {
                    title : "path",
                    field : "picturePath",
                    width : 100,
                }, {
                    title : "date",
                    field : "pictureDate",
                    width : 110,
                }, {
                    title : "description",
                    field : "pictureDescription",
                    width : 110,
                }, {
                    title : "state",
                    field : "state",
                    width : 100,
                }, {
                    title : "option",
                    field : "option",
                    width : 100,
                } ] ],
                fitColumns : true, //自适应网格大小
                pagination : true, //在表格底部显示分页工具栏
                singleSelect : true,
                striped : true, //是否有斑马线
                pageSize : 5,
                pageList : [5,10,15,20],
                toolbar : "#tb",
                /*view : detailview,
                detailFormatter: function(rowIndex, rowData){
                    return '<table><tr>' +
                        '<td rowspan=2 style="border:0"><img src="'+rowData.picturePath+'" style="height:50px;"></td>' +
                        '<td style="border:0">' +
                        '<p>描述信息: ' + rowData.pictureDescription + '</p>' +
                        '<p>创建时间: ' + rowData.pictureDate + '</p>' +
                        '</td>' +
                        '</tr></table>';
                }*/
            });

            $("#tb1").linkbutton({
                 iconCls : "icon-add",
                onClick : function(){
                    console.log("dialog");
                    $("#ad").dialog({
                        width : 500,
                        height : 300,
                        href : "${pageContext.request.contextPath}/main/slideShowAdd.jsp",
                        /*点击保存后向后台发送异步请求*/
                        buttons : "#ab",
                        modal : true,

                    });
                },
            });

            $("#ab1").linkbutton({
                text : "保存",
                iconCls : "icon-save",
                onClick : function(){
                    $("#af").form("submit",{
                        url : "${pageContext.request.contextPath}/slideShow/add",
                        success : function(){
                            $("#ad").dialog("close");
                        }
                    });
                },

            });

            $("#ab2").linkbutton({
                text : "取消",
                iconCls : "icon-cancel",
                onClick : function(){
                    $("#ad").dialog("close");
                },
            });

            $("#tb2").linkbutton({
                iconCls : "icon-add",
                onClick : function(){

                },
            });

            $("#tb3").linkbutton({
                iconCls : "icon-add",
                onClick : function(){
                    /*console.log("dialog");
                    $("#ad").dialog({
                        width : 500,
                        height : 300,
                        href : "${pageContext.request.contextPath}/main/slideShowAdd.jsp",
                        /!*点击保存后向后台发送异步请求*!/
                        buttons : "#ab",
                        modal : true,

                    });*/
                },
            });



        });
    </script>

    <table id="dg"></table>

    <div id="tb">
        <a id="tb1">新增</a>
        <a id="tb2">删除</a>
        <a id="tb3">修改</a>
    </div>

    <div id="ad"></div>

    <div id="ab" style="display: none">
        <a id="ab1"></a>
        <a id="ab2"></a>
    </div>

    <div id="rd"></div>

    <div id="ed"></div>

