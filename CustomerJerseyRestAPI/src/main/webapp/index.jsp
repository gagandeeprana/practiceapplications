<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script type="text/javascript">
	var myapp = angular.module("myApp", []);
	myapp
			.controller(
					"umcontroller",
					function($scope, $http) {
						$scope.employees = [];
						$scope.form = {
							id : "",
							name : "",
							email : ""
						};
						_refreshPageData();
						$scope.check = "";
						$scope.submitCustomer = function() {
							if ($scope.form.check == "check") {
								method = "PUT";
								url = 'http://localhost:8088/CustomerJerseyRestAPI/rest/customer/updateCustomer/id/'
										+ $scope.form.id
										+ "/name/"
										+ $scope.form.name
										+ "/email/"
										+ $scope.form.email;
							} else {
								method = "POST";
								url = 'http://localhost:8088/CustomerJerseyRestAPI/rest/customer/addCustomer';
							}
							$http({
								method : method,
								url : url,
								data : angular.toJson($scope.form),
								headers : {
									'Content-Type' : 'application/json'
								}
							}).then(function successCallback(response) {
								$scope.form.check = "";
								_success(response);
							}, function errorCallback(response) {
								alert("ERROE:: " + response);
							});
						};
						$scope.removeEmployee = function(employee) {
							$http(
									{
										method : 'DELETE',
										url : 'http://localhost:8088/CustomerJerseyRestAPI/rest/customer/delCustomer/id/'
												+ employee.id
									}).then(function successCallback(response) {
								_success(response);
							}, function errorCallback(response) {
								alert("ERROE:: " + response);
							});
						};

						$scope.editEmployee = function(employee) {
							$scope.form.name = employee.name;
							$scope.form.email = employee.email;
							$scope.form.id = employee.id;
							$scope.form.check = "check";
						};
						function _refreshPageData() {
							$http(
									{
										method : 'GET',
										url : 'http://localhost:8088/CustomerJerseyRestAPI/rest/customer/getCustomers/'
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
						function _clearForm() {
							$scope.form.name = "";
							$scope.form.email = "";
							$scope.form.id = "";
						}

						$scope.clearForm = function() {
							_clearForm();
						}
					});
</script>
</head>
<body ng-app="myApp" ng-controller="umcontroller">

	<div class="generic-container" ng-controller="umcontroller">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span class="lead">Usermaintenance</span>
			</div>
			<div class="formcontainer">
				<form ng-submit="submitCustomer()">
					<div class="row">
						<input type="hidden" ng-model="form.id" /> <input type="hidden"
							ng-model="form.check" />
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="id">Id</label>
							<div class="col-md-7">
								<input type="text" ng-model="form.id" name="id"
									class="username form-control input-sm"
									placeholder="Enter your Id" required ng-minlength="1" />

							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="name">Name</label>
							<div class="col-md-7">
								<input type="text" ng-model="form.name" id="name"
									class="username form-control input-sm"
									placeholder="Enter your name" required ng-minlength="3" />

							</div>
						</div>
					</div>


					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="email">Email</label>
							<div class="col-md-7">
								<input type="text" ng-model="form.email" id="email" name="email"
									class="form-control input-sm"
									placeholder="Enter your Email [This field is validation free]" />
							</div>
						</div>
					</div>



					<div class="row">
						<div class="form-actions floatRight">
							<input type="submit" value="{{!form.check ? 'Add' : 'Update'}}"
								class="btn-sm" ng-disabled="myForm.$invalid">
							<button type="button" ng-click="clearForm()"
								class="btn-sm">Reset Form</button>
						</div>
					</div>

				</form>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<span class="lead">Users</span>
			</div>
			<div class="tablecontainer">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID.</th>
							<th>Name</th>
							<th>Email</th>
							<th width="20%"></th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="u in employees">
							<td><span ng-bind="u.id"></span></td>
							<td><span ng-bind="u.name"></span></td>
							<td><span ng-bind="u.email"></span></td>
							<td>
								<button type="button" ng-click="editEmployee(u)"
									class="btn btn-success custom-width">Edit</button>
								<button type="button" ng-click="removeEmployee(u)"
									class="btn btn-danger custom-width">Remove</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>
