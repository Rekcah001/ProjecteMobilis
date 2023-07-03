class cars:
    def __init__(self, company, year, model, color):
        self.company = company
        self.year = year
        self.model = model
        self.color = color

    def display(self):
        print(self.company,self.model, self.color, self.year)


myobj = cars("Toyota", 2016, "Mark X", "Black")
myobj1 = cars("Isuzu", 2018, "D-Max", "White")
myobj2 = cars("Nissan", 2023, "CX-5", "Grey")
myobj3 = cars("Discovery", 2020, "Landrover", "green")

myobj.display()
myobj1.display()
myobj2.display()
myobj3.display()
