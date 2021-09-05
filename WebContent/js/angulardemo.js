 var app = angular.module("demoApp", []);
    app.controller("demoCtrl", function($scope,$http) {
        $scope.book = "The Alchemist";
        $scope.author = "Paulo Coelho";
        $scope.details=[]
        $http({
        	url : 'EmployeeController',
        	method:"GET"
        }).then(function(response){
        	console.log(response)
        	$scope.details = response.data
        	console.log($scope.details)
        	console.log(response.data)
        },function(response){
        	console.log(response)
        });
    });