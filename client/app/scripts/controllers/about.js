'use strict';

/**
 * @ngdoc function
 * @name springBootApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the springBootApp
 */
angular.module('springBootApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
