//Author: iSayChris
//Program: Simulates the mega million lottery.
//Date: 1/13/16

#include <stdlib.h>
#include <time.h> 
#include <iostream>
#include <climits>

using namespace std;

const int whiteball_MAX = 70;
const int powerball_MAX = 26;
const int matchCounter_MAX = 6;
int whiteball[whiteball_MAX];

int winning[6];
int ticket[6];

int ticketCounter;
int matchCounter;
int maxCounter;

void fillArrayBalls();
void shuffleBalls();
void generateWinningNumbers();
void checkNumbers();

int main() {
	srand(time(NULL));

	fillArrayBalls();
	generateWinningNumbers();

	cout << "// Powerball lottery" << endl;
	cout << "// Match all 6 numbers and win 1.5 Billion dollars!" << endl << endl;

	cout << "Winning numbers: " << winning[0] << " " << winning[1] << " " << winning[2] << " " << winning[3] << " " << winning[4] << " PWR " << winning[5] << endl;

	cout << "--------------------------------------" << endl;
	cout << "Generating tickets, please wait..." << endl << endl;

	while (matchCounter != matchCounter_MAX) {
		shuffleBalls();
		matchCounter = 0;

		for (int i = 0; i < 5; i++) {
			ticket[i] = whiteball[i];
		}

		ticket[5] = rand() % powerball_MAX + 1;

		checkNumbers();

		if (ticketCounter > INT_MAX) {
			maxCounter++;
			ticketCounter = 0;
		}

		ticketCounter++;

	}

	cout << "|------------Lottery Ticket------------|" << endl;
	cout << " Your numbers:     " << ticket[0] << " " << ticket[1] << " " << ticket[2] << " " << ticket[3] << " " << ticket[4] << " PWR " << ticket[5] << endl << endl;

	cout << " Total matched:    " << matchCounter << endl;
	cout << " Total tickets used: " << (maxCounter * INT_MAX ) + ticketCounter << endl;
  	cout << " Total money spent: $" << ((maxCounter * INT_MAX ) + ticketCounter) * 2 << endl;

	cout << "|--------------------------------------|" << endl << endl;

	cout << "Congratulations, you're a winner!" << endl << endl;

	return 0;
}

void generateWinningNumbers() { //generates the winning numbers.
	shuffleBalls();

	for (int i = 0; i < 5; i++) {
		winning[i] = whiteball[i];
	}

	winning[5] = rand() % powerball_MAX + 1;
}

void fillArrayBalls() { //fills whiteball and powerball arrays with numbers.
	for (int i = 0; i < whiteball_MAX; i++) {
		whiteball[i] = i + 1;
	}
}

void shuffleBalls() { //shuffles the whiteballs.
	for (int i = 0; i < whiteball_MAX; i++) {
		int temp = whiteball[i];
		int randomIndex = rand() % whiteball_MAX + 1;

		whiteball[i] = whiteball[randomIndex];
		whiteball[randomIndex] = temp;
	}
}

void checkNumbers() {   //checks if any numbers match.
	for (int i = 0; i < 5; i++) {
		if (ticket[i] == winning[0]) {
			matchCounter++;
		}
		else if (ticket[i] == winning[1]) {
			matchCounter++;
		}
		else if (ticket[i] == winning[2]) {
			matchCounter++;
		}
		else if (ticket[i] == winning[3]) {
			matchCounter++;
		}
		else if (ticket[i] == winning[4]) {
			matchCounter++;
		}
	}

	if (ticket[5] == winning[5]) {
		matchCounter++;
	}
}
