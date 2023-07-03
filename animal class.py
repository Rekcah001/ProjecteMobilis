class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        raise NotImplementedError("Child class must implement speak")

    def appearance(self):
        raise NotImplementedError("Child class must implement appearance")


class Dog(Animal):
    def speak(self):
        return " -Woof"

    def appearance(self):
        return " -Black"


class Cat(Animal):
    def speak(self):
        return " -Meow"

    def appearance(self):
        return " -White"


class Cow(Animal):
    def speak(self):
        return " -Moo"

    def appearance(self):
        return " -Brown"


Dog = Dog("Tom")
print(Dog.name + Dog.speak() + Dog.appearance())

Cat = Cat("Garfield")
print(Cat.name + Cat.speak() + Cat.appearance())
Cow = Cow("Bob")
print(Cow.name + Cow.speak() + Cow.appearance())
