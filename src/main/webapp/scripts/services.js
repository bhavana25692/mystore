app.service('StoreService', function($http) {

	this.getProductList = function() {
		return $http({
			method : 'GET',
			url : "http://localhost:8080/mystore/rest/products/productList"
		});
	};

	this.getBill = function(productList) {
		return $http({
			method : 'POST',
			url : "http://localhost:8080/mystore/rest/billing/getBill",
			data : productList
		});
	};


});
