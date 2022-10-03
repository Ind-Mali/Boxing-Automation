# Boxing Tournament Automation

There are 3 classess in this app.
- Main
- Fighter
- Ring

## Fighter Class

This class have fighter attributes such as name, health, weight, dodge.

When we call the this class we create fighter.

There are hit() method and dodge() method.

### hit()

- This method decides the hit which fighter hit at the other fighter.
- If there's a dodge, the dodger doesn't get punched.
- Return health after damage.

### dodge()

- It produce random value.
- If random value less then dodge value, return true and when we use this method fighter dodge from hit.


## Ring class

This class have 4 methods such as run(), isWin(), checkWeight(), printScrore().

### run()

- Firstly, We control the weight, if there is any problem at the weight the match will not start.
- We do not know which fighter hit first or which fighter dodge the damage.
- We call the random number from Math class and the app decide the constraints.
- Any fighter's health goes down from zero the match will finish.

### isWin()

-This method controls fighter's health and if one of them less then zero, opposite fighter win.

### checkWeight()

- This method check the max weight and min weight.
- If there is any problem, it throws the false

### printScore()

- This method prints the health of fighter to the console.




