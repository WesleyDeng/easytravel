<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Easytravel - logistics services</title>
</head>
<body>
	<h1>Easytravel - logistics services</h1>
	<table>
		<tr>
			<td>Service</td>
			<td>URI</td>
			<td>Example</td>
		</tr>
		<tr>
			<td>Flights</td>
			<td>http://logisticseasytravel.cfapps.io/services/flights/
				{lat}/{lng}</td>
			<td><a href=" http://logisticseasytravel.cfapps.io/services/flights/41.3857/2.1699">Barcelona (41.3857, 2.1699)</a></td>
		</tr>
		<tr>
			<td>Hotels</td>
			<td>http://logisticseasytravel.cfapps.io/services/hotels/
				{lat}/{lng}</td>
		<td><a href=" http://logisticseasytravel.cfapps.io/services/hotels/41.3857/2.1699">Barcelona (41.3857, 2.1699)</a></td>
		</tr>
		<tr>
			<td>Timezone</td>
			<td>http://logisticseasytravel.cfapps.io/services/timezone/
				{lat}/{lng}</td>
			<td><a href=" http://logisticseasytravel.cfapps.io/services/timezone/41.3857/2.1699">Barcelona (41.3857, 2.1699)</a></td>
		</tr>
		<tr>
			<td>Address</td>
			<td>http://logisticseasytravel.cfapps.io/services/address/
				{lat}/{lng}</td>
			<td><a href=" http://logisticseasytravel.cfapps.io/services/address/41.3857/2.1699">Barcelona (41.3857, 2.1699)</a></td>
		</tr>
	</table>
</body>
</html>