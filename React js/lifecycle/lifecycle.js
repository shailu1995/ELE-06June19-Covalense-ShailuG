class Lifecycle extends React.Component {
    constructor(props) {
        super(props)
        console.log("constructor Lifecycle");
        this.state = {
            name: 'virat',
            checked:true
        }
    }
    static getDerivedStateFromProps() {
        console.log("getDerivedStateFromProps Lifecycle");
        // return{name:'shailu'};
        return null;
    }
    render() {
        console.log("Render Lifecycle");
        if(this.state.checked){
        return (
            <div>
                <h1>{this.state.name}</h1>
                <button onClick={this.changeName.bind(this)}>changeName</button>

            </div>
        
        )
        }
        return <h1>checked is false</h1>
    }
    ComponentDidMount() {
        console.log("ComponentDidMount Lifecycle");
    }
    shouldComponentUpdate() {
        console.log("should component update Lifecycle");
     return true;
    }
    getSnapshotBeforeUpdate() {
        console.log("snapshot before  update Lifecycle");
        return 'snapshotData';
    }
    ComponentDidUpdate(props,state,snapshotData) {
        console.log(" component update Lifecycle");
        console.log("SnapshotData", snapshotData);
    }
    changeName(){
        this.setState({
            name:'mona'
        })
    }
}
class Child extends React.Component{
    constructor(props) {
        super(props)
        console.log("constructor child");
        this.state = {
            name: 'virat',
            checked:true
        }
    }
    static getDerivedStateFromProps() {
        console.log("getDerivedStateFromProps child");
        // return{name:'shailu'};
        return null;
    }
    render() {
        console.log("Render child");
        if(this.state.checked){
        return (
        <h1>Child Component</h1>
                )
        }
        return <h1>checked is false</h1>
    }
    ComponentDidMount() {
        console.log("ComponentDidMount child");
    }
    shouldComponentUpdate() {
        console.log("should component update child");
     return true;
    }
    getSnapshotBeforeUpdate() {
        console.log("snapshot before  update child");
        return 'snapshotData';
    }
    ComponentDidUpdate(props,state,snapshotData) {
        console.log(" component update child");
        console.log("SnapshotData", snapshotData);
    }
    changeName(){
        this.setState({
            name:'mona'
        })
    }

}
ReactDOM.render(<div><Child/><Lifecycle/></div>, document.getElementById("app"));