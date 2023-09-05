function FuncEmployee (props){
    return (

    <div> 

        <p>{props.employee.name}</p> 
        <p>{props.employee.address}</p>
        <p>{props.employee.phone}</p>
        <p>{props.employee.DOB}</p>
        <p>{props.employee.position}</p>
        <p>{props.employee.salary}</p>
        

    </div>
    )
   
    
}

export default FuncEmployee