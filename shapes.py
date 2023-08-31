class Shape:
    def __init__(self, name):
        self.name = name
    
    def perimeter():
        #this method should calculate and return the perimeter of the shape
        # Here its empty because dont know what the shape is!
        pass

    def area():
        # This method should calculate and return the area of the shape.
        # it's empty because dont know what the shape is
        pass

    def __str__(self):
        return f"Shape: {self.name}\n Perimeter: {self.perimeter()}\n Area: {self.area()}"
        
class Rectangle(Shape):
    def __init__(self, name, length, height):
        super().__init__(name)
        self.length = length
        self.height = height
    
    def perimeter(self):
        return 2 * (self.length + self.height)   
        
    def area(self):
        return self.length * self.height

class Hexagon(Shape):
    def __init__(self, name, length):
        super().__init__(name)
        self.length = length
    def perimeter(self):
        return 6 * self.length
    
    def area(self):
        return (3 * (3**0.5) * self.length**2) / 2

class Square(Rectangle):
    def __init__(self, nam, length, height):
        super().__init__(nam, length, height)


def show_shapes(shapes):
    for shape in shapes:
        print(shape)
    

 

rectangle = Rectangle("rectangle", 10, 20)
hexagon = Hexagon("hexagon", 10)
square = Square("square", 20,20)
show_shapes([rectangle, hexagon, square])