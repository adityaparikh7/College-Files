from abc import ABC,abstractmethod

class vehicle(ABC):
    def __init__(self,n,v):
        self.name=n
        self.vehicle=v
        @abstractmethod
        def speed(self,vehiclename,vehiclespeed):
            pass

class fourwheeler(vehicle):
    def __init__(self,n,s):
        super().__init__(n,s)
    def speed(self,vehiclename,vehiclespeed):
        print("Name of four wheeler: ",vehiclename)
        print("Speed of four wheeler: ",vehiclespeed)

class twowheeler(vehicle):
    def __init__(self, n, s):
        super().__init__(n, s)
    def speed(self,vehiclename,vehiclespeed):
        print("Name of two wheeler: ",vehiclename)
        print("Speed of two wheeler: ",vehiclespeed)

v=fourwheeler("McLaren",200)
v.speed('Ferrari',250)
v=twowheeler('Ducati',150)
v.speed('Triumph',160)