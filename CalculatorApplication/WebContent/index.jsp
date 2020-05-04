<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<h2>Calculator</h2>
<form method="post" action="calculations">

 <table >    
         <tr>    
          <td>FirstNumber</td>   
          <td><input type="text" name="firstNumber" value=${firstNumber}></input></td>  
         </tr>
         <tr>    
          <td>SecondNumber</td>   
          <td><input type="text" name="secondNumber" value=${secondNumber}></input></td>  
         </tr>
          <tr>    
          <td colspan=2 align="center">
          <input type="submit" value="   +   " name="operation"/>   
          <input type="submit" value="   -   "  name="operation"/>
          <input type="submit" value="   *   " name="operation"/>  
          <input type="submit" value="   /   " name="operation"/>
          </td>
         </tr>      
</table>



      <h2>${result} </h2>

</form>