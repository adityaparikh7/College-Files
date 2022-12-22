numbers = [1,2,3,4,5,6,7,8,9,0]   
print("List of numbers:")
print(numbers)
print("\nList of even numbers:")
evenNumbers = list(filter(lambda x: x%2 == 0, numbers))
print(evenNumbers)
print("\nList Odd numbers:")
oddNumbers = list(filter(lambda x: x%2 != 0, numbers))
print(oddNumbers)