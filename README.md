# 🎬 Movie Booking System 

## 📌 Project Description
The **Movie Booking System** is a Java-based console application that allows users to select a movie and book seats in a simple theatre layout.  
The system displays available movies, shows seat availability, and lets users book seats interactively while preventing double bookings.

This project is developed to demonstrate **arrays, loops, conditional statements, methods, and user input handling in Java**.

---

## 🛠️ Technologies Used
- **Programming Language:** Java  
- **IDE:** VS Code / Eclipse / IntelliJ IDEA  
- **Concepts Used:**
  - 2D Arrays
  - Methods
  - Loops
  - Conditional Statements
  - Scanner Class
  - Console-based Interaction

---

## 🎥 Available Movies
1. Dhurandhar  
2. Toxic  
3. Ramayan  
4. Maddock Horror Comedy Universe: Bhediya 2  
5. YRF Alpha  
6. Avengers: Doomsday  
7. Spiderman: Brand New Day  

---

## 🪑 Seat Layout
- Theatre size: **5 × 5**
- `O` → Available Seat  
- `X` → Booked Seat  

Example:
```

O O O O O
O O O O O
O O O O O
O O O O O
O O O O O

```

---

## ⚙️ How the System Works
1. The user selects a movie from the available list.
2. The seat layout is displayed.
3. The user enters row and column numbers to book a seat.
4. If the seat is available, it gets booked (`O → X`).
5. The system prevents booking of already booked seats.
6. The user can continue booking multiple seats.
7. The program exits after booking is complete.

---

## ▶️ How to Run the Project
1. Open terminal or command prompt.
2. Navigate to the project folder.
3. Compile the program:
```

javac MovieBookingSystem.java

```
4. Run the program:
```

java MovieBookingSystem

```

---

## 📌 Sample Output
```

Welcome to Movie Booking System!
Available Movies:

1. Dhurandhar
2. Toxic
3. Ramayan
4. Maddock Horror Comedy Universe: Bhediya 2
5. YRF Alpha
6. Avengers: Doomsday
7. Spiderman: Brand New Day

Select a movie (1-7): 6
You selected: Avengers: Doomsday

Seat Layout (O = Available, X = Booked):
O O O O O
O O O O O
O O O O O
O O O O O
O O O O O

Enter row (1-5): 2
Enter column (1-5): 3
Seat booked successfully!

```

---

## ✅ Features
- Simple and user-friendly interface
- Prevents double seat booking
- Multiple seat booking allowed
- Clear seat status display
- Error handling for invalid input

---

## 🚀 Future Enhancements
- Add ticket price calculation
- Store booking details
- Add user authentication
- Improve UI using Java Swing or JavaFX
- Add multiple show timings

---

## 📄 Conclusion
The **Movie Booking System** successfully demonstrates the use of Java programming fundamentals to build a real-world application.  
It provides a clear understanding of seat management, user input handling, and program flow in a console environment.

---

## 👨‍💻 Developed By
**Sachin Ravindra Choudhary**

