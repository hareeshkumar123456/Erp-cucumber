@Tag
Feature:
As admin users i want to validate supplier name and customer name
@Suppliers
Scenario Outline:
As a admin user i want to validate suppliers
Given i want to launch the Browser
When  i want to launch the Url
When  i want to wait for User Name "xpath" and "//input[@id='username']" and "10"
When enter the User Name "name" and "username" and "admin"
When  enter the Password "xpath" and "//input[@id='password']" and "master"
When  click the login button "id" and "btnsubmit"
When i want to wait for  Logout "xpath" and "(//a[starts-with(text(),' Logout')])[2]" and "10"
Then i want to validate the title "Dashboard « Stock Accounting"
When wait for the supplier link "xpath" and "(//a[starts-with(text(),'Suppliers')])[2]" and "10"
When click the supplier link with "xpath" and "(//a[starts-with(text(),'Suppliers')])[2]"
When wait for the add icon button "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When  click the add icon button "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for the Supplier Number "name" and "x_Supplier_Number" and "10"
When  capture the Supplier Number "name" and "x_Supplier_Number"
When enter in "<suppliername>" with "name" and "x_Supplier_Name"
When enter in "<Address>" with "name" and "x_Address"
When enter in "<City>" with "name" and "x_City"
When enter in "<Country>" with "name" and "x_Country"
When enter in "<ContactPerson>" with "name" and "x_Contact_Person"
When enter in "<PhoneNumber>" with "name" and "x_Phone_Number"
When enter in "<Email>" with "name" and "x__Email"
When enter in "<MobileNumber>" with "name" and "x_Mobile_Number"
When enter in "<Notes>" with "name" and "x_Notes"
When click the add button "id" and "btnAction"
When wait for the alert window ok button  by "xpath" and "//button[normalize-space()='OK!']" and "10"
When click the alert window ok button  by "xpath" and "//button[normalize-space()='OK!']"
When wait for the alarmwindow ok button  by "xpath" and "//button[@class='ajs-button btn btn-primary']" and "10"
When click the alarmwindow ok button  by "xpath" and "//button[@class='ajs-button btn btn-primary']"
Then validate the  Supplier Number
When close the browser
Examples:
|suppliername|Address|City|Country|ContactPerson|PhoneNumbe|Email|MobileNumber|Notes|
|Walmart|port|sydney|canada|hareesh|1234567895|lenovo@gmail.com|7539518524|asmaajkkash|
|Walmart1|port1|sydney1|canada1|hareesh1|1234567895|lenovo@gmail.com|7539518524|asmaajkkash|
@Customers
Scenario Outline:
As a admin user i want to validate Customers
Given i want to launch the Browser
When  i want to launch the Url
When  i want to wait for User Name "xpath" and "//input[@id='username']" and "10"
When enter the User Name "name" and "username" and "admin"
When  enter the Password "xpath" and "//input[@id='password']" and "master"
When  click the login button "id" and "btnsubmit"
When i want to wait for  Logout "xpath" and "(//a[starts-with(text(),' Logout')])[2]" and "10"
Then i want to validate the title "Dashboard « Stock Accounting"
When wait for the Customers link "xpath" and "(//a[starts-with(text(),'Customers')])[2]" and "10"
When click the Customers link with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When wait for the add icon button "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When  click the add icon button "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for the Customers Number "name" and "x_Customer_Number" and "10"
When  capture the Customers Number "name" and "x_Customer_Number"
When enter in "<customername>" with "name" and "x_Customer_Name"
When enter in "<Address>" with "name" and "x_Address"
When enter in "<City>" with "name" and "x_City"
When enter in "<Country>" with "name" and "x_Country"
When enter in "<ContactPerson>" with "name" and "x_Contact_Person"
When enter in "<PhoneNumber>" with "name" and "x_Phone_Number"
When enter in "<Email>" with "name" and "x__Email"
When enter in "<MobileNumber>" with "name" and "x_Mobile_Number"
When enter in "<Notes>" with "name" and "x_Notes"
When click the add button "id" and "btnAction"
When wait for the alert window ok button  by "xpath" and "//button[normalize-space()='OK!']" and "10"
When click the alert window ok button  by "xpath" and "//button[normalize-space()='OK!']"
When wait for the alarmwindow ok button  by "xpath" and "//button[@class='ajs-button btn btn-primary']" and "10"
When click the alarmwindow ok button  by "xpath" and "//button[@class='ajs-button btn btn-primary']"
Then validate the  Customer Number
When close the browser
Examples:
|customername|Address|City|Country|ContactPerson|PhoneNumber|Email|MobileNumber|Notes|
|kumar|mumbai|chennai|somalia|timmy|4569513265|babai@gmail.com|3219874568|hellobabu|
|kumari|mumbai1|chennai1|somalia1|timmy1|4569513265|babai@gmail.com|3219874568|hellobabu|




