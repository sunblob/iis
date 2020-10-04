var ShoppingCart = /** @class */ (function () {
    function ShoppingCart(strategy) {
        this.strategy = strategy;
    }
    ShoppingCart.prototype.setStrategy = function (strategy) {
        this.strategy = strategy;
    };
    ShoppingCart.prototype.getStrategy = function () {
        return this.strategy;
    };
    ShoppingCart.prototype.checkout = function (amount) {
        console.log(this.strategy.doAction(amount));
    };
    return ShoppingCart;
}());
var GuestStrategy = /** @class */ (function () {
    function GuestStrategy() {
    }
    GuestStrategy.prototype.doAction = function (amount) {
        return amount;
    };
    return GuestStrategy;
}());
var PremiumUserStrategy = /** @class */ (function () {
    function PremiumUserStrategy() {
    }
    PremiumUserStrategy.prototype.doAction = function (amount) {
        return amount * 0.75;
    };
    return PremiumUserStrategy;
}());
var guest = new ShoppingCart(new GuestStrategy());
guest.checkout(100);
var premUser = new ShoppingCart(new PremiumUserStrategy());
premUser.checkout(200);
