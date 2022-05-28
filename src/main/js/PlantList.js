import React from 'react'

const Plant = (props) => {
  console.log('plant component')
  return (
    <tr>
      <td>{props.plant.name}</td>
      <td>{props.plant.category}</td>
      <td>{props.plant.price}</td>
      <td>{props.plant.sunlightLevel}</td>
      <td>{props.plant.fertilizing}</td>
      <td>{props.plant.watering}</td>
    </tr>
  )
}


const PlantList = ({plants}) => {
  return (
    <div>
      {plants.map(plant => {
        <Plant key={plant._links.self.href} props={plant}/>
      })}
    </div>
  )
}

export default PlantList