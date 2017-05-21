// ===============================================================
// Author: Seiya
// Date: 12/22/2016
// Compiler: Visual Studios

// Project: Hangman
// Version: 1.0
// Description: The best game ever.
//================================================================

using namespace std;
#include <string>
#include <vector>
#include <time.h>
#include <algorithm>
#include <iostream>

class hangman {
public:
	hangman();
	void shuffle();
	void play();

private:
	vector<string> wordList = { "WEEABOO", "ANIME", "KEYBOARD", "BASKETBALL", "FOOTBALL", "HANGMAN", "PINKGUY" };

	string hidden;
	string word;
	char letter;

	int tries = 5;
	char again = 'y';

	void guess(char letter);
	void display();
	void prompt();
};

hangman::hangman() {
	shuffle();
}

void hangman::prompt() {
	cout << endl;
	cout << "Would you like to play again? [y/n]: ";
	cin >> again;
}

void hangman::shuffle() {
	random_shuffle(wordList.begin(), wordList.end());
}

void hangman::guess(char letter) {
	if (word.find(letter) != -1) {
		for (unsigned int i = 0; i < word.length(); i++) {
			if (word.at(i) == letter) {
				hidden.at(i) = letter;
			}
		}
	}

	else {
		tries--;
		cout << " - Incorrect. Tries left: " << tries << endl;
	}
}

void hangman::display() {
	for (unsigned int i = 0; i < hidden.length(); i++) {
		cout << hidden[i] << " ";
	}
}

void hangman::play() {
	unsigned int i = 0;

	while (again == 'y' && i < wordList.size()) {
		tries = 5;

		cout << "  __________________________________________   " << endl;
		cout << "<| ======          HANGMAN           ====== |>" << endl;
		cout << "<|__________________________________________|> " << endl;
		cout << " " << endl;

		word = wordList[i++];
		hidden = string(word.size(), '_');

		while (tries > 0) {

			cout << "Your word is: "; display();
			cout << endl << endl;
			//cout << "Your word is: " << word << endl << endl;

			cout << "Guess letter: ";
			cin >> letter;
			cin.ignore(32767, '\n');

			letter = toupper(letter);
			guess(letter);

			if (hidden == word) {
				cout << " - The word was: " << word << endl;
				cout << " - You won the game! " << endl;
				break;
			}

			else if (tries == 0) {
				cout << " - The word was: " << word << endl;
				cout << " - You are dead! " << endl;
				break;
			}
		}

		cout << endl;
		cout << "Would you like to play again? [y/n]: ";
		cin >> again;
	}

	if (wordList.empty()) {
		cout << "Word bank is empty..." << endl;
	}
}

int main() {
	srand(unsigned(time(NULL)));

	hangman h;
	h.play();

	return 0;
}