<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset password</title>
</head>
<body>
<form method="post" action="/Servlet/quen-mat-khau">

	${username}
	
	<label for="newPassword">New Password:</label> 
	<input type="password" id="newPassword" name="newPassword" title="New password" /> 
	<label for="confirmPassword">Confirm Password:</label> 
	<input type="password" id="confirmPassword" name="confirmPassword" title="Confirm new password" />
	
	<p class="form-actions">
		<input type="submit" value="Change Password" title="Change password" />
	</p>
</form>
</body>
</html>