class Account:
    def __init__(self, account_number, account_holder, balance=0):
        self.account_number = account_number
        self.account_holder = account_holder
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        print(f"Amount {amount} deposited. New balance is {self.balance}")

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            print(f"Amount {amount} withdrawn. New balance is {self.balance}")
        else:
            print("Insufficient balance")

    def display_balance(self):
        print(f"Account Number: {self.account_number}")
        print(f"Account Holder: {self.account_holder}")
        print(f"Balance: {self.balance}")


def main():
    # Create accounts
    account1 = Account(123456, "Alice")
    account2 = Account(789012, "Bob", 1000)

    # Deposit and withdraw
    account1.deposit(500)
    account2.withdraw(200)

    # Display balances
    print("\nAccount Details:")
    account1.display_balance()
    account2.display_balance()


if __name__ == "__main__":
    main()
