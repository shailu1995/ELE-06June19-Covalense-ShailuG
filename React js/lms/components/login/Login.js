import React, { Component } from 'react';
import './Login.css';
import Axios from 'axios';
import { Button } from 'react-bootstrap';
import {Link} from 'react-router-dom';
import booksimage from '../../images/books.jpg';

export default class Login extends Component {
    constructor(props) {
        super(props);
        this.state = {
            email: '',
            password: '',
            msg: localStorage.getItem('msg')
        }
        this.submituserLoginForm = this.submituserLoginForm.bind(this);
    }
    submituserLoginForm(e) {
        e.preventDefault();
        Axios.post('http://localhost:80/login/authenticate', null, {
          
            params: {
                email: this.state.email,
                password: this.state.password
            }
        }).then((response) => {
            console.log('Response Object', response.data);
            if (response.data.message === "success") {
                console.log(response.data.beans[0].userType);
                if (response.data.beans[0].userType === 'admin') {
                    localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
                    this.props.history.push('/adminHome');
                  
                } else if (response.data.beans[0].userType === 'librarian') {
                    localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
                    this.props.history.push('/librarianHome');
                   
                } else if (response.data.beans[0].userType === 'user') {
                    localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
                    this.props.history.push('/userHome');
                   
                } else {
                    localStorage.setItem('logoutmsg', response.data.description);
                    this.props.history.push('/');
                   
                }
            }
        }).catch((error) => {
            console.log('Error', error);
        })
    }
    componentDidMount() {
        localStorage.removeItem('logoutmsg');
    }
    render() {
        return (
            <div className="background">
                {/*  <img src={booksimage} /> */}
                <h1 className="space">Library Management System</h1>
                <div className="row">
                    <div className="col-md-4"></div>
                    <div className="card col-md-4">
                        <div className="card-header">
                            <h3> Login</h3>
                        </div>
                        <div>{localStorage.getItem('logoutmsg')}</div>
                        <div className="card-body">
                            <form method="post" onSubmit={this.submituserLoginForm}>

                                <div className="form-group">
                                    <label>Email ID</label>
                                    <input type="text" className="form-control" name="email" value={this.state.email} onChange={(event) => { this.setState({ email: event.target.value }) }} />
                                </div>
                                <div className="form-group">
                                    <label>Password</label>
                                    <input type="password" className="form-control" name="password" value={this.state.password} onChange={(event) => { this.setState({ password: event.target.value }) }} />
                                </div>
                                <div className="form-group">
                                    <input type="submit" className="form-control" className="btn btn-primary" value="Login" />
                                </div>
                                <div className="form-group">
                                <Link className="nav-link" to="/addUser">Register</Link>
                                <Link className="nav-link" to="/">Forgot Password</Link>
                                </div>
                            </form>
                        </div>

                    </div>

                </div>
            </div>
        )
    }
}
