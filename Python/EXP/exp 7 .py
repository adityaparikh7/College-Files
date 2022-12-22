class account:
    cust_name = "Raheel Parekh"
    savings_acc_no = "16010121133S"
    current_acc_no = "16010121133C"
    balance = 0

    def __init__(self):
        self.customername=input("\nEnter your Full Name: ")

class sav_acct(account):
    sbalance=0
    def __init__(self):
        super(). __init__()
        self.savings_ac_no = input("\nEnter your Savings Account number: ")
    def Put_money(self):
        self.sdeposit=float(input("\nEnter Savings Number Amount: "))
        self.sbalance= self.sbalance + self.sdeposit
        print ("Updated Balance - ", self.sbalance)
    def interest (self):
        self.interest_= (7/100)*self.sbalance
        print ("Your interest is Rs.", int(self.interest_)," for 1 Year")
        self.sbalance=self.sbalance+self.interest_
        print ("Updated balance - ",self.sbalance)
    def withdrawal (self):
        self.withdraw_amount=float(input ("\nEnter the amount you want to withdraw: "))
        self.sbalance=self.sbalance-self.withdraw_amount
        print ("Updated balance- ",self.sbalance, "\n\n")


class cur_acct(account):
    cbalance=0
    answer = "no"
    def __init__(self):
       super().__init__()
       self.current_ac_no=input("\nEnter your Current account number: ")
    def Put_money(self) :
       self.cdeposit=float(input( "\nEnter Amount that you want to Deposit: "))
       self.cbalance=self.cbalance+self.cdeposit
       print ("Updated Balance- ",self.cbalance)
    def check_min_balance(self):
       if self.cbalance>=500:
         pass
       else:
         self.cbalance=(98/100)*self.cbalance
         print ("Your account does'nt have the minimum required Balance. \nPenalty of 2% will be charged \nUpdated Balance ",self.cbalance)
    def cheque_book(self):
        cur_acct.answer=input ("\nDo you want to use your cheque book facility now ? (yes/no)")
        if (str(cur_acct.answer).lower())=="yes":
              self.withdraw_amount=float(input("\nEnter the amount you want to withdraw: "))
              self.cbalance=self.cbalance-self.withdraw_amount
              print("Updated balance - ",self.cbalance,"\n\n")
        else:
           pass
p1s=sav_acct()
p1s.Put_money()
p1s.interest()
p1s.withdrawal()
p1c=cur_acct()
p1c.Put_money()
p1c.check_min_balance()
p1c.cheque_book() 