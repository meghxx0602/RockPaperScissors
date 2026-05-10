# 🎮 Rock Paper Scissors (Java Console Game)

A very basic Java implementation of **Rock, Paper, Scissors** using:
- `if-else` ladder for winner logic
- `try-catch` for invalid input handling
- `Random` for computer moves

## 🚀 How to Run

```bash
javac RockPaperScissorGame.java
java RockPaperScissorGame
```

## 🕹️ Play Flow (Interactive)

When you run the game, you will see:

```text
Enter your choice 1, 2, or 3:
1.ROCK
2.PAPER
3.SCISSORS
```

Enter:
- `1` for **Rock**
- `2` for **Paper**
- `3` for **Scissors**

The computer randomly picks a number from `1` to `3`, then results are printed.

## ✅ Example Game Session

```text
Enter your choice 1, 2, or 3:
1.ROCK
2.PAPER
3.SCISSORS
2
Your choice is: 2
Computer's choice is: 1
You win!!!
Congratulations.
```

## ⚠️ Invalid Input Handling (try-catch)

If user enters non-numeric input (like `abc`), program shows:

```text
Invalid input!
Please enter only 1, 2, or 3.
```

## 🧠 Logic Used

- **Draw:** `user_choice == comp_choice`
- **User wins:**  
  - Rock beats Scissors  
  - Paper beats Rock  
  - Scissors beats Paper
- **Else:** Computer wins

## 📌 Project Type

This is a **beginner-level Java mini project** focused on core basics only.

## 👤 Author

**Shabana Mallick**
- GitHub: [@meghxx0602](https://github.com/meghxx0602)
- Linkedln: [Shabana Mallick](www.linkedin.com/in/shabana-mallick1220)

---
Dear Reader,  
Still learning, still growing, with love - Shabana ❤️
