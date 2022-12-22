class store():
    products = {'book': 60, 'pen': 35, 'gelpen': 40, 'pencil': 5}
    
    cart = dict.fromkeys(products, 0) 

    def display(self):
        for key in self.products:
            print(key, end="\t\t")
            print(self.products[key])

    def prompt(self):
        for key in self.cart:
            print(key, end="-")
            self.cart[key] = input("Enter amount for the product ")

    def bill(self):
        net = 0
        for key in self.products:
            print(key, end="\t\t")
            print(self.cart[key], end="\t")
            print(self.products[key], end="\t\t")
            print(int(self.cart[key]) * int(self.products[key])
                  )  
            net += int(self.cart[key]) * int(self.products[key])
        print(net)


mystore = store()
mystore.display()
mystore.prompt()
mystore.bill()