#write a program to find all the words which are atleast 4 characters long in a string
import re
words = 'Five lights on and away we go for the Formula 1 Miami Grand Prix of 2022'
print(re.findall(r"\b\w{4,}\b",words))