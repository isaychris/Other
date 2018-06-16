from Entity import *
from Item import *

def main():
    me = Player('zezima', 99)
    me.hitpoints.current = 50

    stick = Item('stick', "I think you're fanta stick!")
    lobster = Food('lobster', "This looks tricky to eat.", 13)
    poison = Food('poison', "Delicious and nutritous.", -200)

    me.pickup(stick)
    me.pickup(lobster)
    me.pickup(lobster)
    me.pickup(lobster)
    me.pickup(poison)

    while me.hitpoints.current != 0:
        me.inventory.check()

    print("Oh dear, you are dead.")

if __name__ == "__main__":
    main()