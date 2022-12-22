import math
length=int(input("Enter length: "))
print("LENGTH",length)
width=int(input("Enter width: "))
print("WIDTH",width)
height=int(input("Enter height: "))
print("HEIGHT",height)
unit=int(input("Enter unit: "))
print("UNIT",unit)
volume=length*width*height
diagonal=math.sqrt((length**2)+(width**2)+(height**2))
print("Volume of prism is: ",volume, unit)
print("Diagonal of prism is: ",diagonal, unit) 