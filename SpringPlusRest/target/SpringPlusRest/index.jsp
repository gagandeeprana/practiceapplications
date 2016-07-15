<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
<script type="text/javascript">
	var helloApp = angular.module("helloApp", []);
	//alert("3245234");
	helloApp.controller("studentController", [ '$scope', '$http',
			function($scope, $http) {
				$http({
					method : 'GET',
					url : '/user/'
				}).success(function(data, status, headers, config) {
					$scope.profiles = data;
				}).error(function(data, status, headers, config) {
					alert("failure");
				});
			} ]);
</script>
</head>
<body ng-app="helloApp" ng-controller="studentController">
	<form action="/addCustomer" method="POST"
		enctype="application/x-www-form-urlencoded">

		<table>
			<a href="getCustomers.html">Customers</a>
			<a href="Update.html">Update</a>
			<a href="Delete.jsp">Delete</a>
			<tr>
				<th>Id</th>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
			</tr>

			<tr ng-repeat="c in events">
				<td>{{c.id}}</td>
				<td>{{c.name}}</td>
				<td>{{c.email}}</td>
			</tr>
		</table>
	</form>
</body>
</html>
