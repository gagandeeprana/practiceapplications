<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script type="text/javascript">
	var myapp = angular.module("myApp", []);
	//Controller Part
	myapp.controller("umcontroller", function($scope, $http) {

		//Initialize page with default data which is blank in this example
		$scope.employees = [];
		alert("1212");
		$scope.form = {
			id : "",
			name : "",
			email : ""
		};
		alert("1212");
		//Now load the data from server
		_refreshPageData();

		//HTTP POST/PUT methods for add/edit employee
		$scope.submitCustomer = function() {
			alert("DATA:: " + $scope.form);
			method = "POST";
			url = 'addCustomer';
			alert("check");
			$http({
				method : method,
				url : url,
				data : angular.toJson($scope.form),
				headers : {
					'Content-Type' : 'application/json'
				}
			}).then(function successCallback(response) {
				_success(response);
			});
		};
		/* _refreshPageData(); */
		//HTTP DELETE- delete employee by Id
		$scope.removeEmployee = function(employee) {
			$http({
				method : 'DELETE',
				url : 'employees/' + employee.id
			}).then(function successCallback(response) {
				$scope.employees = response.data;
			});
		};

		//In case of edit employee, populate form with employee data
		$scope.editEmployee = function(employee) {
			$scope.form.firstName = employee.firstName;
			$scope.form.lastName = employee.lastName;
			$scope.form.email = employee.email;
			$scope.form.id = employee.id;
		};

		/* Private Methods */
		//HTTP GET- get all employees collection
		function _refreshPageData() {
			$http({
				method : 'GET',
				url : 'getCustomers'
			}).then(function successCallback(response) {
				$scope.employees = response.data;
			}, function errorCallback(response) {
				console.log(response.statusText);
			});
		}

		function _success(response) {
			_refreshPageData();
			_clearForm()
		}

		function _error(response) {
			console.log(response.statusText);
		}

		//Clear the form
		function _clearForm() {
			$scope.form.firstName = "";
			$scope.form.lastName = "";
			$scope.form.email = "";
			$scope.form.id = -1;
		}
		;
	});
</script>
</head>
<body ng-app="myApp" ng-controller="umcontroller">
	<!-- 	<form action="/addCustomer" method="POST" enctype="application/x-www-form-urlencoded"> -->
	<form ng-submit="submitCustomer()">
		<table>
			<a href="getCustomers.html">Customers</a>
			<a href="Update.html">Update</a>
			<a href="Delete.jsp">Delete</a>
			<tr>
				<th>Id</th>
				<td><input type="text" name="id" ng-model="form.id" /></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" name="name" ng-model="form.name" /></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input type="text" name="email" ng-model="form.email" /></td>
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

			<tr ng-repeat="c in employees">
				<td>{{c.id}}</td>
				<td>{{c.name}}</td>
				<td>{{c.email}}</td>
			</tr>
		</table>
	</form>
</body>
</html>
