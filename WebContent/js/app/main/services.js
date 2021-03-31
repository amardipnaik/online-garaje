app.factory(
				"mainService",
				function($http, $log, toaster, $location) {
					var isDisabled = "";

					return {
						setDisableButtonsOnRowClick : function(data) {
							isDisabled = data;
						},
						getDisableButtonsOnRowClick : function() {
							return isDisabled;
						},
						addUser : function(data) {

	                       	 
							var promise = $http({
								url : "addUserBean",
								method : "POST",
								data : JSON.stringify(data)
							}).success(
									function(data, status, header, config,
											statusText) {
									}).error(
									function(data, status, header, config,
											statusText) {
										if (!status === 901)
											toaster.pop('error', status,
													statusText);
									
									}).then(function(response) {
								/*console.log("-------In role Service Reponce-------",response);*/
								return response.data;
							})
							return promise;
						}
						,
						addGarage : function(data) {

	                       	 
							var promise = $http({
								url : "addGarageBean",
								method : "POST",
								data : JSON.stringify(data)
							}).success(
									function(data, status, header, config,
											statusText) {
									}).error(
									function(data, status, header, config,
											statusText) {
										if (!status === 901)
											toaster.pop('error', status,
													statusText);
									
									}).then(function(response) {
								/*console.log("-------In role Service Reponce-------",response);*/
								return response.data;
							})
							return promise;
						}
						,userList : function(data) {

                        	 
							var promise = $http({
								url : "userList",
								method : "GET",
								data : JSON.stringify(data)
							}).success(
									function(data, status, header, config,
											statusText) {
									}).error(
									function(data, status, header, config,
											statusText) {
										if (!status === 901)
											toaster.pop('error', status,
													statusText);
									}).then(function(response) {
								/*console.log("-------In role Service Reponce-------",response);*/
								return response.data;
							})
							return promise;
						}
						,garageList : function(data) {

                       	 
							var promise = $http({
								url : "garageList",
								method : "GET",
								data : JSON.stringify(data)
							}).success(
									function(data, status, header, config,
											statusText) {
									}).error(
									function(data, status, header, config,
											statusText) {
										if (!status === 901)
											toaster.pop('error', status,
													statusText);
									}).then(function(response) {
								/*console.log("-------In role Service Reponce-------",response);*/
								return response.data;
							})
							return promise;
						},distanceCalc : function(data) {

                       	 
							var promise = $http({
								url : "distanceCalc",
								method : "POST",
								data : JSON.stringify(data)
							}).success(
									function(data, status, header, config,
											statusText) {
									}).error(
									function(data, status, header, config,
											statusText) {
										if (!status === 901)
											toaster.pop('error', status,
													statusText);
									}).then(function(response) {
								/*console.log("-------In role Service Reponce-------",response);*/
								return response.data;
							})
							return promise;
						}
		        		
					}
				});

				
app.factory("sharedProperties", function($http, $log, toaster, $location) {
	var property = null;

	return {
		getProperty : function() {
			return property;
		},
		setProperty : function(value) {
			property = value;
		}
	};
});