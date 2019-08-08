//const element=<h1>This is jsx!!</h1>
// const name="virat";
// const element=<h1>{name}</h1>

 function Welcome(props) {
     return (
        <div>
           <h1 style={{ color: 'brown' }}>{props.name}</h1>
            {/* <button onClick={()=>alert('Button')}>click</button> */}
            <button onClick={alert.bind(this, 'its a button')}>click</button>
       </div>
   )
}
class Message extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            name: 'SHAILU'
        }
        // this.changeMessage = this.changeMessage.bind(this);
    }
    render() {
        console.log("Rendering");
        return (
            <div>
                {/* <h1>{this.state.name}</h1> */}
                <h1>{this.state.name}</h1>
                <button onClick={this.changeMessage}>Change Message</button>
                <a href="https://www.google.com" onClick={this.clicklink}>Link</a>
            </div>
        )
    }
    clickLink(event) {
        event.preventDefault();
    }
    changeMessage = () => {
        console.log("change method");
        this.setState({

            name: 'swati'

        })
    }

}
// ReactDOM.render(<Welcome name='SHAILU'/>,document.getElementById("app"));

ReactDOM.render(<div><Message /><Welcome/></div>, document.getElementById("app"));