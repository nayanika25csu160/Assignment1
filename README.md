# TechStore Inventory System

## Description

TechStore is a simple command-line inventory application developed in Java.

The application allows the user to:

- Add items
- Remove items
- List all items
- Search items by ID
- Search items by name

The project demonstrates basic Java and Object-Oriented Programming concepts.

## Classes

### Item
Base class containing common item information:
- ID
- Name
- Price

### Electronic
Subclass of Item.

Additional field:
- Warranty years

### Accessory
Subclass of Item.

Additional field:
- Compatible with

### Store
Manages all items using ArrayList<Item>.

### Main
Contains the main method and command-line menu.

## OOP Concepts Used

### Encapsulation
Fields are private and accessed using getters and setters.

### Inheritance
Electronic and Accessory inherit from Item.

### Polymorphism
The displayDetails() method is overridden in both subclasses.

The Store stores Electronic and Accessory objects using:

ArrayList<Item>

When displayDetails() is called, Java executes the appropriate
overridden method depending on the actual object.

## How to Compile

Open the terminal inside the TechStore folder.

Run:

javac *.java

## How to Run

java Main

## Example

The application starts with sample products:

Laptop
Smartphone
Wireless Mouse
USB Cable

The user can select options from the menu.

