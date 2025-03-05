import os

# Initialize the board
board = [[" " for _ in range(3)] for _ in range(3)]

# Function to display the board
def display_board():
    os.system("cls" if os.name == "nt" else "clear")  # Clear screen for better visibility
    print("\nTic-Tac-Toe")
    print("  1   2   3 ")
    for i, row in enumerate(board):
        print(f"{i+1} {' | '.join(row)}")
        if i < 2:
            print("  ---+---+---")

# Function to check if a player has won
def check_winner(player):
    # Check rows, columns, and diagonals
    for i in range(3):
        if all(board[i][j] == player for j in range(3)) or all(board[j][i] == player for j in range(3)):
            return True
    if all(board[i][i] == player for i in range(3)) or all(board[i][2-i] == player for i in range(3)):
        return True
    return False

# Function to check if the board is full
def is_full():
    return all(board[i][j] != " " for i in range(3) for j in range(3))

# Game loop
def play_game():
    players = ["X", "O"]
    turn = 0  # X starts first

    while True:
        display_board()
        print(f"Player {players[turn % 2]}'s turn. Enter row and column (1-3):")

        try:
            row, col = map(int, input().split())  # Taking input as "row col"
            if row < 1 or row > 3 or col < 1 or col > 3 or board[row-1][col-1] != " ":
                print("Invalid move! Try again.")
                continue  # Skip to next iteration

            board[row-1][col-1] = players[turn % 2]  # Mark the move

            if check_winner(players[turn % 2]):  # Check for winner
                display_board()
                print(f"Player {players[turn % 2]} wins! 🎉")
                break

            if is_full():  # Check for a tie
                display_board()
                print("It's a tie! 🤝")
                break

            turn += 1  # Switch turns
        except ValueError:
            print("Invalid input! Enter row and column as two numbers (e.g., 2 3).")

# Start the game
if __name__ == "__main__":
    play_game()
