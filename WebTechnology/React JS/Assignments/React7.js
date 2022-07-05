import React, { Component } from 'react';

class NameInput extends Component {
    state = {
        fname: ' ',
        lname: ' '
    }
    btnHandler = (event) => {
        this.setState({
            fname: event.target.value,
            lname: event.target.value
        });
    }
    render() {
        return (
            <div align="left">
                FirstName:<input type="text" value={this.state.fname} name="fname"></input><br />

                LastName:<input type="text" value={this.state.lname} name="lname"></input><br />
                <button onClick={this.btnHandler}>Submit</button><br />
               FirstName:<h5>{this.state.fname}</h5>
               LastName:<h5>{this.state.fname}</h5>



            </div>
        );
    }
}
export default NameInput;