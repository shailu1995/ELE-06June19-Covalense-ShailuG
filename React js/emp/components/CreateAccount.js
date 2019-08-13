
import React, { Component } from 'react'
import Axios from 'axios';

export class CreateAccount extends Component {
    constructor(props){
        super(props)
        this.state={
            name:'',
            email:'',
            phoneno:'',
            password:''
        }
        this.postData=this.postData.bind(this);
    }
    postData(event){
        event.preventDefault();
        console.log("Post Data",this.state);
        let accountData=this.state;
        Axios.post('https://emp-application-5f669.firebaseio.com/accounts.json',accountData).then((response)=>{
console.log("Response object",response);
this.setState({
    name:'',
    email:'',
    phoneno:'',
    password:''
})
        })
        .catch((error)=>{
            console.log("Error",error)
        })
        
       
    }
    render() {
        return (
            <div>
                <form onSubmit={this.postData} style={{marginRight:500,marginLeft:200,marginTop:50}}>
                    <div className="row">
                        <div className="col">
                            <input type="text" onChange={(event)=>{
                                this.setState({
                                    name:event.target.value
                                    })
                                     }}
                                    value={this.state.name} className="form-control" placeholder="Name" />

                        </div>
                        <div className="col">
                            <input type="text" onChange={(event)=>{
                                this.setState({
                                    email:event.target.value
                                    })
                                     }} 
                                     value={this.state.email} className="form-control" placeholder="Email " validations={[required]} />

                        </div>
                    </div>
                    <div className="row">
                        <div className="col">
                            <input type="text" onChange={(event)=>{
                                this.setState({
                                    phoneno:event.target.value
                                    })
                                     }} 
                                     value={this.state.phoneno} className="form-control" type='number' placeholder="phone no"/>

                        </div>
                        <div className="col">
                            <input type="text" onChange={(event)=>{
                                this.setState({
                                    password:event.target.value
                                    })
                                     }} 
                                     value={this.state.password} className="form-control" placeholder="password " validations={[required]}/>

                        </div>
                        <div>
                        <button style={{marginRight:500,marginLeft:200}}
                        className type="submit" className="btn btn-primary" >submit</button>
                        </div>
                    </div>
                </form>
            </div>
        )
    }
}

export default CreateAccount
