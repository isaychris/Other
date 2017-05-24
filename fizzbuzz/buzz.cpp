#include <iostream>
#include <string>

int main() {
  for (int i = 1; i <= 100; i++) {
    if (i % 15 == 0)
      std::cout << i << + " - fizzbuzz\n";
    else if (i % 3 == 0) 
      std::cout << i << + " - fizz\n";
    else if (i % 5 == 0)
      std::cout << i << + " - buzz\n";
  }
}
