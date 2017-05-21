#include <iostream>
#include <iomanip>
#include <vector>
#include <string>
using namespace std;

double wallet = 100;

struct product {
	string name;
	double price;
	int	quantity;
};

class vending {
public:
	vending();
	void menu();
	void insert(string name, double price, int quantity);

private:
	vector <product> v;

	int totalitems;
	double totalcash;
	int totalsold;

	void itemselection();
	void buy(int item);
	void vendingInfo();
};

vending::vending() {
	totalcash = 0;
	totalsold = 0;
	totalitems = 0;
}

void vending::insert(string name, double price, int quantity) {
	totalitems = totalitems + quantity;

	product p = { name, price, quantity };
	v.push_back(p);

}

void vending::buy(int item) {
	double cash;
	double change;

	cout << " - item = " << v[item].name << endl;
	cout << " - price = $" << v[item].price << endl << endl;

	cout << "Please insert cash: ";
	cin >> cash;

	if (cash < v[item].price || cash > wallet) {
		cout << "not enough money for this purchase ..." << endl;
		return;
	}

	if (v[item].name == "Waifu") {
		cout << " - *money jammed*" << endl;
		cout << " - Your waifu is shit." << endl;

		return;
	}

	totalcash = totalcash + cash;
	totalsold++;
	totalitems--;

	wallet = wallet - v[item].price;
	change = cash - v[item].price;

	v[item].quantity--;
	cout << " - Dispensing " << v[item].name << " ..." << endl;
	cout << " - Returning $" << change << " in change ... " << endl;
	cout << " - Current wallet = " << wallet << endl << endl;
}

void vending::itemselection() {
	int select;

	cout << endl;
	cout << "// Wallet = $" << wallet << endl;	
	cout << "code" << setw(10) << "item" << setw(10) << "price" << setw(10) << "quantity" << endl;
	cout << "--------------------------------------" << endl;

	if (!v.empty()) {
		for (int i = 0; i < v.size(); i++) {
			cout << i << setw(15) << v[i].name << setw(8) << v[i].price << setw(7) << v[i].quantity << endl;
		}

		cout << endl;
		cout << "Enter [code]: ";
		cin >> select;

		while (select < 0 || select > v.size() - 1) {
			cout << "invalid choice" << endl;
			cout << "Selection [?]: ";
			cin >> select;
		}

		if (v[select].quantity > 0) {
			buy(select);
		}

		else {
			cout << " - " << v[select].name << " is out of stock ... " << endl;
		}
	}

	else {
		cout << "empty" << endl;
	}
}

void vending::vendingInfo() {
	cout << "// Vending info" << endl;
	cout << " - Total items: " << totalitems << endl;
	cout << " - Total cash: " << totalcash << endl;
	cout << " - Total sold: " << totalsold << endl << endl;
}

void vending::menu() {
	int choice;

	cout << "// Main Menu" << endl;
	cout << " - [1] Vending machine" << endl;
	cout << " - [2] Vending info" << endl << endl;

	cout << "Selection [?]: ";
	cin >> choice;

	while (choice <= 0 || choice > 2) {
		cout << "invalid choice" << endl;
		cout << "Selection [?]: ";
		cin >> choice;
	}

	switch (choice) {
		default:
			break;
		case 1: 
			itemselection();
			break;
		case 2: 
			vendingInfo();
			break;
	}
}

int main() {
	char s = 'y';
	vending o;

	o.insert("Snickers", 1.25, 5);
	o.insert("Skittles", 1.25, 5);
	o.insert("Waifu", 100.00, 1);
	o.insert("Used Panties", 2.25, 5);


	while (s == 'y') {
		o.menu();
		cout << "Continue? [y/n]: ";
		cin >> s;
	}

	return 0;
}