var app = angular.module('demoapp',[])
app.controller("logingCtrl",function($scope,$http,$window){
	$scope.name ="soundarrajanaa"
	
		$scope.login = function(){
		console.log($scope.username)
		console.log($scope.password)
		$scope.data = {username:$scope.username ,password: $scope.password}
		 $http({
		        method: 'POST',
		        url: 'Login',
		        headers: {'Content-Type': 'application/json'},
		        data: {
	                'username' : $scope.username
	            }
		        }).success(function (data){
		           console.log(data)
		           $window.location.href = "landingPage.html";
		        }).error(function(data, status, headers, config) {
		            alert("error")
		       });

			
	}
		
})