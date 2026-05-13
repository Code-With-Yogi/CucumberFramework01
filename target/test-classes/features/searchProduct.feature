Feature: Search and Place the order for Products

Scenario: Search Experience for product search in both home and offer page

Given user is on GreenCart Landing page
When user searched with Shortname "tom" and extracted actual name of product
Then user serached for "tom" shortname in offers page 
And validate product name in offers page matches with Landing Page 