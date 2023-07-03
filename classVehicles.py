class Vehicles:
    def __init__(self, name, color):
        self.name = name
        self.color = color

    def display(self):
        raise NotImplementedError("Subclasses to use this method")


class Toyota(Vehicles):
    def display(self):
        print(f"This is {self.name}  of colour {self.color}")


class Nissan(Vehicles):
    def __init__(self, name, color, model):
        super().__init__(name, color)
        self.model = model

    def display(self):
        print(f"This is {self.name} of colour {self.color} of {self.model} model")


class Mercedes(Vehicles):
    def __init__(self, name, color, year):
        super().__init__(name, color)
        self.year = year

    def display(self):
        print(f"This is {self.name} of color {self.color} released in {self.year}")


tx=Toyota("TX", "Black")
tx.display()
cx5=Nissan("CX-5", "White", "Lite")
cx5.display()
benz=Mercedes("BENZ", "grey", 2015)
benz.display()