Vue.component("aaa",{
	template:'<form :action="act">账号：<input name="username" :value="un"><br>密码：<input name="password" :value="pwd"><br><input type="submit" value="登陆"></form>'
	,
	// 设置属性列表
	props:["un","pwd","act"]

});