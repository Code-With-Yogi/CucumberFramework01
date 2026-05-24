Feature: Search and Place the order for Products

@OffersPage
Scenario Outline: Search Experience for product search in both home and offer page

Given user is on GreenCart Landing page
When user searched with Shortname <Name> and extracted actual name of product
Then user serached for <Name> shortname in offers page 
And validate product name in offers page matches with Landing Page 

Examples:
|Name|
|Tom|
|Beet|