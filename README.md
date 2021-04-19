---------------------------------- Assumptions and Other Important Info ---------------------------------------- 

1) As it is a single page application (SPA), search results employing Google Book API is limited to 10.
2) Only limited important Info about the books will be displayed (Title, Authors, Published Year and Inventory status) 
because of huge metadata received from the API.
3) Public API Key was generated and used for exploiting the Google Book API.
4) Proper Exception Handling and testing edge cases of program execution have been skipped for now due to time constraints.
4) Application development only for demo purpose, hence security and authentication concerns were overlooked.
5) The application might not open properly on IE browser as its frotend uses React.
5) Book search for Inventory books is Case sensitive. (Important)

----------------------------------------- IMPLEMENTATION --------------------------------------------------------

Backend: Java Spring Booot Micro services comprising of separate modules like Controller, Model classes (and other POJO 
Classes), Service and JPA Repository for straight forward database operations. Reason - Spring Boot framework 
is espacially designed for building MVC applications in a much simpler and quicker fashion. Annotations provided in 
Spring Boot helps in importing and organizing all the necessary dependencies and configurations, hence reducing the 
boilerplate code. Moreover, REST services are more conviniently build using Spring Boot than other frameworks.

Frontend: Frontend of the app is based on ReactJS. React is a very lightweight library to construct reusable
components with minimal code and efforts. Thus, even for a simple UI it is preferable to use React over 
other frameworks to save time and ensure quality.

DB: Cloud based Atlas MongoDB is used to store the Inventory data as documents. For real world applications 
where such big inventory data is used, MongoDB is preferred over MySQL databases for its better and quicker performance.

----------------------------- Instructions to Run the Server Locally ---------------------------------------------

1.) For a maven Java Spring Boot application, you can run the following commands from 
the root folder of the project: 
To build a fresh jar: mvn clean package
To run the application: mvn spring-boot:run

2.) For a ReactJs frontend project, run the follwing commands from the project root folder: 
To install project dependencies mentioned in package.json: npm install
To package the UI app in build folder: npm run build
To start the application: npm start

--------------------------------------------- APP FUNCTIONALITY ---------------------------------------------------

---> Home Page: Comprises of app title, an Inventory button, a search input feild and a button to search for books 
online (uses Google Book API to fetch results), and books currently in the inventory.

---> Inventory button: Developed as a separate reusable component to display all the books currently in the inventory.

---> Search component: This will accept any search string as input and will fetch all results of the given input name.
In addition to books available online (via Google Book API), it'll also fetch existing books in the inventory.
(RETREIVE BOOK OPERATION)

---> Book Card component: This component represents the particular book card from the list of books that appear on your
screen. It comprises of 4 kinds of case dependent action feilds:

1. Add to Inventory button - This button will appear only if the particular book is currently not added to the
inventory OR when it is currently out of stock. On click of this button, the book card updates to display an Inventory 
input box, Save and Remove All Copies buttons and inserts the book into the inventory database. (INSERT BOOK OPERATION)

2. Save button - This button is provided to save the user input of the Inventory input box. It appears on the card
only if the particular book exists in the inventory. It'll update the database with the provided no of copies for 
that particular book in the inventory. (UPDATE BOOK OPERATION)

3. Inventory input box - This field will indicate the current no of copies of the particular book in the inventory. 
It takes only numerical input (minimum 1) and disappears in case there is no input. If the user updates this feild,
they must click Save button below to update the no of copies.

4. Remove All Copies button - This button also appears only when the particular book exists in the inventory. As the 
name suggests, it will remove all the copies of the book from the inventory which makes it out of stock. On click of
this button, the card updates to display only Add to Inventory button. (DELETE BOOK OPERATION)