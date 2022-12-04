## Task of project:

1. Make a game where, everything the user does will affect him in the future.
   ## User:
* Equipment :
  Detection (dressing) armor / weapons - gives Characteristics (Armor - defense and when user have all set, then some charesteriscs (exp healt, damage).
* A note:
  Finding a special note that will affect the outcome of the game. Will be involved in combat.
* Berry: If the character chooses to eat a berry,
  gives the effect of poisoning, which will manifest itself before the battle.
  ## Npc:
* Armor/Weapon:
  With the help of a random class, he receives 1 of two sets of armor (heavy, light), receiving defense from armor, the characteristics of the set.\
  A weapon with the help of a class randomly receives 4 types of weapons (Except for the staff), receiving its characteristics (damage, critical damage probability (CrtDamage)).
  The user can start fighting at any time (immediately choose to approach the fighter)
2. If he goes straight into battle, he won't have any stats except for the initial ones.
  Example:(Health 100, damage 5). \
  While the NPC will already have weapons and armor. (Including all stats from equipment).
3. The character can only win under one condition, if he finds the note.
   And during the battle, write the contents of the note when given the opportunity.


## Todo 
* DataBase for the game
1. Table with player name / lose or win / Weapon
2. Delete from table name.
3. Read data
4. If i`m have some time create new database and use it. 
  

## How to work with the project

To build the project simply type `mvn clean package` in your terminal. Prepare your update in a branch and do not propagate your updates to `main` branch if you cannot successfully build the project.

## Few things to explore

- https://www.jrebel.com/blog/maven-cheat-sheet
- https://keepachangelog.com