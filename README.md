# Lab Assignment #2

Purpose: The purpose of this lab assignment is to:

- Use Android UI controls to develop an interactive mobile application

## Exercise 1

***RentalCars*** helps its clients to find the best option for renting a
car. Develop an Android application based on the following
specifications:

The **main screen** will display the company logo and a button
“**Drive**”.

The **second screen** allows the potential customer to choose the **car
types**:

- Coupe

- Hatchback

- Sedan

- SUV

Use **an options Menu control** to implement the selection of car types.
Display a friendly screen with available **cars** whenever the user
selects a car type from the menu. For example, if the user selects SUV
car type, the next screen will display the available cars (Host address,
rental cost, and image).

The user may use the **menu control** to choose another car type, and so
on.

The check-out screen displays the selected car and corresponding **Host
address**, and **rental cost**. It also shows edit text to enter the
number of rental days. The user can enter the number of days. Trip cost
is calculated by multiplying rental cost with number of days. 13% tax is
applied to Trip cost. In the next screen display Car rental cost, Number
of rental days, Tax amount and Total amount to pay. This screen prompts
the user with **payment option** (credit card, debit card). Use a group
of **radio buttons** to select the payment method.

The **last screen** asks the user to enter **credit/debit card
information**.

Use *EditText* controls and other UI elements to allow the user to enter
**customer’ information:** *full* *name*, *credit/debit card number*.
Provide **validation** for these entries using the proper
attributes/methods/constructor for each UI control.

Use *TextView* objects to display information as needed. Use **styles**
and **themes** to create a nice look and feel of your app. Use
**drawable** objects to display the logo for the company, car types,
cars, etc.
