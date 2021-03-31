app.controller("detailsControllers", [
		"$scope", '$location', 'mainService', '$log', 'localStorageService', "$timeout", "toaster", "$rootScope", 
		function($scope, $location, mainService, $log, localStorageService, $timeout, toaster, $rootScope)
		{
			
			$log.info("---Inside detailsControllers---");
			
			
			
			$scope.addUser = function(data)
			{
				
				$scope.UserBean = {
						login : '',
						password:'',
						firstName:'',
						lastName:'',
						userRole:'USER',
						mailID:'',
						contactNumber:''
					}
				
				$scope.UserBean.login=document.getElementById("login").value;
				$scope.UserBean.password=document.getElementById("pwd").value;
				$scope.UserBean.firstName=document.getElementById("fname").value;
				$scope.UserBean.lastName=document.getElementById("lname").value;
				$scope.UserBean.mailID=document.getElementById("mail").value;
				$scope.UserBean.contactNumber=document.getElementById("cnt").value;
				
				
				
			mainService.addUser($scope.UserBean)
				.then(
						function(result) {
							
							$scope.addTrasaction=result;
							
							if(addTrasaction="success")
							{
							alert("User Added Done Successfully")
							}
						else
							{
							alert("Failure.. Kindly Check With DB ")
							}
							
						
							
							});

			}
			
			
			$scope.addGarage = function(data)
			{
				
				$scope.GarageBean = {
						name : '',
						owner:'',
						latitude:'',
						longitude:'',
						openAt:'',
						closedAt:'',
						address:'',
						rate:'',
						service:''
					}
				
				$scope.GarageBean.name=document.getElementById("name").value;
				$scope.GarageBean.owner=document.getElementById("owner").value;
				$scope.GarageBean.latitude=document.getElementById("latitude").value;
				$scope.GarageBean.longitude=document.getElementById("longitude").value;
				$scope.GarageBean.openAt=document.getElementById("openAt").value;
				$scope.GarageBean.closedAt=document.getElementById("closeAt").value;
				$scope.GarageBean.address=document.getElementById("address").value;
				$scope.GarageBean.rate=document.getElementById("rate").value;
				$scope.GarageBean.service=document.getElementById("service").value;
				
				
				
			mainService.addGarage($scope.GarageBean)
				.then(
						function(result) {
							
							$scope.addTrasaction=result;
							
							if(addTrasaction="success")
							{
							alert("Garage Added Done Successfully")
							}
						else
							{
							alert("Failure.. Kindly Check With DB ")
							}
							
						
						
							});

			}
			
			
			$scope.garageList = function()
			{
				
				
			mainService.garageList()
				.then(
						function(result) {
							$scope.garageList=result;
							
							});

			}
			
			$scope.userList = function()
			{
				
				
			mainService.userList()
				.then(
						function(result) {
							$scope.userList=result;
							
							});

			}
			
			
			
			
			$scope.distanceCalc = function(data)
			{
				
				$scope.RequestWrapper = {
						latitude1 : '',
						longitude1:'',
						latitude2:'',
						longitude2:''
					}
				
				$scope.RequestWrapper.latitude1=document.getElementById("lat1").value;
				$scope.RequestWrapper.longitude1=document.getElementById("lon1").value;
				$scope.RequestWrapper.latitude2=document.getElementById("lat2").value;
				$scope.RequestWrapper.longitude2=document.getElementById("lon2").value;
				
				
				
			mainService.distanceCalc($scope.RequestWrapper)
				.then(
						function(result) {
							
							$scope.distanceResult=result;
							
						
							
							});

			}
			
	
			
			$scope.garageList();
			$scope.userList();
			
		}
		
		

		

			
])
