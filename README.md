Go to http://localhost:9098/pinfo/home.
Enter a product ID in the input field.
Click the "Find By Id" button.
If the product is found, its details will be displayed.
If no product is found, a message will be shown indicating that no product was found for the given ID.
Project Structure
arduino
Copy code
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── productInformation/
│   │           ├── ProductApplication.java
│   │           ├── controller/
│   │           │   └── ProductInfoController.java
│   │           ├── model/
│   │           │   └── ProductInfo.java
│   │           ├── repository/
│   │           │   └── ProductInfoRepository.java
│   │           └── service/
│   │               └── ProductService.java
│   └── resources/
│       ├── templates/
│       │   ├── home.html
│       │   └── IDResult.html
│       ├── application.properties
│       └── static/
│           └── css/
│           └── js/
└── test/
    └── java/
        └── com/
            └── productInformation/
                └── ProductApplicationTests.java
