my first project at GitHub 
This project is a simple E-commercce 
we have a class product this is the parent (super) class of all and it has the main data about any product like id,name and sure price,
also there the children (sub) classes they are inhereted from product the name, id and price. but they have some special attributes, let's get a look

The first child(sub class) Electronic product: it has two special attributes brand ,warrantyPeriod and it has some methods constructors and setter&getter, and sure the inherited attributes or methods from the parent
The second child is Clothing product:it has two special attributes fabric and size and sure the constructors and setter&getter
the third child is Book_product:it has two special attributes too author and publisher and the constructors and setter&getter

the next three classes are the most important classes in the system they're customer, cart, order and they isn't sub classes,let's take a closer look

The customer: it has some important attributes; customer name,ID and address and the constructor setter& getter for the attributes
The cart: it has customerID, products and this is the array that contains user's purchases, nproducts and it is the length of the array and it is the number of theuser's purchases, other than the setter&getter it has calculatePrice method it returns the total price for all the purchases, it has add product&remove_product to modify the array,and place order method it takes the final decision from the user he will buy or not
The order: it has the array products and it has customer ID and OrderID and it has very important method print order Info it returns the customerID and OrderID and 
the name&price for each product in the array and sure the total price 

*THE main class has the implementation of all the methods or constructor in any class*
