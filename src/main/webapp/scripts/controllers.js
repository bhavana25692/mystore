app.controller('ContainerCtrl', ['$scope', '$rootScope', '$state',

    function($scope, $rootScope, $state, StoreService){

        $scope.showSelectQty = false;
        $scope.qty = 0;
        $scope.disableAdd = false;
        $scope.selectedProducts = {};

        $scope.addItem = function($index) {
            $scope.qty = $scope.qty + 1;
            if($scope.qty == 10) {
                $scope.disableAdd = true;
            }
            $scope.productList[$index].quantity = $scope.qty;
        }

        $scope.removeItem = function($index) {
            $scope.qty = $scope.qty - 1;
            if($scope.qty == 0) {
                $scope.showSelectQty = false;
            }
        }

        $scope.showAddRemove = function() {
            $scope.qty = 0;
            $scope.showSelectQty = true;
        }

        $scope.showSelectedProducts = function() {
            $scope.selectedProducts = {

            }
        }

        $scope.openBillModal = function () {

        }

        $scope.init = function(StoreService) {
//            StoreService.getProductList()
//                .then(function(resp) {
//                    resp = angular.copy($scope.productList);
//                }, function(error) {
//                    console.log(error);
//                    $scope.error = error.data.message;
//             });
        };

        $scope.init();
	
}]);
