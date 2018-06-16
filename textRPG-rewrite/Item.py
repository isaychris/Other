from Option import *

class Item:
    def __init__(self, name, desc):
        self.name = name
        self.description = desc
        self.options = Options(['Use', 'Examine', 'Destroy'])

    def use(self):
        logging('Use', self.name, 'Nothing interesting happened.')

    def examine(self):
        logging('Examine', self.name, self.description)

    def destroy(self):
        logging('Destroy', self.name, '*poof*')


class Food(Item):
    def __init__(self, name, desc, heals):
        self.heals = heals
        super().__init__(name, desc)
        self.options = Options(['Eat', 'Use', 'Examine', 'Destroy'])

    def eat(self, player):
        player.hitpoints.current += self.heals

        if player.hitpoints.current > player.hitpoints.max:
            player.hitpoints.current = player.hitpoints.max
        elif 0 > player.hitpoints.current:
            player.hitpoints.current = 0

        logging('Use', self.name, str(player.hitpoints.current) + '/' + str(player.hitpoints.max))