//Author: iSayChris
//Program: Simulates the mega million lottery.
//Date: 1/13/16

#include <stdlib.h>
#include <time.h> 
#include <iostream>
#include <climits>
#include <set>

using namespace std;

int winning[5];
int ticket[5];
int winning_powerball;
int ticket_powerball;

int matchCounter = 0;

const int whiteball_MAX = 70;
const int powerball_MAX = 26;

int whiteball[whiteball_MAX];

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

	cout << "Winning numbers: " << winning[0] << " " << winning[1] << " " << winning[2] << " " << winning[3] << " " << winning[4] << " PWR " << winning_powerball << endl;

	cout << "--------------------------------------" << endl;
	cout << "Generating tickets, please wait..." << endl << endl;

  shuffleBalls();

  for (int i = 0; i < 5; i++) {
    ticket[i] = whiteball[i];
  }
  ticket_powerball = rand() % powerball_MAX + 1;
  
  set<int> s(ticket, ticket + sizeof(ticket)/ticket[0]);

  for (int i = 0; i < 5; i++) {
    if (s.count(winning[i])) {
      matchCounter++;
    } 
  }

  if (ticket_powerball == winning_powerball) {
    matchCounter++;
  }

	cout << "|------------Lottery Ticket------------|" << endl;
	cout << " Your numbers:     " << ticket[0] << " " << ticket[1] << " " << ticket[2] << " " << ticket[3] << " " << ticket[4] << " PWR " << ticket_powerball << endl << endl;

	cout << " Total matched:    " << matchCounter << endl;
	cout << "|--------------------------------------|" << endl << endl;

  if(matchCounter == 6) {
    cout << "You matched all 6 numbers! You're a billionare!";
  } else {
    cout << "You lose. Try again." << endl;
  }
	return 0;
}

void generateWinningNumbers() { //generates the winning numbers.
	shuffleBalls();

	for (int i = 0; i < 5; i++) {
		winning[i] = whiteball[i];
	}

	winning_powerball = rand() % powerball_MAX + 1;
}

void fillArrayBalls() { //fills whiteball arrays with numbers.
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
