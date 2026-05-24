Feature: Place the order for Products and check out

@PlaceOrder
Scenario Outline: Search Experience for product search in both home and offer page

Given user is on GreenCart Landing page
When user searched with Shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceed to Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place order

Examples:
|Name|
|Tom|
