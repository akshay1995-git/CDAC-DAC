import React, { Component } from 'react'
const person=(props)=>{
    return(
        <div align="left">
    <h2>{props.h}</h2>
    <p>{props.n}</p>
    <hr></hr>
        </div>
        )
}
export default person;