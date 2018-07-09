<%--
  Created by IntelliJ IDEA.
  User: fyx
  Date: 2018/7/7
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

    <script type="text/javascript">

        $(function(){

            $("#dg").datagrid({
                url : "${pageContext.request.contextPath}/guru/showAllGuru",
                title : "上师管理",
                //从远程站点请求数据
                columns : [ [ {
                    title : "编号",
                    field : "guruId",
                    width : 100,
                }, {
                    title : "法名",
                    field : "religiousName",
                    width : 100,
                }, {
                    title : "头像",
                    field : "guruPhoto",
                    width : 110,
                }, {
                    title : "介绍",
                    field : "guruIntro",
                    width : 110,
                } ] ],
                fitColumns : true, //自适应网格大小
                pagination : true, //在表格底部显示分页工具栏
                singleSelect : true,
                striped : true, //是否有斑马线
                pageSize : 5,
                pageList : [5,10,15,20],
                toolbar : "#tb",
            });

            // 新增上师
            $("#tb1").linkbutton({
                iconCls : "icon-add",
                onClick : function(){
                    console.log("dialog");
                    $("#ad").dialog({
                        width : 500,
                        height : 300,
                        href : "${pageContext.request.contextPath}/main/guruAdd.jsp",
                        buttons : "#ab",
                        modal : true,
                    });
                },
            });

            $("#ab1").linkbutton({
                text : "保存",
                iconCls : "icon-save",
                onClick : function(){
                    $("#gaf").form("submit",{
                        url : "${pageContext.request.contextPath}/guru/addGuru",
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

            // 删除操作
            $("#tb2").linkbutton({
                iconCls : "icon-add",
                onClick : function(){

                },
            });

            // 编辑操作
            $("#tb3").linkbutton({
                iconCls : "icon-edit",
                onClick : function(){
                    // 获取当前datagrid选中的数据
                    var rowDate = $("#dg").datagrid("getSelected");
                    console.log(rowDate);

                    $("#ad").dialog({
                        width : 500,
                        height : 300,
                        href : "${pageContext.request.contextPath}/main/guruModify.jsp",
                        buttons : [{
                            text : "保存",
                            iconCls : "icon-save",
                            onClick : function(){
                                $("#gmf").form("submit",{
                                    url : "${pageContext.request.contextPath}/guru/modifyGuru",
                                    success : function(){
                                        $("#ad").dialog("close");
                                    }
                                });
                                $('#dg').datagrid('reload');
                            },
                        },{
                            text : "取消",
                            iconCls : "icon-cancel",
                            onClick : function(){
                                $("#ad").dialog("close");
                            },
                        }],
                        modal : true,
                        onLoad : function(){
                            $("#gmf").form("load",rowDate);
                        },
                    });
                },
            });

            // 搜索框
            $('#ss').searchbox({
                searcher:function(value,name){
                    $("#dg").datagrid('load', {
                            searchName: name,
                            searchValue: value
                    });
                },
                menu:'#mm',
                prompt:'请输入值'
            });

            // 批量导入
            $("#tb4").linkbutton({
                iconCls : "icon-edit",
                onClick : function(){
                    $("#ad").dialog({
                        width : 500,
                        height : 300,
                        href : "${pageContext.request.contextPath}/main/guruBatch.jsp",
                        buttons : [{
                            text : "保存",
                            iconCls : "icon-save",
                            onClick : function(){
                                $("#guru_form").form("submit",{
                                    url : "${pageContext.request.contextPath}/guru/import",
                                    success : function(){
                                        $("#ad").dialog("close");
                                    }
                                });
                                $('#dg').datagrid('reload');
                            },
                        },{
                            text : "取消",
                            iconCls : "icon-cancel",
                            onClick : function(){
                                $("#ad").dialog("close");
                            },
                        }],
                        modal : true,
                    });
                },
            });

            $("#tb5").linkbutton({
                onClick : function(){
                    $("#tb5").attr("href","${pageContext.request.contextPath}/guru/export");
                }
            });

        });

    </script>

    <table id="dg"></table>

    <div id="tb">
        <a id="tb1">新增</a>
        <a id="tb2">删除</a>
        <a id="tb3">修改</a>
        <%-- 搜索框 --%>
        <input id="ss" />
        <div id="mm" style="width:120px">
            <div data-options="name:'guruName',iconCls:'icon-ok'">法名</div>
            <div data-options="name:'guruDescription'">简介</div>
        </div>
        <a id="tb4">批量导入</a>
        <a id="tb5">批量导出</a>
    </div>

    <div id="ad"></div>

    <div id="ab" style="display: none">
        <a id="ab1"></a>
        <a id="ab2"></a>
    </div>

    <div id="rd"></div>

    <div id="ed"></div>
