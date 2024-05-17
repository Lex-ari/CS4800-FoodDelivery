Design Patterns Used:
Factory: Creation of Toppings
Decorator: Main implementation of toppings
Mediator: CPPFoodDelivery, where all objects and classes communicate to
Singleton: Used for instantiated databases and data retrieval

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