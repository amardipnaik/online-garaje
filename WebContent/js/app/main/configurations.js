app.config(function($routeProvider, $locationProvider)
{
	/*alert("config called");*/
	$routeProvider.when('/', {
		templateUrl : 'views/myProfile.jsp',
		controller : 'detailsControllers'
	})
	.when('/aboutUs.htm', {
		templateUrl : 'views/aboutUs.jsp',
		controller : 'detailsControllers'
	}).when('/viewUser.htm', {
		templateUrl : 'views/viewUser.jsp',
		controller : 'detailsControllers'
	}).when('/viewGarage.htm', {
		templateUrl : 'views/viewGarage.jsp',
		controller : 'detailsControllers'
	}).when('/addUser.htm', {
		templateUrl : 'views/addUser.jsp',
		controller : 'detailsControllers'
	}).when('/addGarage.htm', {
		templateUrl : 'views/addGarage.jsp',
		controller : 'detailsControllers'
	}).when('/distanceApi.htm', {
		templateUrl : 'views/distanceApi.jsp',
		controller : 'detailsControllers'
	}).when('/myProfile.htm', {
		templateUrl : 'views/myProfile.jsp',
		controller : 'detailsControllers'
	})
	
});

