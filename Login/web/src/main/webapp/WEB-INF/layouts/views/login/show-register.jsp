<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="register">
		<form action="create-account" method="post" >
		<table>
			<tr>
				<td>User Name </td>
				<td> <input type="text" name="userName" /></td>
			</tr>		
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
			<td colspan="2" align="center"><input type="submit" /></td>
			</tr>
		</table>
		</form>
</div>