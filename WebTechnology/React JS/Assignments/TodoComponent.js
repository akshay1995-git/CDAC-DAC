
import {Component} from 'react';

class TodoComponent extends Component
{

    state = {
        todos : [],
        index : 1,
        message: ""
    }

    addTodo = (event)=>{
        event.preventDefault();
        //let todo = {id:Math.round(Math.random()*1000),description:event.target.input.value};
        let todo = {id:this.state.index,description:event.target.input.value};
        this.state.todos.push(todo);
        this.setState({
            todos : this.state.todos,
            index:this.state.index+1,
            message : "Todo added successfully"
        });        
    }


    removeTodo = (id)=>{
        
        let newtodos = this.state.todos.filter(todo=>todo.id!=id);

        this.setState({
            todos : newtodos,
            message : "Todo removed successfully"
        });
    }


    render()
    {
        let contents = this.state.todos.map(todo=><p key={todo.id} onClick={()=>{
            this.removeTodo(todo.id);
        }}>{todo.description}</p>);

        let msg = this.state.message=="" ? "" : <label className="alert alert-info">{this.state.message}</label>

        return (
            <div>
                <h1>Todo</h1>

                {msg}

                <form onSubmit={this.addTodo}>
                    <input type="text" name="input" className="form-control"></input>
                    <button className="btn btn-info">add todo</button>
                </form>

                <div>
                    {contents}
                </div>

            </div>
        )
    }    
}

export default TodoComponent