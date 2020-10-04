//Интерфейс описывающий стратегию
interface Strategy {
    doAction(amount: number): number
}

class ShoppingCart {

    private strategy: Strategy

    constructor(strategy: Strategy) {
        this.strategy = strategy
    }

    public setStrategy(strategy: Strategy) {
        this.strategy = strategy;
    }

    public getStrategy(): Strategy {
        return this.strategy
    }

    public checkout(amount: number): void {
        console.log(this.strategy.doAction(amount))
    }
}

class GuestStrategy implements Strategy {
    doAction(amount: number): number {
        return amount
    }
}

class PremiumUserStrategy implements Strategy {
    doAction(amount: number): number {
        return amount * 0.75
    }
}

const guest = new ShoppingCart(new GuestStrategy())
guest.checkout(100)

const premUser = new ShoppingCart(new PremiumUserStrategy())
premUser.checkout(200)