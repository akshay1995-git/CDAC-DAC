import React, { Component } from 'react';
import './React3.css'
const person=(props)=>{
    return(
        <div align="left">
    <h2 className="c">{props.h}</h2>
    <p>{props.n}</p>
    <hr></hr>
        </div>
        )
}
export default person;