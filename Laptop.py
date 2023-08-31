class Laptop:
    def __init__(self, name, screen_size):
        self.name = name
        self.screen_size = screen_size
    
    def __str__(self):
        return f"Laptop name: {self.name} with screen size {self.screen_size} inches"

class MacbookAir(Laptop): 
        def __init__(self, name, screen_size, year_model):
             super().__init__(name, screen_size)
             self.has_touch_ID = year_model >= 2018
        
        def __str__(self):
             return f"{super().__str__()} and TouchID: {self.has_touch_ID}"
        
macbook_air = MacbookAir("Macbook Air", 28, 2017)
print(macbook_air)
        