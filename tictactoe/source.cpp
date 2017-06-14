#include <iostream>
#include <string>

// struct for a player
struct player {
	std::string name;
	char piece;
	bool turn;

	// constructor to set up player
	player(std::string n, char p, bool t) {
		name = n;
		piece = p;
		turn = t;
	}
};

// game class
class tictactoe {
public:
	tictactoe();
	char grid[9] = { '1', '2', '3',
					 '4', '5', '6',
					 '7', '8', '9' , };
	void input();
	void display();
	void update();
	void message();
	bool running;
	int remaining = 9;

private:
	player * p1;
	player * p2;

	std::string winner;

	int check();
};

// displays the board
void tictactoe::display() {
	using namespace std;

	cout << "  Tic Tac Toe" << endl;
	cout << " | " << grid[0] << " | " << grid[1] << " | " << grid[2] << " | " << endl;
	cout << " | " << grid[3] << " | " << grid[4] << " | " << grid[5] << " | " << endl;
	cout << " | " << grid[6] << " | " << grid[7] << " | " << grid[8] << " | " << endl;
	cout << "------------------" << endl;
}

// player input
void tictactoe::input() {
	int pos;

	if (p1->turn) {
		std::cout << p1->name << "[" << p1->piece << "], enter location: "; std::cin >> pos;
		grid[pos - 1] = p1->piece;

		while (std::cin.fail() || pos > 9 || pos < 1)
		{
			std::cout << "invalid, enter again: " << std::endl;
			std::cin >> pos;
			std::cin.ignore(10000, '\n');
			std::cin.clear();
		}

		p1->turn = false;
		p2->turn = true;
	}
	else if (p2->turn) {
		std::cout << p2->name << "[" << p2->piece << "], enter location: "; std::cin >> pos;
		grid[pos - 1] = p2->piece;

		p1->turn = true;
		p2->turn = false;
	}

	remaining--;
}

// checks the board for horizontal, vertical or diagnol wins.
// returns 1 if player wins, 2 if player 2 wins, and -1 if nothing
int tictactoe::check() {
	if (grid[0] == grid[1] && grid[1] == grid[2])
		return (grid[0] == 'X' ? 1 : 2);
	else if (grid[3] == grid[4] && grid[4] == grid[5])
		return (grid[3] == 'X' ? 1 : 2);
	else if (grid[6] == grid[7] && grid[7] == grid[8])
		return (grid[6] == 'X' ? 1 : 2);
	else if (grid[0] == grid[3] && grid[3] == grid[6])
		return (grid[0] == 'X' ? 1 : 2);
	else if (grid[1] == grid[4] && grid[4] == grid[7])
		return (grid[1] == 'X' ? 1 : 2);
	else if (grid[2] == grid[5] && grid[5] == grid[8])
		return (grid[2] == 'X' ? 1 : 2);

	else if (grid[0] == grid[4] && grid[4] == grid[8])
		return (grid[0] == 'X' ? 1 : 2);
	else if (grid[6] == grid[4] && grid[4] == grid[2])
		return (grid[6] == 'X' ? 1 : 2);

	return -1;
}



// looks at the status of the game and updates accordingly.
void tictactoe::update() {
	int status = check();

	// checks if there is a winner
	if (status == 1 || status == 2) {
		winner = (status == 1 ? p1->name : p2->name);
		running = false;
	}

	// if each player has no more turns, there is no winner.
	if (remaining == 0) {
		running = false;
	}
}

void tictactoe::message()
{
	display();
	if (remaining == 0)
		std::cout << " - Its a draw!" << std::endl;

	else 
	std::cout << " - The winner is " << winner << std::endl;

}

tictactoe::tictactoe()
{
	// creating players
	p1 = new player("player 1", 'X', true);
	p2 = new player("player 2", 'O', false);

	running = true;
}


void clear() {
	system("cls");
}

int main() {
	tictactoe game;

	while (game.running) {
		game.display();
		game.input();
		game.update();
		clear();
	}

	game.message();
}
