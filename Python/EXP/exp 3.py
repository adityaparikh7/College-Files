list1=[]

while True:
    ele = int(input("Enter the element: "))
    if ele!=-1:
        list1.append(ele)
    else:
        break

 
def prime_or_comp(list1):
    prime = []
    comp = []
    for num in list1:
        count=0

        for Number in range(1,num+1):
            Remainder=num%Number
            if (Remainder==0):
                count=count+1

        if(count==2):
            prime.append(num)

        elif(count>=3):
            comp.append(num)
       
    print("The number of prime numbers are: ",len(prime))
    print("The number of composite numbers are: ",len(comp))

prime_or_comp(list1)

