
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
<style>
td {
	color: red;
	font-size: larger;
	padding: 10px;
}

input[type="text"] {
	border: double;
}

input[type="submit"] {
	font-size: smaller;
	border-radius: 6px;
	color: brown;
}
</style>
</head>
<body>

	<form action="CalculationServlet">
		<table>
			<tr>
				<td>First Number</td>
				<td><input type="text" name="num1"></td>
			</tr>

			<tr>
				<td>Second Number</td>
				<td><input type="text" name="num2"></td>
			</tr>
			<td><input class="btn" type="submit" name="add"></td>
		</table>
	</form>
</body>
</html>