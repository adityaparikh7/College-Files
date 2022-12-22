import re
username = input("enter username: ")
password = input("enter paswword: ")
email = input("enter email: ")
number = input("enter number: ")

x = re.match(r"[a-zA-Z]{6,10}", username)
y = re.match(r"[A-Za-z0-9@#$%<&]{6,15}", password)
z = re.match(r"[A-Za-z0-9]+[.-]?[A-Za-z0-9]+[@][A-Za-z0-9]+\.[A-Za-z]+", email)
p = re.match(r"^[6789]{1}\d{9}$", number)

if x and y and z and p:
    print("hello")
else:
    print("fuck off")