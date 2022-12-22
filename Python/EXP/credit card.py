import re
credit=input("Enter a card number: ")
if(re.match(r'^([456][0-9]{3})-([0-9]{4})-([0-9]{4})-([0-9]{4})$',credit)):
    print("Valid")
elif(re.match(r'^([456][0-9]{3})([0-9]{4})([0-9]{4})([0-9]{4})$',credit)):
    print("Valid")    
else:
    print("Invalid")    