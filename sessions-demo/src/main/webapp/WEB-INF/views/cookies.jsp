<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<meta charset="ISO-8859-1">
<title>Cookies</title>
</head>
<body>

	<%@ include file="partials/header.jsp"%>


	<main>
		<section class="container-fluid">
			<h2 class="display-4">Cookies!</h2>



		</section>

		<section class="container">
			<p>${ cookieCount }</p>
			<a class="btn" href="/cookie/add">Add</a> <a class="btn btn-warning"
				href="/cookie/clear">Clear</a>

		</section>


	</main>



</body>
</html>