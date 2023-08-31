class CX9Sport:
    def __init__(self):
        self.features = ["Android Auto", "Apple CarPlay", "Mazda Radar Cruise Control with Stop & Go", "Reverse camera\n"]

    def display(self):
        print("CX9 Sport Features: ")
        for feature in self.features:
            print(f" - {feature}")
   
    def __str__(self) -> str:
        s = "Sport features----\n"
        for feature in self.features:
            s += f' - {feature}'
        return s

class CX9Touring(CX9Sport):
    def __init__(self):
        super().__init__()
        self.touring_features = self.features + ["Leather Seats", "Front Parking Sensors", "Paddle Shift Gear Control\n"]
    
    def display(self):
         super().display()
         print ("CX9 Touring features: ")
         for features in self.touring_features:
             print(f" - {features}")
    
    def __str__(self) -> str:
        t = "Sport features----\n"
        for feature in self.touring_features:
            t += f' - {feature}'
        return t

        

class CX9GT(CX9Touring):
    def __init__(self):
        super().__init__()
        self.GT_feature = self.touring_features+ ["Sunroof", "Bose Audio", "10.25 inch Mazda Connect System\n"]
    
    def display(self):
        super().display()
        print("CX9 GT features: ")
        for features in self.GT_feature:
            print(f" - {features}")

    def __str__(self) -> str:
        g = "Sport features----\n"
        for feature in self.GT_feature:
            g += f' - {feature}'
        return g
        
class ShowRoom():
    def __init__(self):
        self.CX9 = []
    
    def add_CX9(self, vehicle):
        self.CX9.append(vehicle)
        
    def __str__(self):
        s = ""
        for vehicle in self.CX9:
            s+= vehicle.__str__()
        return s


cx9_sport = CX9Sport()
print(cx9_sport)

cx9_touring = CX9Touring()
print(cx9_touring)

cx9_GT = CX9GT()
print(cx9_GT)

showroom = ShowRoom()
showroom.add_CX9(cx9_sport)
showroom.add_CX9(cx9_touring)
showroom.add_CX9(cx9_GT)
print(showroom)

