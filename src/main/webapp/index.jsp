<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<h2>赵嘉</h2>
<a href="/test1?id=1">test1</a>

<a href="/post?pageNum=0&pageSize=10">post</a>
</body>
<form action="/doComment">
    userid:<input name="userid"/><br />
    username:<input name="username"><br />
    context:<input name="context"><br />
    postid:<input name="postid">
    <input type="submit">
</form>
</html>
