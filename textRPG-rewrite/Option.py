from Helper import *

class Options:
    def __init__(self, args):
        self.selection = None
        self.valid_options = args

    def display(self, header):
        print(header)
        for i, o in enumerate(self.valid_options):
            logging(str(i), o)

        print("Select option [?]: ", end="")
        selection = get_input(min=0, max=len(self.valid_options) - 1)

        print("------------------------------------------------")

        return selection, self.valid_options[selection]