import os
import requests

class CryptoPrice:
    def checkResponse(self, data, coin):
        if "error" in data:
            print(" - Unable to retrieve data for '" + coin + "'")
            exit(1)

    def getData(self, coin):
        url = "https://api.coinmarketcap.com/v1/ticker/" + coin
        response = requests.get(url)
        data = response.json()
        self.checkResponse(data, coin)

        return data[0]

    def printData(self, coin):
        print(" - Name : " + str(coin['name']))
        print(" - Price (USD) : " + str(coin['price_usd']))
        print(" - 24h Change : " + str(coin['percent_change_24h']))


def main():
    print("// Cryptocurrency Price Checker")
    
    name = raw_input("Enter coin name: ")
    cp = CryptoPrice()
    coin = cp.getData(name)
    cp.printData(coin)

main()
