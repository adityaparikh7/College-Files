file = open ( input("Enter the file name :-")+".txt","r+")
text = file.readlines()
for i in text:
    for x in (i):
        print (x.upper(), end="")
file.close()