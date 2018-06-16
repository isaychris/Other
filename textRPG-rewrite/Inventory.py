from Option import *

class Inventory:
    def __init__(self, me):
        self.storage = []
        self.options = Options([])
        self.max = 5
        self.me = me

    def check(self):
        self.options.valid_options.clear()

        for item in self.storage:
            self.options.valid_options.append(item.name)

        header = "// Inventory (" + "{} / {}".format(len(self.storage), self.max) + ")"
        i, x = self.options.display(header)
        self.select(i)

    def select(self, i):
        selection, x = self.storage[i].options.display("// Options for {}".format(self.storage[i].name))

        if x == "Eat":
            self.storage[i].eat(self.me)
            self.storage.remove(self.storage[i])
        elif x == "Use":
            self.storage[i].use()
        elif x == "Examine":
            self.storage[i].examine()
        elif x == "Destroy":
            self.storage[i].destroy()
            self.storage.remove(self.storage[i])

        print("------------------------------------------------")
