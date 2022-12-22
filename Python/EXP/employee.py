class student:
    def __init__(self, name, age, score):
        self.name = name
        self.age = age
        self.score = score
    def print_info(self):
        print("Name: %s, Age: %d, Score: %d" % (self.name, self.age, self.score))
    def get_grade(self):
        if self.score >= 90:
            return "A"
        elif self.score >= 80:
            return "B"
        elif self.score >= 70:
            return "C"
        elif self.score >= 60:
            return "D"
        else:
            return "E"