Feature: Product search on Flipkart

Scenario: User finds a product

  Given User launch chrome browser
  When User opens URL "https://www.flipkart.com/"
  And User click on SearchTextBox
  And User enters "Perfumes for men" and press enter
  And User click on the product
  Then User click on Delivery Pincode Box
  And User enters "700153"
  Then User click on check button
  And close browser