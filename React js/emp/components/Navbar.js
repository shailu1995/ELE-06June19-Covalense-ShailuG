import React from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import CreateAccount from './CreateAccount';
import ViewAccount from './ViewAccounts';


export default  function Navbar (props) {
    return (
        <Router>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <h1 class="navbar-brand" href="#">Employee</h1>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                          
                            <Link class="nav-link" to="/">CreateAccount <span class="sr-only"></span></Link>
                        </li>
                        <li class="nav-item">
                        <Link class="nav-link" to="/viewaccounts">View Accounts <span class="sr-only"></span></Link>
                        </li>
                    </ul>

                </div>
            </nav>
            <Route exact path='/' component={CreateAccount}></Route>
            <Route path='/viewaccounts' component={ViewAccount}></Route>
        </Router>

    )
}
