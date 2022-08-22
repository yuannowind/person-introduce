package com.love.introduce

data class Person(
    var name: String,       //姓名
    var school: String,     //学校
    var department: String,     //部门 1安卓 2ios 3后端 4前端
    var home: String,       //家乡
    var hobby: String,       //爱好
    var info: String,       //座右铭
    var photo: Int,           //照片
    var type: Int, //1 主页 2 普通页面
)