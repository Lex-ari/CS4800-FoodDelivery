# Design Patterns Used:
### Factory: 
Use to facilitate the creation of Toppings. This way we don't need to call the specific task in order to 
instantiate it and use it. We let ToppingManager decide which Topping we want to instantiate. Allows us to choose later
on of what we want to instantiate, as well as any additions to the Toppings in the future. We also use the factory
design pattern for adding and getting particular food options that belong to specific nutrient groups, such as carbs, 
proteins, and fats. That way, as the carbs, proteins, fats change with new additions or removals, or even the 
introduction of a new particular nutrient group, it would be easy to facilitate the transfer of information.

### Decorator: 
Used as the main implementation of toppings. Toppings inherit the Food properties, and allows to add new
behavior of a particular Topping by calling its private subclasses. Adding new "toppings" to the original Food object
is simple and linear in its implementation. We do not know what "Food" we would have until runtime, and using the
decorator design pattern allows us to make additions for a future Food object. It mirrors the "assembly" part of real
life food, where adding a new topping is similar to having the original food + the new topping is also food in its
final form.

### Mediator: 
CPPFoodDelivery, where it is the designated single object to handle complex operations. Each actor in this
system would need to communicate to each other in some way, such as the Customer has to communicate with the Restaurant
in order to make an order, then the Restaurant has to communicate with the Driver, and the Driver with the Customer.
To facilitate the communication, everyone instead uses the Mediator CPPFoodDelivery, in order to place orders, 
communicate status, and facilitate transfer of orders and food. That way, the uniqueness of each customer, restaurant,
and driver does not have to depend on each other as long as they can communicate with the mediator with their
intentions.

### Singleton: 
Used for instantiated databases and data retrieval. The CPPFoodDelivery mediator is a singleton, as it is a
general interface that is meant to communicate with all objects. All objects reference this particular instance, which
acts as a global object and controls access. The single instance allows the coordination of all food deliveries, which
would prevent double orders or multiple unnecessary instances of the food control system.



---
# Description
At least 4 Design Patterns(Must state design patterns used in implementation and why you selected)

Create an online food delivery platform that connects Customers, Restaurants and Drivers to
facilitate the ordering and delivery of food from Restaurants to Customers delivered by Drivers.
Additionally, your system will include time. Meaning restaurants will only fulfill orders during operating
hours. Additionally, drivers will only work at a given shift and deliver items in their chosen county.
All 3 must register with your online food Platform called CPPFoodDelivery. Additionally, in your
main driver you will create 4 restaurants, 8 drivers and 10 customers showing the interactions of
registration with the platform, customer ordering and driver delivery.

Driver Time shifts Southern California County
1st shift: 8AM - 4PM LA County
2nd shift: 4PM - 12AM Orange County
3rd shift: 12AM - 8AM San Bernardino County

Restaurants Customers Driver
Name name name
Address address address
County county operating county
Operating Hours dietary restrictions(hw4)
Cuisine type-mexican,thai..etc

Menu:
3 optional meal toppings(hw5)
4 meals:

Meals will include fats, carbs, protein
that will be altered for customer food
restriction.

Orders should include: restaurant, customer, dietary restriction, list of food items[including
modifications based on customers dietary restrictions and any optional toppings selected], driver, order
creation time(Customer), order pick up time(Driver picks up order) and delivered time(Driver drops off
order to Customer).