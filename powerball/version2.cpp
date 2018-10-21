//Author: iSayChris
//Program: Simulates the powerball lottery.
//Date: 1/13/16

#include <stdlib.h>
#include <time.h>
#include <iostream>
#include <climits>

using namespace std;

const int whiteball_MAX = 70;
const int powerball_MAX = 26;
const int match_MAX = 6;

class Lottery {
private:
    int winning[6];
    int ticket[6];
    int whiteball[whiteball_MAX];

    int ticketCounter = 0;
    int matchCounter = 0;
    int maxCounter = 0;

    void fillArrayBalls();
    void shuffleBalls();
    void generateWinningNumbers();
    void checkNumbers();

public:
    Lottery()
    {
        fillArrayBalls();
        generateWinningNumbers();
    }

    void generateTicket();
    void displayWinningNumbers();
    void displayTicket();
};

int main()
{
    srand(time(NULL));

    cout << "// Powerball lottery" << endl;
    cout << "// Match all 6 numbers and win 1.5 Billion dollars!" << endl
         << endl;

    Lottery l;
    l.displayWinningNumbers();

    cout << "--------------------------------------" << endl;
    cout << "Generating tickets, please wait..." << endl
         << endl;

    l.generateTicket();
    l.displayTicket();

    return 0;
}

//generates tickets
void Lottery::generateTicket()
{
    shuffleBalls();

    for (int i = 0; i < 5; i++) {
        ticket[i] = whiteball[i];
    }

    ticket[5] = rand() % powerball_MAX + 1;

    checkNumbers();
}

//generates the winning numbers.
void Lottery::generateWinningNumbers()
{
    shuffleBalls();

    for (int i = 0; i < 5; i++) {
        winning[i] = whiteball[i];
    }

    winning[5] = rand() % powerball_MAX + 1;
}

//fills whiteball with numbers.
void Lottery::fillArrayBalls()
{
    for (int i = 0; i < whiteball_MAX; i++) {
        whiteball[i] = i + 1;
    }
}

//shuffles the whiteballs.
void Lottery::shuffleBalls()
{
    for (int i = 0; i < whiteball_MAX; i++) {
        int temp = whiteball[i];
        int randomIndex = rand() % whiteball_MAX;

        whiteball[i] = whiteball[randomIndex];
        whiteball[randomIndex] = temp;
    }
}

//checks if any numbers match.
void Lottery::checkNumbers()
{
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

//displays winning numbers
void Lottery::displayWinningNumbers()
{
    cout << "Winning numbers: " << winning[0] << " " << winning[1] << " " << winning[2] << " " << winning[3] << " " << winning[4] << " PWR " << winning[5] << endl;
}

//displays ticket results
void Lottery::displayTicket()
{
    cout << "|------------Lottery Ticket------------|" << endl;
    cout << " Your numbers:     " << ticket[0] << " " << ticket[1] << " " << ticket[2] << " " << ticket[3] << " " << ticket[4] << " PWR " << ticket[5] << endl
         << endl;

    cout << " Total matched:    " << matchCounter << endl;
    cout << "|--------------------------------------|" << endl
         << endl;

    if (matchCounter == 6) {
        cout << "You matched all 6 numbers! You're a billionare!";
    }
    else {
        cout << "You lose. Try again." << endl;
    }
}
