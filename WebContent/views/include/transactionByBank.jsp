<h2>View Transaction By Bank Name</h2>

   <b>   Select Bank Name:</b>
<select name="bankName"  id="bankName">
     <option>SBI Bank</option>
     <option>Kotak Bank</option>
     <option>ICICI Bank</option>
      <option>Axis Bank</option>
       <option>HDFC Bank</option>
</select>
<br>
 <button ng-click="trasactionByBank()">View Transaction</button>
 
 
 
 
 <table>
<th>Sr.No</th>
<th>Bank Name</th>
<th>amount</th>
<th>User Account Number</th>
<th>Benificiary Account Number</th>
<th>Benificiary IFSC Code</th>
<th>Trasaction Date</th>

  <tr ng-repeat="x in trasactionByBank">
     <td>{{ $index + 1 }}</td>
    <td>{{ x.bankName }}</td>
        <td>{{ x.amount}}</td>
        <td>{{ x.userAccountNumber}}</td>
         <td>{{ x.benificiaryAccountNumber}}</td>
         <td>{{ x.benificiaryIFSCCode}}</td>
          <td>{{ x.trasactionDate}}</td>
         
      
     
  </tr>
</table>