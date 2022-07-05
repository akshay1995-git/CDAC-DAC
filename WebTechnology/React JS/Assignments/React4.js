import React, { Component } from 'react'
class Person4 extends Component {
        
         render(){
     const arr=[{id:101,name:"Rahul",salary:40000},
            {id:101,name:"Akshay",salary:35000},
            {id:101,name:"Akash",salary:49000},
            {id:101,name:"Kumar",salary:27000}]
     const newarr=arr.map(ar=>(
         <tr>
             <td>{ar.id}</td>
             <td>{ar.name}</td>
             <td>{ar.salary}</td>
         </tr>
     ))
    
         return(
             <div>
                 <h1>Employ Data:</h1>
                 <table border="2px">
                     <tr><th>Id</th><th>Employ name</th><th>Salary</th></tr>
                   {newarr}
                 </table>
             </div>
         )
         }

}
export default Person4;