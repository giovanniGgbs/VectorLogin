app.controller('loginController', function($scope, $http, $window, $location) {
    $scope.usuario = {
      		login: '',
    		senha: ''
    };
    
    $scope.usuarioLogin = '';
    
    $scope.login = function() {
       
    	var usuario = angular.toJson($scope.usuario);
    	
    	$http({
    	      method: 'POST',
    	      url: '/user/logar/',
    	      data: usuario,
    	      headers: {
                 'Content-Type': 'application/json'
              }
    	   }).then(function (response){
    		   var view = "user"
    		   $location.path(view);
    	   },function (error){
    		   console.log(error);
    	   });
    	
	};

});


app.controller('errorController', function($scope, $window) {
    $scope.messageError = "Você não está logado";
    
    $scope.voltar = function() {
    	$window.location.href = '/';
	}
});
