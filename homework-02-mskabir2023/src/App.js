import logo from './logo.svg';
import './App.css';
import FuncEmployee from './functionComponents';
import Employee from './employee';
import ClassEmployee from './classComponents';

function App() {

  const employee = new Employee("msk","309 W Washington ave Fairfield","10-01-1987","programmer",130000)
  
  return (
    <div className="App">
      <FuncEmployee employee={employee}></FuncEmployee>
      <ClassEmployee employee={employee}></ClassEmployee>
    </div>
  );
}

export default App;
