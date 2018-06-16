def logging(action, item, desc=""):
    print('{:<15} {:<15} {:<15}'.format('['+action+']', item, desc))

def get_input(min, max):
    N = input()

    if not N.isdigit() or int(N) < min or int(N) > max:
        print(' - [Error] Selection is out of bounds. Exiting program ...')
        exit(1)

    return int(N)
