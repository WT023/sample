class Room:
    def __init__(self, room_number, bed_type, price):
        self.room_number = room_number
        self.bed_type = bed_type
        self.price = price
    
    def __str__(self):
        return f"Room: {self.room_number}  Bed: {self.bed_type}  Price: {self.price}"
    
class StandardRoom(Room):
    def __init__(self, room_number, bed_type, price, has_bathtub=False):
        super().__init__(room_number, bed_type, price)
        self.has_bathtub = has_bathtub
    
    def __str__(self):
        return f"{super().__str__()}  BathTub: {self.has_bathtub}"
    
class DeluxeRoom(StandardRoom):
    def __init__(self, room_number, bed_type, price, has_bathtub=False, has_balcony=False):
        super().__init__(room_number, bed_type, price, has_bathtub)
        self.has_balcony = has_balcony

    def __str__(self):
        return f"{super().__str__()} Balcony: {self.has_balcony}"


def show_room(rooms):
    for room in rooms:
        print(room)



standard_room = StandardRoom(100, "Queen", 500, True)
deluxe_room = DeluxeRoom(212, "King", 1000, True, True)
show_room([standard_room, deluxe_room])