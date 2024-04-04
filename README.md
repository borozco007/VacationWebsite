<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>
# WESTERN GOVERNOR UNIVERSITY 
## D288 – BACK-END PROGRAMMING
Welcome to Back-End Programming! This is an opportunity for students to develop object-oriented applications that can be integrated with relational databases, write code for object-oriented applications using Spring framework, and implements design patterns for object-oriented applications. 
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will be building your project using IntelliJ IDEA (Ultimate Edition) in a WGU-provided lab environment. You will be working with an existing MySQL database and Angular front-end, which are supplied for you in the lab environment. You will share this project to a private external GitLab repository and backup regularly. If you wish to work on it on your local machine, you will also need to download the Angular front-end application and create your own MySQL database. Use the links on your course page to install the integrated development environments (IDE), MySQL WorkBench, and IntelliJ IDEA, and pull the project from the lab environment.  



B. Create your subgroup and project by logging into GitLab using the web link provided and do the following:

•    connect your new Java project
•    commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)

Created subgroup and connected to project.


C. Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.

Created the four necessary packages and added RestDataConfig and application properties files.

D. Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.

Created classes based on the UML diagram for the following:
Cart, CartItem, Country, Customer, Division, Excursion, StatusType, Vacation

Added Getter, Setter, and jakarta imports in each class.

Created columns for the contents inside each table from the UML diagram and declared variables for each.

Created OnetoMany, ManytoOne, and ManytoMany relationships to map columns to the database.
(Excursion and CartItem were the only ones that had ManytoMany relation.)

Added Enum to Cart class and applied mapping string value to it.
The StatusType class that refers to the enum. 

Imported entities to the RestDataConfig file. 


E. Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.

In the dao package, the following repositories were created.
CartItemRepository, CartRepository, CountryRepository, CustomerRepository, DivisionRepository, ExcursionRepository, and VacationRepository

Imported appropriate entity for each given repository interface.
Imported JpaRepository and cross-origin into each file.

Referenced frontend link and implemented interfaces for the entities that reference JpaRepository.

F. Write code for the services package that includes each of the following:

•    a purchase data class with a customer cart and a set of cart items

•    a purchase response data class that contains an order tracking number

•    a checkout service interface

•    a checkout service implementation class

Created the follow classes/interfaces under the services package:

Checkout, CheckoutImp, Purchase, and PurchaseResponse
Checkout interface has the purchase response place order method.

Checkout Implementation contains the following:
Private repository declarations for utilization.
A purchase response method that generates the tracking number and fetched vacations.
Saves vacations, excursions, cartItems, and customers.
Fetches the items in the cart.
Returns a randomized tracking number string upon checkout.

The purchase class contains the customer and cartItems fields.

The purchase response class contains the final order tracking number string that will be generated.


G. Write code to include validation to enforce the inputs needed by the Angular front-end.

Added "nullable = false" command to the following entities:
Customer.java- lines 29,32,35,38
Excursion.java- line 42

H.  Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.

A controller package was also created with the following:
CheckoutController class that maps the purchase service and returns the purchase response that was created.
The frontend url will be requested through this controller. 
Includes REST controller checkout class with appropriate post mappings.

*This step was created earlier as the tracking number was not generating without it.

I. Add five sample customers to the application programmatically.

Created Bootstrap package with BootStrapData class. The class contains the following:
Import of CommandLineRunner in order to be implemented by the class.
Import of Component. 
Final private customerRepository created.
Final private divisionRepository created.
Five sample customers created that are saved to customerRepository.
Customer samples include firstname, lastname, address, postal code, and zip code.

Added Customer constructor in Customer entity.


