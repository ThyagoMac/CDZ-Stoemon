//modulo principal
var appCdz = angular.module('cdzmod',['ngRoute']);

appCdz.config(function($routeProvider, $locationProvider){

    $locationProvider.html5Mode(true);
    
	$routeProvider.when("/home", {
		templateUrl:'./view/home.html',
		controller: 'HomeController',
		controllerAs: 'vm'
	});
	
	$routeProvider.otherwise({
	    redirectTo: '/home'
	});
});


