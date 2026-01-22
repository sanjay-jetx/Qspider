package relationship.Has_RelationShip;

public class Room_Management {
    public static void main(String[] args) {

        Hotel h = new Hotel("Taj");

        h.appointManager("Sanjay", 45);

        h.addRoom("101");
        h.addRoom("102");
        h.addRoom("103");

        h.bookRoom("102");

        h.findRoom("102");
        h.removeRoom("101");
    }
}

// ---------------- HOTEL ----------------
class Hotel {
    String name;
    Manager manager;
    Rooms[] rooms = new Rooms[6];

    Hotel(String name) {
        this.name = name;
    }

    public void appointManager(String name, int age) {
        manager = new Manager(name, age);
    }

    // ADD ROOM
    public void addRoom(String roomNumber) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = new Rooms(roomNumber);
                System.out.println("Room " + roomNumber + " added");
                return;
            }
        }
        System.out.println("No space to add more rooms");
    }

    // REMOVE ROOM
    public void removeRoom(String roomNumber) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null && rooms[i].getNumber().equals(roomNumber)) {
                rooms[i] = null;
                System.out.println("Room " + roomNumber + " removed");
                return;
            }
        }
        System.out.println("Room not found");
    }

    // FIND ROOM
    public void findRoom(String roomNumber) {
        for (Rooms r : rooms) {
            if (r != null && r.getNumber().equals(roomNumber)) {
                System.out.println("Room " + roomNumber + " found | Occupied: " + r.isOccupied());
                return;
            }
        }
        System.out.println("Room not found");
    }

    // BOOK ROOM
    public void bookRoom(String roomNumber) {
        for (Rooms r : rooms) {
            if (r != null && r.getNumber().equals(roomNumber)) {
                if (!r.isOccupied()) {
                    r.book();
                    System.out.println("Room " + roomNumber + " booked successfully");
                } else {
                    System.out.println("Room already occupied");
                }
                return;
            }
        }
        System.out.println("Room not found");
    }
}

// ---------------- MANAGER ----------------
class Manager {
    String name;
    int age;

    Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// ---------------- ROOMS ----------------
class Rooms {
    String number;
    boolean occupied;

    Rooms(String number) {
        this.number = number;
        this.occupied = false;
    }

    public String getNumber() {
        return number;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void book() {
        occupied = true;
    }
}
