import React, { Component } from 'react'
import Axios from 'axios';
import {Modal,Button} from 'react-bootstrap'

export class ViewAccounts extends Component {
    constructor(props) {
        super(props)
        this.state = {
            accounts: [],
            show:false,
            name:'',
            email:'',
            phoneno:'',
            password:'',
            id:''
        }
    }
    componentDidMount() {
        Axios.get('https://emp-application-5f669.firebaseio.com/accounts.json')
            .then((response) => {
                console.log("Response Data", response);
                let fetchedAccounts = [];
                for (let key in response.data) {
                    //console.log(response.data[key])
                    fetchedAccounts.push({
                        ...response.data[key],
                        id: key
                    })
                }
                this.setState({
                    accounts: fetchedAccounts
                })
                console.log("Fetched Accounts", this.state.accounts)
            }).catch((error) => {
                console.log("Error", error)
            })
    }
    deleteAccount(account) {
        Axios.delete('https://emp-application-5f669.firebaseio.com/accounts/' + account.id + '/.json')
            .then((response) => {
                alert("deleted successfully!!!")
                let allAccounts = this.state.accounts;
                let index = allAccounts.indexOf(account);
                let newAccounts = allAccounts.splice(index, 1);
                console.log('new accounts', newAccounts);
                console.log('new accounts', allAccounts);
                this.setState({
                    accounts: allAccounts
                })
            })
            .catch((error) => {
                alert("deletion failed!")
            });

    }
    editAccount(account){
        this.setState({
            name:account.name,
            email:account.email,
            phoneno:account.phoneno,
            password:account.password,
            id:account.id,
            show: !this.state.show
        })
    }
handleClose(){
    this.setState({
        show: !this.state.show
    })

}
updateAccountData(){
const{id,name,email,password,phoneno}=this.state;
const account={name,email,phoneno,password}
console.log('Account Data',account);
Axios.put('https://emp-application-5f669.firebaseio.com/accounts/'+id+'/.json',account).then((response)=>{
    console.log("updated successfully");
this.handleClose()
}).catch((error)=>{
    console.log("error",error)
})
}



    render() {
        return (
            <div>
                <table class="table table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone num</th>
                            <th scope="col">Password</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.accounts.map((account) => {
                                return <tr key={account.id}>
                                    <td>{account.name}</td>
                                    <td>{account.email}</td>
                                    <td>{account.phoneno}</td>
                                    <td>{account.password}</td>
                                    <td>
                                        <button onClick={this.deleteAccount.bind(this, account)}
                                            className="btn btn-danger">Delete</button>
                                    </td>
                                    <td>
                                        <button onClick={this.editAccount.bind(this, account)}
                                            className="btn btn-success">Edit</button>
                                    </td>
                                </tr>
                            })
                        }
                    </tbody>
                </table>
                <div>
                   

                    <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
                        <Modal.Header closeButton>
                            <Modal.Title>Modal heading</Modal.Title>
                        </Modal.Header>
                        <Modal.Body> 
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
                                     value={this.state.email} className="form-control" placeholder="Email " />

                        </div>
                    </div>
                    <div className="row">
                        <div className="col">
                            <input type="text" onChange={(event)=>{
                                this.setState({
                                    phoneno:event.target.value
                                    })
                                     }} 
                                     value={this.state.phoneno} className="form-control" placeholder="phone no" />

                        </div>
                        <div className="col">
                            <input type="text" onChange={(event)=>{
                                this.setState({
                                    password:event.target.value
                                    })
                                     }} 
                                     value={this.state.password} className="form-control" placeholder="password " />

                        </div>
                        </div>
                        </Modal.Body>
                        <Modal.Footer>
                            <Button variant="secondary" onClick={this.handleClose.bind(this)}>
                                Close</Button>
                            <Button variant="primary" onClick={this.updateAccountData.bind(this)}>
                                Save Changes
                                </Button>
                        </Modal.Footer>
                    </Modal>
                </div>
            </div>
        )
    }
}

export default ViewAccounts

