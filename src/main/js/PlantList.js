import React from 'react'

const Plant = ({plant}) => {
  console.log('plant component')
  return (
    <tr>
      <td>{plant.name}</td>
      <td>{plant.category}</td>
      <td>{plant.price}</td>
      <td>{plant.sunlightLevel}</td>
      <td>{plant.fertilizing}</td>
      <td>{plant.watering}</td>
    </tr>
  )
}


const PlantList = ({plants}) => {
  
  return (
    <table>
    <tbody>
      <tr>
        <th>Name</th>
        <th>Category</th>
        <th>Price</th> 
        <th>Sunlight Level</th>
        <th>Fertilizing</th>
        <th>Watering</th>
      </tr>
      {plants.map(plant => <Plant key={plant._links.self.href} plant={plant}/>)}
    </tbody>
  </table>
    
      

  )
}

export default PlantList