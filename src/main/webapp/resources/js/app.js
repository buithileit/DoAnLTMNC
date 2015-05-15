'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', [ 'AngularSpringApp.filters',
		'AngularSpringApp.services', 'AngularSpringApp.directives' ]);

// Declare app level module which depends on filters, and services
App.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/TimKiem', {
		templateUrl : 'TimKiem/layout',
	});
	$routeProvider.when('/PhimBo', {
		templateUrl : 'PhimBo/layout',
	});
	$routeProvider.when('/TimBo', {
		templateUrl : 'PhimBo/HimBo',
	});
	$routeProvider.when('/PhimLe', {
		templateUrl : 'PhimLe/layout',
	});
	$routeProvider.when('/PhimXemNhieu', {
		templateUrl : 'PhimXemNhieu/layout',
	});

	$routeProvider.when('/CaNhan', {
		templateUrl : 'CaNhan/layout',
	});
	$routeProvider.when('/DangNhap', {
		templateUrl : 'User/layout',
	});
	$routeProvider.when('/DangKy', {
		templateUrl : 'User/layout',
	});
	$routeProvider.otherwise({
		redirectTo : '/PhimBo'
	});
} ]);

//controller

angular.module('loginApp', ['common',  'editableTableWidgets'])  
.controller('LoginCtrl', function ($scope, UserService) {

    $scope.onLogin = function () {
        console.log('Attempting login with username ' + $scope._email + ' and password ' + $scope._pass);

        if ($scope.form.$invalid) {
            return;
        }

        UserService.login($scope._email, $scope._pass);

    };

});

//service

angular.module('frontendServices', [])  
.service('UserService', ['$http','$q', function($http, $q) {
    return {
        getUserInfo: function() {
            var deferred = $q.defer();

            $http.get('/User/login')
                .then(function (response) {
                    if (response.status == 200) {
                        deferred.resolve(response.data);
                    }
                    else {
                        deferred.reject('Error retrieving user info');
                    }
            });

            return deferred.promise;
        }
    }
}]);
    

