<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="register">
		<form action="create-account" method="post" >
		<table>
			<tr>
				<td>Email Id</td>
				<td> <input type="text" name="emailId" /></td>
			</tr>
			<tr>
				<td>First Name </td>
				<td> <input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td> <input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td> <input type="text" name="password" /></td>
			</tr>		
			<tr>
				<td>Verify Password</td>
				<td><input type="text" name="passwordVerification"/></td>
				<td><input type="hidden" name="socialMediaService" value="${loginMechanism}">  </td>
			</tr>
			<tr>
			<td colspan="2" align="center"><input type="submit" /></td>
			</tr>
		</table>
		</form>
</div>