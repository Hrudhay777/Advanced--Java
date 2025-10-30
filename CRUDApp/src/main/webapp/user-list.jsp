<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>User List</title></head>
<body>
<h2>User Management</h2>
<a href="new">Add New User</a><br><br>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Email</th><th>Country</th><th>Actions</th></tr>
<c:forEach var="user" items="${listUser}">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.email}</td>
<td>${user.country}</td>
<td>
<a href="edit?id=${user.id}">Edit</a> |
<a href="delete?id=${user.id}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>
