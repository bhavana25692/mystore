'use strict';

/**
 * @ngdoc overview
 * @name gmeApp
 * @description
 * # gmeApp
 *
 * Main module of the application.
 */
var app = angular.module('my-store',
  ['ui.router', 'ui.select', 'ui.bootstrap']
);

app.config(function ($stateProvider, $urlRouterProvider) {
  
  $stateProvider
    .state('app', {
        url: '/app',
        templateUrl: 'views/main.html',
    });

   $stateProvider
    .state('app.home', {
        url: '/home',
        templateUrl: 'views/home.html',
    });

  $urlRouterProvider.otherwise('/app/home');
});

app.constant('serverUrl', '');