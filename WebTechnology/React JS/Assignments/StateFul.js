import React ,{Component} from 'react';
class StateFul extends Component{
    state={person:[
        {name:"Akshay",age:"27"},
        {name:"Akash",age:"25"}
    ]};
    render(){
        return(
            <div>
            <h1>Name:{this.state.person[0].name}</h1>
            <h1>Age:{this.state.person[0].age}</h1>
            <h1>Name:{this.state.person[1].name}</h1>
            <h1>Age:{this.state.person[1].age}</h1>
        
            </div>
        );
    }
}
export default StateFul;
