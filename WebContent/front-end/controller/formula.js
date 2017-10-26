var formulaModulo = angular.module('formulaModulo',[]);

formulaModulo.controller("formulaController",function($scope){
	$scope.formula = [
		{codigo:1, nome: 'Neri Neitzke', email: 'neiri@gmail.com',fone: '54 3236 5400'},
		{codigo:2, nome: 'Renato Vasconcellos', email: 'renatinhotsw@gmail.com',fone: '34 3262 9145'},
		{codigo:3, nome: 'João José', email: 'joao@gmail.com',fone: '34 3268 7149'}
	];
});