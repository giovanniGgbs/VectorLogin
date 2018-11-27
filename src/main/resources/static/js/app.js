var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider, $locationProvider){
    
	$locationProvider.hashPrefix('');
	
	$routeProvider
        .when('/',{
            templateUrl: '/views/form.html',
            controller: 'loginController'
        })
        .when('/user',{
            templateUrl: '/views/user.html',
            controller: 'loginController',
        })
        .when('/error',{
            templateUrl: '/views/error.html',
            controller: 'errorController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

