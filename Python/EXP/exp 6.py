class student:
    marks = []
    def getData(self, rn, m1, m2, m3, m4):
        student.rn=rn
        student.marks.append(m1)
        student.marks.append(m2)
        student.marks.append(m3)
        student.marks.append(m4)
        

    def displayData(self):
        print("Roll No is: ", student.rn)
        print("Marks are: ", student.marks)

    def total(self):
        return(student.marks[0]+student.marks[1]+student.marks[2]+student.marks[3])

x = int(input("Enter Roll No: "))
m1 = int(input("Enter marks in Subject 1: "))
m2 = int(input("Enter marks in Subject 2: "))
m3 = int(input("Enter marks in Subject 3: "))
m4 = int(input("Enter marks in Subject 4: "))


s1= student()
s1.getData(x, m1, m2, m3, m4)
s1.displayData()
print("Total Marks are: ", s1.total())
per = float(s1.total())*(100/400)
print("Percentage is: ", per)

