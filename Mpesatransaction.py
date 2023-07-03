class Mpesatransaction:
    def __init__(self, transaction_id, amount):
        self.transaction_id = transaction_id
        self.amount = amount

    def process_transaction(self):
        raise NotImplementedError("Subclass to use this method")


class DepositTransaction(Mpesatransaction):
    def process_transaction(self):
        print(f"Deposit transaction with the ID {self.transaction_id} processed Amount {self.amount}")


class WithdrawTransaction(Mpesatransaction):
    def process_transaction(self):
        print(f"Withdraw transaction with the ID {self.transaction_id} processed Amount {self.amount}")


class PaymentTransaction(Mpesatransaction):
    def __init__(self, transaction_id, amount, recipient):
        super().__init__(transaction_id, amount)
        self.recipient = recipient

    def process_transaction(self):
        print(f"Payment transaction with ID {self.transaction_id} processed Amount {self.amount} Recipient {self.recipient}")

deposit=DepositTransaction("EJJRDK84YTGU*", 2000)
deposit.process_transaction()
withdraw=WithdrawTransaction("FHH5BGMVBN", 450)
withdraw.process_transaction()
payment=PaymentTransaction("ECH477G7TV", 100, "Derrick")
payment.process_transaction()
