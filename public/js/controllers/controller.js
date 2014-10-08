var pickemApp = angular.module('pickemApp', []);

pickemApp.controller('GameController', function ($scope) {
  $scope.games =
    [{"id":null,"homeId":null,"homeName":"packers","visitorId":null,"visitorName":"49ers"},{"id":null,"homeId":null,"homeName":"chiefs","visitorId":null,"visitorName":"lions"}];
});