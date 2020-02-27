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
<title>Session</title>
</head>
<body class="bg-${preferences.theme}">

	<%@ include file="partials/header.jsp"%>

	<main>
		<section class="container-fluid bg-light">
			<div>
				<h1>Session ID</h1>
				<p>${ sessionID }</p>
				<p>${preferences.name}</p>
				<p>${preferences.theme}</p>

			</div>
		</section>

		<section class="container">

			<form method="post">
				<label>Enter name:</label> <input type="text" name="name"> <label>Theme:</label>
				<input type="radio" name="theme" value="light"><label>Light</label>
				<input type="radio" name="theme" value="dark"><label>Dark</label>
				<button type="submit">Go</button>

			</form>


		</section>

	</main>
</body>
</html>