app.controller('ContainerCtrl',

    function($scope, $rootScope, $state, StoreService, $timeout){

        $scope.showSelectQty = [];
        $scope.disableAdd = [];
        $scope.selectedProducts = [];
        $scope.productList = [];
        $scope.billingProducts = [];
        $scope.showBillView = false;

        $scope.addItem = function($index) {
            var productAdded = ++$scope.productList[$index].quantity; //Increment product qty
            if(productAdded == 10) {
                $scope.disableAdd[$index] = true;
            }
            $scope.showSelectQty[$index] = true;
        };

        $scope.removeItem = function($index) {
            var productAdded = --$scope.productList[$index].quantity; //Decrement product qty
            if(productAdded == 0) {
                $scope.showSelectQty[$index] = false;
            } else if(productAdded < 10) {
                $scope.disableAdd[$index] = false;
            }
        };

        $scope.constructRequestBody = function() {
            angular.forEach($scope.productList, function(product){
                if(product.quantity > 0) {
                    var billingProduct = {};
                    billingProduct.product = {};
                    billingProduct.product.id = product.id;
                    billingProduct.product.name = product.name;
                    billingProduct.product.barCode = product.barCode;
                    billingProduct.product.category = product.category;
                    billingProduct.product.rate = product.rate;
                    billingProduct.quantity = product.quantity;
                    billingProduct.tax = 0;
                    billingProduct.costAmount = 0;
                    $scope.billingProducts.push(billingProduct);
                }
            });
            $timeout(function(){
                $scope.getBill();
            },500);
        };

        $scope.getBill = function() {
            StoreService.getBill($scope.billingProducts)
                .then(function (resp) {
                    $scope.billData = resp.data;
                    $scope.showBillView = true;
                },function (error) {
                    console.log(error);
                    $scope.error = error.data.message;
                });
        };

        $scope.init = function() {
           StoreService.getProductList()
               .then(function(resp) {
                   $scope.productList = angular.copy(resp.data);
               }, function(error) {
                   console.log(error);
                   $scope.error = error.data.message;
            });
        };

        $scope.init();
	
});
