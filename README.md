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


part 1 is basically a large application that combines several previous homeworks together, in which it names homework 4 and 5 specifically, but probably others as well...

Essentially, it's a food service application that has 3 different types of users:
Restaurants, Customers, and Drivers

the Restaurant has a main class, but also a sub class for menu, and a sub sub class of meals... meals will need to have a decorator to include toppings and likely an abstract factory to include dietary restrictions...
(we could use different patters if we want as well no need to be fixed by those patterns)

the Customer is just a user that actually orders things, probably have a basic log in to use that user (nothing crazy) that has info for the system to work, such as the county they are in for deliveries, and dietary restrictions for restaurants

the Driver is the most basic since all it will do is be assigned some delivery depending on the where the order is placed, for example if they are to deliver to some county, and there is a driver that operates there, they will be assigned that order

lastly, time is also included, but that basically means both the restaurant and driver classes will also have some operating hours that whenever the order is places, will only use specific drivers / delivery times only...

all this is under a single object, (CPPFoodDelivery), then the driver connects onto the food app, which just prints what is happening
