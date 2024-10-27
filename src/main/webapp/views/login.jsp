<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<body>
	<form action="/Servlet/dang-nhap" method="post">
		<div class="container">
			<label for="username"><b>Username</b></label> <input type="text"
				id="username" name="username" placeholder="Enter Username"
				oninput="updateForgotPasswordLink()" required> <label
				for="password"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required>

			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="password"> Forgot <a href="/Servlet/quen-mat-khau"
				id="forgot-password-link">password?</a>
			</span>
		</div>

		<div class="container signin">
			<p>
				Don't have an account? <a href="/Servlet/dang-ki">Sign up</a>.
			</p>
		</div>
	</form>
</body>
</html>