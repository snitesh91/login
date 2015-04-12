<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login Demo</title>
	<link rel="stylesheet" href="resources/css/style.css" 
      type="text/css" media="screen, projection"></link>
<style>
body{ margin-top:20px; margin-bottom:20px; background-color:#DFDFDF;}
</style>
</head>
<body>
	<div class="container" style="border: #C1C1C1 solid 1px; border-radius:10px;">
		<!-- Header -->
		<tiles:insertAttribute name="header" />
		<!-- Body Page -->
		<div class="span-19 last">
			<tiles:insertAttribute name="body" />
		</div>
		<!-- Footer Page -->
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>