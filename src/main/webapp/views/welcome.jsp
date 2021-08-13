<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>
        欢迎界面
    </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="../background/css/main.css" media="all">
    <link rel="stylesheet" href="../background/css/bootstrap.css" media="all">
</head>
<body>
<style type="text/css">
    legend {
        display: block;
        width: 100px;
        border-bottom: 0px;
        font-family: "Microsoft YaHei", "Helvetica Neue";
    }

    legend a {
        color: #666;
    }

    legend a:hover {
        text-decoration: none;
    }

    .layui-table {
        font-family: "Microsoft YaHei", "Helvetica Neue";
    }
</style>
<div class="x-body">
    <blockquote class="layui-elem-quote">
        欢迎使用班级同学录管理系统！<span class="f-14">v4.0</span>
    </blockquote>

    <fieldset class="layui-elem-field layui-field-title site-title">
        <legend><a name="default">信息统计</a></legend>
    </fieldset>

    <!--相关统计-->
    <div class="row">
        <div class="col-sm-6">
            <section class="panel">
                <div class="panel-heading">各年级人数</div>
                <div class="panel-body">
                    <div class="echarts" id="area" style="height:300px; height:350px"></div>
                </div>
            </section>
        </div>
        <div class="col-sm-6">
            <section class="panel">
                <div class="panel-heading">各班级人数</div>
                <div class="panel-body">
                    <div class="echarts" id="main" style="height:300px; height:350px"></div>
                </div>
            </section>
        </div>


    </div>

    <script src="../background/lib/layui/layui.js" charset="utf-8"></script>
    <script src="../background/js/jquery.min.js"></script>
    <script src="../background/js/echarts.min.js"></script>

    <script type="text/javascript">
        $(function() {
            // 初始化
            var myChart = echarts.init(document.getElementById('main'));

            // 配置图标参数
            var options = {
                title: {
                    text: '班级人数',
                    show: true, // 是否显示标题
                    textStyle: {
                        fontSize: 18 // 标题文字大小
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow'
                    }
                },
                // X轴
                xAxis: {
                    data: [], // 异步请求时,这里要置空
                },
                // Y轴
                yAxis: {},
                series: [{
                    name: '班级人数',
                    type: 'bar', // 设置图表类型为柱状图
                    data: [], // 设置纵坐标的刻度(异步请求时,这里要置空)
                    itemStyle: {
                        normal: {
                            //这里是重点
                            color: function(params) {
                                //注意，如果颜色太少的话，后面颜色不会自动循环，最好多定义几个颜色
                                var colorList = ['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83', '#ca8622','#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83', '#ca8622','#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83', '#ca8622','#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83', '#ca8622'];
                                return colorList[params.dataIndex]
                            }
                        }
                    }
                }]
            };
            // 给图标设置配置的参数
            myChart.setOption(options);
            myChart.showLoading(); // 显示加载动画
            // 异步请求加载数据
            $.ajax({
                url: '${pageContext.request.contextPath}/classes/queryClassnum',
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    var names = [];
                    var nums = [];
                    $.each(data, function(index, obj) {
                        names.push(obj.Cname);
                        nums.push(obj.Amount);
                    })

                    myChart.hideLoading(); // 隐藏加载动画
                    myChart.setOption({
                        xAxis: {
                            data: names,
                        },
                        series: [{
                            name: '人数',
                            type: 'bar', // 设置图表类型为柱状图
                            data: nums // 设置纵坐标的刻度
                        }]
                    });
                }
            });
        });
    </script>

    <script type="text/javascript">
        $(function() {
            var myChart = echarts.init(document.getElementById('area'));
            var option = {
                title : {
                    text: '年级人数分布',
                    x:'center'
                },
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    data: []
                },
                series : [
                    {
                        name: '访问来源',
                        type: 'pie',
                        radius : '55%', // 饼状图的大小
                        center: ['50%', '60%'], // 饼状图的位置
                        data:[],
                        itemStyle: {
                            emphasis: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };
            myChart.setOption(option);
            myChart.showLoading(); // 显示动画

            $.ajax({
                url: '${pageContext.request.contextPath}/classes/queryGradenum',
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    var names = [];
                    var nums = [];
                    $.each(data, function(index, obj) {
                        names.push(obj.grade);
                        nums.push({name:obj.grade, value:obj.Num});
                    })

                    myChart.hideLoading(); // 隐藏加载动画
                    myChart.setOption({
                        legend: {
                            data: names
                        },
                        series: [{
                            name: '人数',
                            type: 'pie', // 设置图表类型为柱状图
                            data:  nums // 设置纵坐标的刻度
                        }]
                    });
                }
            });
        });
    </script>


</div>
<div class="layui-footer footer footer-demo">
    <div class="layui-main">
        <p>
            <a href="/">
                Copyright ©2021 zzy.com All Rights Reserved.
            </a>
        </p>

    </div>
</div>

</body>
</html>
