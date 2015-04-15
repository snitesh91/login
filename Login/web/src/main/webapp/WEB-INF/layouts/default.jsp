<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login Demo</title>
	<link rel="stylesheet" href="resources/css/style.css" type="text/css" media="screen, projection"></link>
</head>
<body>
	<div id="wrapper">
		<!-- Header -->
		<tiles:insertAttribute name="header" />
		<!-- Body Page -->
		<tiles:insertAttribute name="body" />
		<!-- Footer Page -->
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>