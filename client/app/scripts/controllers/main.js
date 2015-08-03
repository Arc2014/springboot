'use strict';

/**
 * @ngdoc function
 * @name springBootApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the springBootApp
 */
angular.module('springBootApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
