part 1 is basically a large application that combines several previous homeworks together, in which it names homework 4 and 5 specifically, but probably others as well...

Essentially, it's a food service application that has 3 different types of users:
Restaurants, Customers, and Drivers

the Restaurant has a main class, but also a sub class for menu, and a sub sub class of meals... meals will need to have a decorator to include toppings and likely an abstract factory to include dietary restrictions...
(we could use different patters if we want as well no need to be fixed by those patterns)

the Customer is just a user that actually orders things, probably have a basic log in to use that user (nothing crazy) that has info for the system to work, such as the county they are in for deliveries, and dietary restrictions for restaurants

the Driver is the most basic since all it will do is be assigned some delivery depending on the where the order is placed, for example if they are to deliver to some county, and there is a driver that operates there, they will be assigned that order

lastly, time is also included, but that basically means both the restaurant and driver classes will also have some operating hours that whenever the order is places, will only use specific drivers / delivery times only...

all this is under a single object, (CPPFoodDelivery), then the driver connects onto the food app, which just prints what is happening
