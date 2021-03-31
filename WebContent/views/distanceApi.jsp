<!DOCTYPE html>
<html>
<body>


  <h1>Distance API Calculation Demo</h1>
  
   <b> Latitude 1:</b>
     <input type="text" name="amt" id="lat1" />
      <b> Longitude 1:</b>
     <input type="text" name="amt" id="lon1" /><br>
      <b> Latitude 2:</b>
     <input type="text" name="amt" id="lat2" />
      <b> Longitude 2:</b>
     <input type="text" name="amt" id="lon2" /><br><br>

<button ng-click="distanceCalc()">Calculate Distance</button><br><br>
<h3><b> Result In KM :{{distanceResult}} </b><h3>
</body>
</html>
