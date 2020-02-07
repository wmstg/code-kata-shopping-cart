# CODE-KATA-Shopping-Cart

## Workflow
- Treat this like a real assignment, but only spend up to two hours on it - it doesn't matter how far you get
- Fork the project to your personal Github account (click on the fork button in the top right corner)
- Clone the forked version of this repository
- Include a `README`
- Push your work up to your fork
- Submit a link to your forked repository

## Instructions
You should implement a supermarket checkout which:
- always accepts a string of items and gives back the total price
- discounts any offers from the total price

Use the following pricing information:

| Item  | Price | Offer     |
| :---: | :---: | :---:     |
| A     | 50    | 3 for 130 |
| B     | 30    | 2 for 37  |
| C     | 20    | N/A       |
| D     | 10    | N/A       |

For example:
- `'DABA'` gives `140`
- `'BBBB'` gives `74`

####

A simple solution to the shopping cart task.

Uncommenting the while loop in the main method will allow continued running of the program until the key Q is pressed when you are prompted to continue or quit.