# Mapping Practice With CRUD Operation
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a basic web application that allows users to run CRUD Operation for each model.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
```
* Student

studentID : Integer
studentName : String
studentAge : String
studentPhoneNumber : String
studentBranch : String 
studentDepartment : String
@OneToOne
private Address address

* Laptop

laptopID : Integer
laptopName : String 
laptopBrand : String
laptopPrice : Integer
@OneToOne
private Student student

* Course

courseID : Integer
courseTitle : String
courseDescription : String
courseduration : String
@ManyToMany
List<Student> studentList

* Book

bookID : Integer
bookTitle : String
bookAuthor : String
bookDescription : String
bookPrice : String
@ManyToOne
private Student student

* Address
addressID	: Long
addressLandmark	: String
addressZipcode	: String
addressDistrict	: String
addressState	: String
addressCountry : String
@OneToOne
Student student
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 
```
* Student Controller

GET/student/{studentID} :-> Get student By ID
PUT/student/{studentID} :-> Update student By ID
DELETE/student/{studentID} :-> Delete Student By ID;
GET/student :-> Get All Student which is Present in Our database
POST/student :-> Save Student in our database

* course-controller

GET/course/{studentID} :-> Get Course By Student ID
PUT/course/{studentID} :-> Update Course By Student ID
GET/course :-> Get all Course which is Present in Our database
POST/course :-> Save Course into Our database
DELETE/course/{courseID} :-> Delete Course by ID

* laptop-controller

GET/laptop/{laptopID} :-> Get Laptop By ID
PUT/laptop/{laptopID} :-> Update Laptop Data by Laptop ID
DELETE/laptop/{laptopID} :-> Remove Laptop from Database By Laptop ID
GET/laptop :-> Get Laptop which is present in our database
POST/laptop :-> Save Laptop into database
GET/laptop/{studentID} : Find Laptop By Student ID

* book-controller

PUT/book/{bookID} :-> Update Book by ID According to Input Data
DELETE/book/{bookID} -> Remove Bokk From Database By Book ID
GET/book :-> Get All Books Which is Present in Database
POST/book :-> Save Book into Database
GET/book/{studentID} :-> Get Book By Student ID

* address-controller

PUT/address/{addressID} :-> Update Address By ID According to Input Data
DELETE/address/{addressID} :-> Remove Address From Database By Address ID
GET/address :-> Get All Address which is Present in OUr Database
POST/address :-> Save Address into Database
GET/address/{studentID} :-> Get Address By Student ID
```
## Data Structure Used
* SQL Database
```
We have used Persistent database to implement CRUD Operations.
```

## Project Summary

The project is a basic web application built using Java and the Spring framework. It allows users to Operate CURD Operation.

## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license
