# mystore

# Introduction: 
This project consists of RESTful services that implement a checkout counter for an online retail store that scans products and generates itemized bill.

It provides services to get all the available product in the database and to generate a bill for added products. Sales tax is applied based on the category of the product which also provided in the database against each product:
* Category A - 10%
* Category B - 20%
* Category C- 0%

## Products
*  GET /products - fetches list of all products

## Bills
*  POST /getBill - returns a bill object based on the passed data of selected items

This program and instructions have been tested on following versions on Windows laptop.
*  Apache Maven 3.6.1 
*  Java version: 1.8.0_202
*  git version 2.22.0.windows.1

# How to run the application locally?

Pre-requisites to run application are Java, Maven and Git. 
*  Installation instructions for Maven are available at https://maven.apache.org/install.html
*  Java can be installed from http://www.oracle.com/technetwork/java/javase/downloads/index.html
*  Latest Git version can be installed from https://git-scm.com/downloads

Steps to build and run locally:
* Open commandline
* Go to repository where you want to clone.
* Clone repository using following command=>   https://github.com/bhavana25692/mystore.git
* Run given command in the same repository=> mvn clean tomcat7:run  
* Access and invoke APIs using url => http://localhost:8080/mystore

This application uses Postgresql database. 

