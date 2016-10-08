angular.module("vendas").controller("novoProdutoCtrl", function($scope, $http) {

	$scope.produtos = [];
	
	$scope.listarProduto = function() {
		$http.post("produto/listar").success(function(data) {
			$scope.produtos = data;
			console.log(data);
		});
	};

	$scope.novoProduto = function(produto) {
		$http.post("produto/salvar", produto).success(function(data) {
			console.log(data);
		this.listarProduto();
		});
	};
	
	$scope.editarProduto = function(produto) {
		alert(produto.nome);
	};
});
