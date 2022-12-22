x = 0
myfile = open("rollcall.txt","w+")
h = "Roll No \t Name \t Department\n"
myfile.writelines(h)
while x<=2:
    roll = input("Enter your roll no: ")
    name = input("Enter your name: ")
    dep = input("Enter your department: ")

    myfile.writelines("{} \t\t {} \t\t {} \n".format(roll,name,dep))
    x = x+1 
file = open ( input("Enter the file name :-")+".txt","r+")
text = file.readlines()
for i in text:
    for x in (i):
        print (x.upper(), end="")
myfile.close()
