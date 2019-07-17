app.service('StoreService', function($http, serverUrl) {

	this.getProductList = function() {
		return $http({
			method : 'GET',
			url : 'productlist.json'
		});
	};

});
