from Inventory import *
from Skill import *

class Entity:
    def __init__(self, name, max):
        self.name = name
        self.hitpoints = Skill(max)

class Player(Entity):
    def __init__(self, name, max):
        super().__init__(name, max)
        self.inventory = Inventory(self)

    def pickup(self, item):
        if len(self.inventory.storage) >= self.inventory.max:
            print("- [Error] Inventory is Full.")
            return

        self.inventory.storage.append(item)

class Monster(Entity):
    def __init__(self, name, max):
        super().__init__(name, max)