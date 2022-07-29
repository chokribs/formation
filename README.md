# formation: spring-boot-form
A simple spring boot example, it provids a car entity management (add and get only)

1- change a datasource settings in ressources/application-mysql.yml
2- to run app launch mvnw spring-boot:run
3- to add new Car, execute post api http://localhost:8080/api/car by 
{
    "marque":"FIAT",
    "modele": "punto",
    "matricule":"230TU201"
}
as json body
repeat many times
4- to get car list, execute get http://localhost:8080/api/car
5 to get car by id (1) execute  get http://localhost:8080/api/car/1

