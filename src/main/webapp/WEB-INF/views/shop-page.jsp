<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
<title>Shop-G&C Roasting Collective</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="home">G&C Roasting Collective</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor02" aria-controls="navbarColor02"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor02"
			bis_skin_checked="1">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="home">Home </a></li>
				<li class="nav-item active"><a class="nav-link" href="shop-page">Shop<span
						class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="login-page">Login</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="reg-page">Register</a></li>
				<li class="nav-item"><a class="nav-link" href="#">About</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

<br>
<h2>Browse Our Selection of G&C Merch</h2>
<br> <br>

<table class="table table-hover">
	<thead>
		<tr class="table-primary">
			<td><h6>Name</h6></td>
			<td><h6>Description</h6></td>
			<td><h6>Quantity</h6></td>
			<td><h6>Price</h6></td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${test }" var="item">
			<tr>
				<td>${item.name }</td>
				<td>${item.description }</td>
				<td>${item.quantity }</td>
				<td>${item.price }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>