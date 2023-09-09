import React from 'react';
class ClassEmployee extends React.Component {

    render () {
        return (
            <div>
        <p>{this.props.employee.name}</p> 
        <p>{this.props.employee.address}</p>
        <p>{this.props.employee.phone}</p>
        <p>{this.props.employee.DOB}</p>
        <p>{this.props.employee.position}</p>
        <p>{this.props.employee.salary}</p>

            </div>
        )
    }
}
export default ClassEmployee;