import { render } from '@testing-library/react';
import React from 'react';
var person=(props)=>{
    
    return (<div>
    <h1> {props.sname} {props.age}</h1>
    <h1>{props.children}</h1>
    
    </div>);
  
}
export default person;