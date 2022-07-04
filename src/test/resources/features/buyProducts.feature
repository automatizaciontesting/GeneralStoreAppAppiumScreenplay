Feature: As user, I want to buy some items

  Scenario: Buy some items in General Store
    Given "Anna" has a list of producto
    When select the products and add to cart
      | Product |
      | PG 3    |
      |   Jordan Lift Off      |
    Then validate the products
    And total amount in the cart
    And navigate on webview