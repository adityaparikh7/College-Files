class Base1(object): 

    def __init__(self): 

      self.str1 = "Python" 

    print("First Base class") 

 

class Base2(object): 

  def __init__(self): 

      self.str2 = "Programming"		 

      print("Second Base class") 

 

class Derived(Base1, Base2): 

   def __init__(self): 

 

       # Calling constructors of Base1 

    # and Base2 classes 

     Base1.__init__(self) 

     Base2.__init__(self) 

     print("Derived class") 

 
   def printStrs(self): 

    print(self.str1, self.str2) 

 

 

ob = Derived() 

ob.printStrs() 