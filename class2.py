class People:
    def __init__(self, name, gender, age):
        self.name = name
        self.gender = gender
        self.age = age

    def show(self):
        print(self.name, self.gender, self.age)

myobj = People("Uhuru", "male", 57)
myobj1 = People("Ruto", "male", 52)
myobj3 = People("Karua", "female",72)
myobj2 = People("Raila", "male", 78)

myobj.show()
myobj1.show()
myobj2.show()
myobj3.show()
