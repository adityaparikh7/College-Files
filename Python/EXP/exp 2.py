def Remove(duplicate):
    list1 = set(duplicate)
    duplicate = list(list1)
    return duplicate
     
duplicate = [5, 44, 10, 20, 5, 2, 20, 4]
print(Remove(duplicate))


def frequency(string):
    count={}
    string = string.replace(" ","").lower()
    for i in string:
        if i not in count:
            count[i]=1
        else:
            count[i]+=1
    print(count)
string = "aditya parikh"
print(frequency(string))

