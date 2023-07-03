class Bank_account:
    def __init__(self, account_number, holder_name, balance):
        self.account_number = account_number
        self.holder_name = holder_name
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds")

    def display_balance(self):
        print(f'Account number  : {self.account_number}')
        print(f'Name : {self.holder_name}')
        print(f'Balance : {self.balance}')

obj = Bank_account('352467259809', "Derrick", 437000)
obj.display_balance()
option = input("Do you wish to deposit or withdraw: d/w ")
if option == 'd':

    obj.deposit(
        int(input("How much do you want to deposit"))
    )
    obj.display_balance()

elif option == 'w':
    obj.display_balance()
    obj.withdraw(
        int("How much do you want to withdraw")
    )
    obj.display_balance()

else:
    print("Invalid option")



